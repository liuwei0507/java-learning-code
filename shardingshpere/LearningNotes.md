1、springboot 集成mybatis
1) config: 
a. properties: 
    mybatis.config-locations=classpath:mybatis-config.xml
    # must have this config
    # 否则会报错  Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required
    mybatis.mapper-locations=classpath:mappers/*.xml
b.mybatis-config.xml

2、集成分表
1）版本问题
a.  'org.apache.shardingsphere:sharding-jdbc-spring-boot-starter:4.0.0-RC1'以上版本会报错
    Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required

b. lambok在此版本下不可用，原因还不清楚 --- 行为：没有任何报错，gradle build的时候会报错

2）配置问题
需要配置默认的datasourcename
spring.shardingsphere.sharding.default-data-source-name=ds0
否则会报错
Missing the data source name: 'null'

3 分布式事务
XA
1) InlineExpressionParser ClassNoDefException
    将版本统一成 4.0.0
    implementation 'org.apache.shardingsphere:sharding-jdbc-spring-boot-starter:4.0.0'
        implementation 'org.apache.shardingsphere:sharding-transaction-xa-core:4.0.0'

2）MysqlXAException: XAER_RMERR
    修改MySQL权限
    GRANT XA_RECOVER_ADMIN ON *.* TO root@'%';
    FLUSH PRIVILEGES;

3）Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required
    注释掉 //    implementation 'com.alibaba:druid-spring-boot-starter:1.2.1'
    driverclass使用 ： com.zaxxer.hikari.HikariDataSource
    相应url替换成jdbc-url
