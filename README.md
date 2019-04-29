## Log Transport Headers in WSO2 EI

This Mediator is s]used to log all the Transport Headers.

## How to use this?

Checkout this code.

Go to the root directory and execute `mvn clean install` 

Please note that I've added the jar file as well, which you can download and use directly form [here](https://github.com/Nirothipan/log-transport-headers/raw/master/target/org.sample.logTransportHeaders-1.0-SNAPSHOT.jar)

Copy the `org.sample.logTransportHeaders-1.0-SNAPSHOT.jar` from target to EI_HOME\lib directory.

Use the class mediator as follows wherever needed in you API or Proxy or etc.

`<class name="org.sample.LogTransportHeaders"/>`