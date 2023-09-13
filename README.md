# ActiveMQ Testing

Project tests interlok-activemq features

## What it does

This project contains a single instance of Interlok that launches an Apache ActiveMQ broker upon start-up.  Once started a single polling trigger will produce a message every 10 seconds and send to a queue on the ActiveMQ broker.  
A second workflow will consume the message and show how to send messages to a second queue using a resolvable metadata item.
A third workflow will again consume the message from the second queue and this time perform a message request by sending to a topic and allowing Interlok to create a temporary topic as the response endpoint.  
Finally, we have a fourth workflow that acts as the bridge between the topic and the temporary topic.; we do this by utilizing the JMSReplyTo metadata item.

![activemq diagram](/activemq.png "activemq diagram")
 
## Getting started

* `./gradlew clean build`
* `(cd ./build/distribution && java -jar lib/interlok-boot.jar)`

### The logging

Once started you will see the embedded ActiveMQ broker starting up;

```
DEBUG [Thread-3] [c.a.a.ActiveMQServerComponent.run()] Starting org.apache.activemq:type=Broker,brokerName=defaultMgmtComponentBroker
DEBUG [Thread-3] [c.a.a.ActiveMQServerComponent.run()] ActiveMQ Broker now running.
```
