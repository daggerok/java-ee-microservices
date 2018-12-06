FROM daggerok/jboss-eap-7.1:7.1.5-alpine
# debug
RUN echo "JAVA_OPTS=\"\$JAVA_OPTS -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005\"" >> ${JBOSS_HOME}/bin/standalone.conf
EXPOSE 5005
# health check
HEALTHCHECK --timeout=1s --retries=99 \
        CMD wget -q --spider http://127.0.0.1:8080/blog/health \
         || exit 1
# deployment
ADD ./target/*.war ${JBOSS_HOME}/standalone/deployments/blog.war
