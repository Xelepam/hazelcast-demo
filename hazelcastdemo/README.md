#Hazelcast + SpringBoot
SpringBoot + Hazelcast application.

#To Run
Add the following dependency to your build.gradle: compile 'com.hazelcast:hazelcast:3.11.2'

Next, download zip file for "Management Center 3.11.3" from: https://hazelcast.org/download/

In a terminal:
cd into hazelcast-management-center-3.11.3
run $ ./start.sh if on mac, otherwise run the .bat file
this will bring up the Hazelcast Management Center at http://localhost:8080/hazelcast-mancenter/dev

#To Scale Cluster Up to 3 Nodes
First run: $ gradle assemble, this will generate a build folder
You can then run multiple instances of your application by simply running the following commands in separate terminals:
NOTE: ports being specified are for the Tomcat server - not related to our nodes/hazelcast cluster
Terminal 1: $ java -Dserver.port=8081 -jar build/libs/hazelcastdemo-0.0.1-SNAPSHOT.jar
Terminal 2: $ java -Dserver.port=8082 -jar build/libs/hazelcastdemo-0.0.1-SNAPSHOT.jar
Terminal 3: $ java -Dserver.port=8083 -jar build/libs/hazelcastdemo-0.0.1-SNAPSHOT.jar