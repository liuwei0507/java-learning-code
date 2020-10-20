1、springboot 集成mybatis
1) config: 
a. properties: 
    mybatis.config-locations=classpath:mybatis-config.xml
    # must have this config
    # 否则会报错  Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required
    mybatis.mapper-locations=classpath:mappers/*.xml
b.mybatis-config.xml

