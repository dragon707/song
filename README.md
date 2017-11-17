## zheng

# 介绍
``` lua
zheng
├── zheng-common -- 公共模块
├── zheng-upms -- 通用用户权限系统
|    ├── zheng-upms-dao -- 数据库MyBatisGenerator操作
|    ├── zheng-upms-service -- 业务逻辑
|    └── zheng-upms-admin -- 后台管理
├── zheng-cms -- 内容管理系统
|    ├── zheng-cms-dao -- 数据库MyBatisGenerator操作
|    ├── zheng-cms-service -- 业务逻辑
|    ├── zheng-cms-search -- 搜索服务
|    ├── zheng-cms-job -- 消息队列、任务调度等
|    ├── zheng-cms-admin -- 后台管理
|    └── zheng-cms-web -- 网站前台
├── zheng-pay -- 支付系统
|    ├── zheng-pay-dao -- 数据库MyBatisGenerator操作
|    ├── zheng-pay-service -- 业务逻辑
|    ├── zheng-pay-sdk -- 开发工具包
|    ├── zheng-pay-admin -- 后台管理
|    └── zheng-pay-web -- 演示示例
├── zheng-ucenter -- 用户系统
|    ├── zheng-ucenter-dao -- 数据库MyBatisGenerator操作
|    ├── zheng-ucenter-service -- 业务逻辑
|    └── zheng-ucenter-home -- 网站前台
|── zheng-wechat-mp -- 微信公众号管理系统
|    ├── zheng-wechat-mp-dao -- 数据库MyBatisGenerator操作
|    ├── zheng-wechat-mp-service -- 业务逻辑
|    └── zheng-wechat-mp-admin -- 后台管理
├── zheng-api -- 接口系统
|    ├── zheng-api-sdk -- 开发工具包
|    └── zheng-api-example -- 演示示例
└── zheng-oss -- 对象存储系统
     ├── zheng-oss-sdk -- 开发工具包
     └── zheng-oss-web -- 管理界面
```

# 后端技术:
* Spring Framework
* SpringMVC: MVC框架
* MyBatis: ORM框架
* MyBatis Generator: 代码生成
* Druid: 数据库连接池
* Spring secutity|Shiro: 权限认证
* Thymeleaf: 模板引擎
* ZooKeeper: 协调服务
* Dubbo: 远程服务调用
* TBSchedule: 任务调度
* Quartz: 定时任务
* Ehcache: 二级缓存
* Redis: 分布式缓存数据库
* ActiveMQ: 消息队列
* Solr|Elasticsearch: 检索
* Maven: 项目管理(Gradle)
* Qiniu|AliOSS: 云存储
* Jenkins: 持续集成
* Log4J: 日志管理
* Protobuf|json: 数据传输
* Spring-boot
* Swagger2: 接口文档
* FastDFS: 分布式文件系统


# 前端技术:
* jQuery
* Bootstrap
* jQuery EasyUI
* AngularJs
* Webpack
* Node.js
* Electron
* NW.js(Node-Webkit)
* Material Design


# 开发环境:
* MySql: 数据库
* jetty: 开发服务器
* Tomcat: 应用服务器
* SVN|Git: 版本管理
* Nginx: 反向代理服务器
* Varnish: 内存缓存
* Navicat for MySQL: 数据库客户端管理
* IntelliJ IDEA: 开发IDE
* PowerDesigner: 建模工具

# 资源链接
* Maven [http://maven.apache.org/download.cgi](http://maven.apache.org/download.cgi "Maven")
* Redis [https://redis.io/download](https://redis.io/download "Redis")
* ActiveMQ [http://activemq.apache.org/download-archives.html](http://activemq.apache.org/download-archives.html "ActiveMQ")
* ZooKeeper [http://www.apache.org/dyn/closer.cgi/zookeeper/](http://www.apache.org/dyn/closer.cgi/zookeeper/ "ZooKeeper")
* Jenkins [http://updates.jenkins-ci.org/download/war/](http://updates.jenkins-ci.org/download/war/ "Jenkins")

# 数据模型
![数据库模型](DataModelDiagram/zheng.png)
