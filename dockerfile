FROM dvmarques/openjdk-17-jdk-alpine-with-timezone
# set the base image to use for the container
WORKDIR  /demo
ADD  variables.java  /demo/
RUN javac  variables.java
CMD [ "java","variables" ]


