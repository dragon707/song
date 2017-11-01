package com.zheng.cms.controller;

import com.zheng.cms.dao.model.CmsArticle;
import com.zheng.cms.dao.model.CmsArticleExample;
import com.zheng.cms.service.CmsArticleService;
import com.zheng.common.util.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

/**
 * Created by liusong on 2017/11/1.
 */
@Controller
@RequestMapping("/article")
public class CmsArticleController extends BaseController {

    private final static Logger _log = LoggerFactory.getLogger(CmsArticleController.class);

    @Autowired
    private CmsArticleService cmsArticleService;

    /**
     * 首页
     */
    @RequestMapping("")
    public String index() {
        return "redirect:/article/list";
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public String list(
            @RequestParam(required = false, defaultValue = "1", value = "page")int page,
            @RequestParam(required = false, defaultValue = "20", value = "rows")int rows,
            HttpServletRequest request, Model model) {

        CmsArticleExample cmsArticleExample = new CmsArticleExample();
        cmsArticleExample.setOffset((page-1)*rows);
        cmsArticleExample.setLimit(rows);
        cmsArticleExample.setOrderByClause("articleld desc");
        List<CmsArticle> articles = cmsArticleService.getMapper().selectByExample(cmsArticleExample);

        long total = cmsArticleService.getMapper().countByExample(cmsArticleExample);
        Paginator paginator = new Paginator(total, page, rows, request);

        model.addAttribute("articles", articles);
        model.addAttribute("paginator", paginator);
        return "/article/list";
    }

    /**
     * 新增get
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(){
        return "/article/add";
    }

    /**
     * 新增post
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@Valid CmsArticle cmsArticle, BindingResult binding){
        if(binding.hasErrors()){
            for(ObjectError error:binding.getAllErrors()){
                _log.error(error.getDefaultMessage());
            }
            return "/article/add";
        }
        cmsArticle.setCtime(System.currentTimeMillis());
        cmsArticleService.getMapper().insertSelective(cmsArticle);
        _log.info("新增记录id为：{}", cmsArticle.getArticleId());
        return "redirect:/article/list";
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id){
        cmsArticleService.getMapper().deleteByPrimaryKey(id);
        return "redirect:/article/list";
    }

    /**
     * 修改get
     */
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") int id, Model model){
        model.addAttribute("article", cmsArticleService.getMapper().selectByPrimaryKey(id));
        return "/article/update";
    }

    /**
     * 修改post
     */
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String update(@PathVariable("id") int id, @Valid CmsArticle cmsArticle, BindingResult binding, Model model){
        if(binding.hasErrors()){
            model.addAttribute("errors", binding.getAllErrors());
            return "/article/update/"+id;
        }
        cmsArticleService.getMapper().updateByPrimaryKeySelective(cmsArticle);
        return "redirect:/article/list";
    }

}
