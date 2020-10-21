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
