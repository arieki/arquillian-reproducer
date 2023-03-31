## Execution

Simply use this maven command

`mvn clean verify`

## Test Output

```
[2023-04-01T00:10:40.169+0700] [] [WARNING] [] [jakarta.enterprise.web] [tid: _ThreadID=87 _ThreadName=http-thread-pool::http-listener(1)] [timeMillis: 1680282640169] [levelValue: 900] [[
  StandardWrapperValve[ArquillianServletRunnerEE9]: Servlet.service() for servlet ArquillianServletRunnerEE9 threw exception
java.lang.NoClassDefFoundError: org/slf4j/LoggerFactory
        at org.testng.log4testng.Logger.lambda$getLogger$0(Logger.java:30)
        at java.base/java.util.concurrent.ConcurrentHashMap.computeIfAbsent(ConcurrentHashMap.java:1705)
        at org.testng.log4testng.Logger.getLogger(Logger.java:30)
        at org.testng.TestNG.<clinit>(TestNG.java:110)
        at org.jboss.arquillian.testng.container.TestNGTestRunner.execute(TestNGTestRunner.java:41)
        at org.jboss.arquillian.protocol.servlet5.runner.ServletTestRunner.executeTest(ServletTestRunner.java:139)
        at org.jboss.arquillian.protocol.servlet5.runner.ServletTestRunner.execute(ServletTestRunner.java:117)
        at org.jboss.arquillian.protocol.servlet5.runner.ServletTestRunner.doGet(ServletTestRunner.java:86)
        at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:527)
        at jakarta.servlet.http.HttpServlet.service(HttpServlet.java:614)
        at org.apache.catalina.core.StandardWrapper.service(StandardWrapper.java:1569)
        at org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:259)
        at org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:167)
        at org.apache.catalina.core.StandardPipeline.doInvoke(StandardPipeline.java:757)
        at org.apache.catalina.core.StandardPipeline.invoke(StandardPipeline.java:577)
        at com.sun.enterprise.web.WebPipeline.invoke(WebPipeline.java:99)
        at org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:158)
        at org.apache.catalina.connector.CoyoteAdapter.doService(CoyoteAdapter.java:372)
        at org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:239)
        at com.sun.enterprise.v3.services.impl.ContainerMapper$HttpHandlerCallable.call(ContainerMapper.java:520)
        at com.sun.enterprise.v3.services.impl.ContainerMapper.service(ContainerMapper.java:217)
        at org.glassfish.grizzly.http.server.HttpHandler.runService(HttpHandler.java:174)
        at org.glassfish.grizzly.http.server.HttpHandler.doHandle(HttpHandler.java:153)
        at org.glassfish.grizzly.http.server.HttpServerFilter.handleRead(HttpServerFilter.java:196)
        at org.glassfish.grizzly.filterchain.ExecutorResolver$9.execute(ExecutorResolver.java:88)
        at org.glassfish.grizzly.filterchain.DefaultFilterChain.executeFilter(DefaultFilterChain.java:246)
        at org.glassfish.grizzly.filterchain.DefaultFilterChain.executeChainPart(DefaultFilterChain.java:178)
        at org.glassfish.grizzly.filterchain.DefaultFilterChain.execute(DefaultFilterChain.java:118)
        at org.glassfish.grizzly.filterchain.DefaultFilterChain.process(DefaultFilterChain.java:96)
        at org.glassfish.grizzly.ProcessorExecutor.execute(ProcessorExecutor.java:51)
        at org.glassfish.grizzly.nio.transport.TCPNIOTransport.fireIOEvent(TCPNIOTransport.java:510)
        at org.glassfish.grizzly.strategies.AbstractIOStrategy.fireIOEvent(AbstractIOStrategy.java:82)
        at org.glassfish.grizzly.strategies.WorkerThreadIOStrategy.run0(WorkerThreadIOStrategy.java:83)
        at org.glassfish.grizzly.strategies.WorkerThreadIOStrategy$WorkerThreadRunnable.run(WorkerThreadIOStrategy.java:101)
        at org.glassfish.grizzly.threadpool.AbstractThreadPool$Worker.doWork(AbstractThreadPool.java:535)
        at org.glassfish.grizzly.threadpool.AbstractThreadPool$Worker.run(AbstractThreadPool.java:515)
        at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.ClassNotFoundException: org.slf4j.LoggerFactory
        at org.glassfish.web.loader.WebappClassLoader.loadClass(WebappClassLoader.java:1843)
        at org.glassfish.web.loader.WebappClassLoader.loadClass(WebappClassLoader.java:1684)
        ... 37 more
]]

[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 27.695 s <<< FAILURE! - in TestSuite
[ERROR] com.example.arquillianreproducer.HelloIT.testRequestEndpoint  Time elapsed: 0.203 s  <<< FAILURE!

```