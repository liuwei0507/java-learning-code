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

3 �ֲ�ʽ����
XA
1) InlineExpressionParser ClassNoDefException
    ���汾ͳһ�� 4.0.0
    implementation 'org.apache.shardingsphere:sharding-jdbc-spring-boot-starter:4.0.0'
        implementation 'org.apache.shardingsphere:sharding-transaction-xa-core:4.0.0'

2��MysqlXAException: XAER_RMERR
    �޸�MySQLȨ��
    GRANT XA_RECOVER_ADMIN ON *.* TO root@'%';
    FLUSH PRIVILEGES;

3��Property 'sqlSessionFactory' or 'sqlSessionTemplate' are required
    ע�͵� //    implementation 'com.alibaba:druid-spring-boot-starter:1.2.1'
    driverclassʹ�� �� com.zaxxer.hikari.HikariDataSource
    ��Ӧurl�滻��jdbc-url
