1��springboot ����mybatis
1) config: 
a. properties: 
    mybatis.config-locations=classpath:mybatis-config.xml
    # must have this config
    # ����ᱨ��  Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required
    mybatis.mapper-locations=classpath:mappers/*.xml
b.mybatis-config.xml

2�����ɷֱ�
1���汾����
a.  'org.apache.shardingsphere:sharding-jdbc-spring-boot-starter:4.0.0-RC1'���ϰ汾�ᱨ��
    Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required

b. lambok�ڴ˰汾�²����ã�ԭ�򻹲���� --- ��Ϊ��û���κα���gradle build��ʱ��ᱨ��

2����������
��Ҫ����Ĭ�ϵ�datasourcename
spring.shardingsphere.sharding.default-data-source-name=ds0
����ᱨ��
Missing the data source name: 'null'
