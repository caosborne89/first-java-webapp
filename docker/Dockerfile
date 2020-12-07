FROM tomcat:7-jdk8

RUN mkdir -p /usr/local/tomcat/webapps/ch1/WEB-INF/classes && \
    mkdir -p /usr/local/tomcat/webapps/ch1/WEB-INF/lib

COPY deploy-servlet /usr/local/bin/deploy-servlet

RUN chmod u+x,g+x /usr/local/bin/deploy-servlet