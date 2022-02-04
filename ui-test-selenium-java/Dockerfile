FROM selenium/node-chrome
USER root
COPY ./build/libs/ui-test-selenium-java-1.0-SNAPSHOT-all.jar /test-runner/run.jar
VOLUME ["/test-cases"]
WORKDIR /test-runner
CMD java -cp './run.jar:/test-cases/*' hu.testrunner.TestRunner