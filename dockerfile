FROM openjdk:8u265-jre-slim

VOLUME /tmp

EXPOSE 7970 8070

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

WORKDIR /opt/server

COPY target/txlcn-manager-1.0-SNAPSHOT.jar /opt/server/txlcn-manager.jar

ENTRYPOINT ["java","-jar","txlcn-manager.jar"]
