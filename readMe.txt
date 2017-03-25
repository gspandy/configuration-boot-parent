springboot项目中配置文件的切换
如：开发环境使用某个配置文件，生产环境使用某个配置文件

http://www.cnblogs.com/java-zhao/p/5469183.html

https://my.oschina.net/u/2391658/blog/734755


##结论
各个环境公共的配置写在application.properties中
各个模块独有的配置则配置在自己的application-{xxx}.properties文件中

若application.properties中配置的是spring.profiles.active=dev
则程序读取的时候优先读取application-dev.properties中的配置，若读不到才会从application.properties去读


在springboot测试时：
java.lang.IllegalStateException: Unable to find a @SpringBootConfiguration, you need to use @ContextConfiguration or @SpringBootTest(classes=...) with your test

You have to have a config in a package or subpackage of test class or directly pass config class to @ContextConfiguration or @SpringBootTest or have class annotated with @SpringBootApplication.

http://stackoverflow.com/questions/40215606/unable-to-find-a-springbootconfiguration-in-spring-boot-test-1-4