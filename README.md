# Autotests for [Zara/pl](https://www.zara.com/pl/)

## Used stack

 <img src="images/GitHub.svg" width="40" height="40">  <img src="images/IDEA.svg" width="40" height="40">
 <img src="images/JAVA.svg" width="40" height="40">  <img src="images/Gradle.svg" width="40" height="40">
 <img src="images/Junit5.svg" width="40" height="40">  <img src="images/Selenide.svg" width="40" height="40"> 
 <img src="images/Jenkins.svg" width="40" height="40">  <img src="images/Selenoid.svg" width="40" height="40">
 <img src="images/Allure Report.svg" width="40" height="40"> <img src="images/Allure TestOps.svg" width="40" height="40"> 
 <img src="images/Telegram.svg" width="40" height="40">

### For run with Jenkins use this [link](https://jenkins.autotests.cloud/job/Zara-tests/)

<img src="images/JenkinsBuild.png">

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 89.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)

Run tests with filled remote.properties:

```bash
gradle clean test
```

Run tests with not filled remote.properties:

```bash
gradle clean -DremoteDriverUrl=https://user1:1234@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:

```bash
allure serve build/allure-results
```

### The Allure report [here](https://jenkins.autotests.cloud/job/Zara-tests/11/allure/#suites/29bfb06a8c676147f4953b815c0584af/4da31383401b59e1/)

<img src="images/AllureReport.png">

### The Allure TestOps report [here](https://allure.autotests.cloud/launch/4708)

<img src="images/allureTestOpsTestCases.png">

### Telegram bot with notifications of passed tests

<img src="images/TelegramBot.png">

### Video of passing tests from selenoid

<img src="images/selenoid video.gif">

:yellow_heart: Thank you for reading this README. Have a great day!

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>

:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>


