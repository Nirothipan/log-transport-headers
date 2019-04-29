## Log Transport Headers in WSO2 EI

This Mediator is s]used to log all the Transport Headers.

## How to use this?

Go to the root directory and execute 

`mvn clean install`

Copy the `org.sample.logTransportHeaders-1.0-SNAPSHOT.jar` from target to EI_HOME\lib directory.

Use the class mediator as follows wherever needed in you API or Proxy or etc.

`<class name="org.sample.LogTransportHeaders"/>'`