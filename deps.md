[INFO] Scanning for projects...
[INFO] 
[INFO] --------------------------< com.example:demo >--------------------------
[INFO] Building demo 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-dependency-plugin:3.1.1:tree (default-cli) @ demo ---
[INFO] com.example:demo:jar:0.0.1-SNAPSHOT
[INFO] +- org.springframework.boot:spring-boot-starter-jdbc:jar:2.2.2.RELEASE:compile
[INFO] |  +- com.zaxxer:HikariCP:jar:3.4.1:compile
[INFO] |  |  \- org.slf4j:slf4j-api:jar:1.7.29:compile
[INFO] |  \- org.springframework:spring-jdbc:jar:5.2.2.RELEASE:compile
[INFO] |     +- org.springframework:spring-beans:jar:5.2.2.RELEASE:compile
[INFO] |     \- org.springframework:spring-tx:jar:5.2.2.RELEASE:compile
[INFO] +- org.springframework.boot:spring-boot-starter-thymeleaf:jar:2.2.2.RELEASE:compile
[INFO] |  +- org.thymeleaf:thymeleaf-spring5:jar:3.0.11.RELEASE:compile
[INFO] |  |  \- org.thymeleaf:thymeleaf:jar:3.0.11.RELEASE:compile
[INFO] |  |     +- org.attoparser:attoparser:jar:2.0.5.RELEASE:compile
[INFO] |  |     \- org.unbescape:unbescape:jar:1.1.6.RELEASE:compile
[INFO] |  \- org.thymeleaf.extras:thymeleaf-extras-java8time:jar:3.0.4.RELEASE:compile
[INFO] +- org.springframework.boot:spring-boot-starter-web:jar:2.2.2.RELEASE:compile
[INFO] |  +- org.springframework.boot:spring-boot-starter-json:jar:2.2.2.RELEASE:compile
[INFO] |  |  +- com.fasterxml.jackson.core:jackson-databind:jar:2.10.1:compile
[INFO] |  |  |  +- com.fasterxml.jackson.core:jackson-annotations:jar:2.10.1:compile
[INFO] |  |  |  \- com.fasterxml.jackson.core:jackson-core:jar:2.10.1:compile
[INFO] |  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jdk8:jar:2.10.1:compile
[INFO] |  |  +- com.fasterxml.jackson.datatype:jackson-datatype-jsr310:jar:2.10.1:compile
[INFO] |  |  \- com.fasterxml.jackson.module:jackson-module-parameter-names:jar:2.10.1:compile
[INFO] |  +- org.springframework.boot:spring-boot-starter-validation:jar:2.2.2.RELEASE:compile
[INFO] |  |  +- jakarta.validation:jakarta.validation-api:jar:2.0.1:compile
[INFO] |  |  \- org.hibernate.validator:hibernate-validator:jar:6.0.18.Final:compile
[INFO] |  |     +- org.jboss.logging:jboss-logging:jar:3.4.1.Final:compile
[INFO] |  |     \- com.fasterxml:classmate:jar:1.5.1:compile
[INFO] |  +- org.springframework:spring-web:jar:5.2.2.RELEASE:compile
[INFO] |  \- org.springframework:spring-webmvc:jar:5.2.2.RELEASE:compile
[INFO] |     +- org.springframework:spring-aop:jar:5.2.2.RELEASE:compile
[INFO] |     +- org.springframework:spring-context:jar:5.2.2.RELEASE:compile
[INFO] |     \- org.springframework:spring-expression:jar:5.2.2.RELEASE:compile
[INFO] +- org.springframework.boot:spring-boot-starter-jetty:jar:2.2.2.RELEASE:compile
[INFO] |  +- jakarta.servlet:jakarta.servlet-api:jar:4.0.3:compile
[INFO] |  +- jakarta.websocket:jakarta.websocket-api:jar:1.1.2:compile
[INFO] |  +- org.eclipse.jetty:jetty-servlets:jar:9.4.24.v20191120:compile
[INFO] |  |  +- org.eclipse.jetty:jetty-continuation:jar:9.4.24.v20191120:compile
[INFO] |  |  +- org.eclipse.jetty:jetty-http:jar:9.4.24.v20191120:compile
[INFO] |  |  +- org.eclipse.jetty:jetty-util:jar:9.4.24.v20191120:compile
[INFO] |  |  \- org.eclipse.jetty:jetty-io:jar:9.4.24.v20191120:compile
[INFO] |  +- org.eclipse.jetty:jetty-webapp:jar:9.4.24.v20191120:compile
[INFO] |  |  +- org.eclipse.jetty:jetty-xml:jar:9.4.24.v20191120:compile
[INFO] |  |  \- org.eclipse.jetty:jetty-servlet:jar:9.4.24.v20191120:compile
[INFO] |  |     \- org.eclipse.jetty:jetty-security:jar:9.4.24.v20191120:compile
[INFO] |  |        \- org.eclipse.jetty:jetty-server:jar:9.4.24.v20191120:compile
[INFO] |  +- org.eclipse.jetty.websocket:websocket-server:jar:9.4.24.v20191120:compile
[INFO] |  |  +- org.eclipse.jetty.websocket:websocket-common:jar:9.4.24.v20191120:compile
[INFO] |  |  |  \- org.eclipse.jetty.websocket:websocket-api:jar:9.4.24.v20191120:compile
[INFO] |  |  +- org.eclipse.jetty.websocket:websocket-client:jar:9.4.24.v20191120:compile
[INFO] |  |  |  \- org.eclipse.jetty:jetty-client:jar:9.4.24.v20191120:compile
[INFO] |  |  \- org.eclipse.jetty.websocket:websocket-servlet:jar:9.4.24.v20191120:compile
[INFO] |  +- org.eclipse.jetty.websocket:javax-websocket-server-impl:jar:9.4.24.v20191120:compile
[INFO] |  |  +- org.eclipse.jetty:jetty-annotations:jar:9.4.24.v20191120:compile
[INFO] |  |  |  +- org.eclipse.jetty:jetty-plus:jar:9.4.24.v20191120:compile
[INFO] |  |  |  +- org.ow2.asm:asm:jar:7.2:compile
[INFO] |  |  |  \- org.ow2.asm:asm-commons:jar:7.2:compile
[INFO] |  |  |     +- org.ow2.asm:asm-tree:jar:7.2:compile
[INFO] |  |  |     \- org.ow2.asm:asm-analysis:jar:7.2:compile
[INFO] |  |  \- org.eclipse.jetty.websocket:javax-websocket-client-impl:jar:9.4.24.v20191120:compile
[INFO] |  \- org.mortbay.jasper:apache-el:jar:8.5.49:compile
[INFO] +- org.springframework.boot:spring-boot-starter:jar:2.2.2.RELEASE:compile
[INFO] |  +- org.springframework.boot:spring-boot:jar:2.2.2.RELEASE:compile
[INFO] |  +- org.springframework.boot:spring-boot-autoconfigure:jar:2.2.2.RELEASE:compile
[INFO] |  +- jakarta.annotation:jakarta.annotation-api:jar:1.3.5:compile
[INFO] |  +- org.springframework:spring-core:jar:5.2.2.RELEASE:compile
[INFO] |  |  \- org.springframework:spring-jcl:jar:5.2.2.RELEASE:compile
[INFO] |  \- org.yaml:snakeyaml:jar:1.25:runtime
[INFO] +- org.springframework.boot:spring-boot-starter-log4j2:jar:2.2.2.RELEASE:compile
[INFO] |  +- org.apache.logging.log4j:log4j-slf4j-impl:jar:2.12.1:compile
[INFO] |  |  \- org.apache.logging.log4j:log4j-api:jar:2.12.1:compile
[INFO] |  +- org.apache.logging.log4j:log4j-core:jar:2.12.1:compile
[INFO] |  +- org.apache.logging.log4j:log4j-jul:jar:2.12.1:compile
[INFO] |  \- org.slf4j:jul-to-slf4j:jar:1.7.29:compile
[INFO] +- org.springframework.boot:spring-boot-devtools:jar:2.2.2.RELEASE:runtime (optional) 
[INFO] +- mysql:mysql-connector-java:jar:8.0.18:runtime
[INFO] +- org.projectlombok:lombok:jar:1.18.10:compile (optional) 
[INFO] \- org.springframework.boot:spring-boot-starter-test:jar:2.2.2.RELEASE:test
[INFO]    +- org.springframework.boot:spring-boot-test:jar:2.2.2.RELEASE:test
[INFO]    +- org.springframework.boot:spring-boot-test-autoconfigure:jar:2.2.2.RELEASE:test
[INFO]    +- com.jayway.jsonpath:json-path:jar:2.4.0:test
[INFO]    |  \- net.minidev:json-smart:jar:2.3:test
[INFO]    |     \- net.minidev:accessors-smart:jar:1.2:test
[INFO]    +- jakarta.xml.bind:jakarta.xml.bind-api:jar:2.3.2:test
[INFO]    |  \- jakarta.activation:jakarta.activation-api:jar:1.2.1:test
[INFO]    +- org.junit.jupiter:junit-jupiter:jar:5.5.2:test
[INFO]    |  +- org.junit.jupiter:junit-jupiter-api:jar:5.5.2:test
[INFO]    |  |  +- org.apiguardian:apiguardian-api:jar:1.1.0:test
[INFO]    |  |  +- org.opentest4j:opentest4j:jar:1.2.0:test
[INFO]    |  |  \- org.junit.platform:junit-platform-commons:jar:1.5.2:test
[INFO]    |  +- org.junit.jupiter:junit-jupiter-params:jar:5.5.2:test
[INFO]    |  \- org.junit.jupiter:junit-jupiter-engine:jar:5.5.2:test
[INFO]    |     \- org.junit.platform:junit-platform-engine:jar:1.5.2:test
[INFO]    +- org.mockito:mockito-junit-jupiter:jar:3.1.0:test
[INFO]    +- org.assertj:assertj-core:jar:3.13.2:test
[INFO]    +- org.hamcrest:hamcrest:jar:2.1:test
[INFO]    +- org.mockito:mockito-core:jar:3.1.0:test
[INFO]    |  +- net.bytebuddy:byte-buddy:jar:1.10.4:test
[INFO]    |  +- net.bytebuddy:byte-buddy-agent:jar:1.10.4:test
[INFO]    |  \- org.objenesis:objenesis:jar:2.6:test
[INFO]    +- org.skyscreamer:jsonassert:jar:1.5.0:test
[INFO]    |  \- com.vaadin.external.google:android-json:jar:0.0.20131108.vaadin1:test
[INFO]    +- org.springframework:spring-test:jar:5.2.2.RELEASE:test
[INFO]    \- org.xmlunit:xmlunit-core:jar:2.6.3:test
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.456 s
[INFO] Finished at: 2019-12-14T20:58:30+08:00
[INFO] ------------------------------------------------------------------------
