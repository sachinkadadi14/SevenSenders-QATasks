# SevenSenders-QATask1 - Webtesting
Website to create Automation test scripts - https://www.komoot.com/ \
**Number of test cases :** 3 Test cases 
### PreRequisites for creating Automation scripts
**Browsers :** Mozilla Firefox , Chrome browser \
**Base Class creation :** Base class is created for all three test cases where the driver is initialised. \ 
**Drivers required to download:** Chrome driver, Mozilla firefox driver. \
JAVA JDK/JAR's download and set the system variables in the system\
Download the Eclipse IDE for creation of Automated scripts

### Components of framework
**Build tool:** Maven build tool \
**Dependencies added in pom.xml**: selenium, TestNG\
**Test Execution Engine** : TestNG \
Employed Page Object model for Code redundancy and better readablity and store the page locators for each test case. 

### Framework structure and steps to execute the test cases

**Projectnames for each test cases :** QATask_SevenSenders_TestCase1, QATask_SevenSenders_TestCase2, QATask_SevenSenders_TestCase3 \
**Folder "src/main/java:** 1) This folder consists of Page objects required for each of the test cases \
                            2) A seperate Data.properties file is present which consists of globala variables stored - browser, URL, location to avoid hardcoding in main test. \
                           3) Base_Class is created to initialise the driver. \
**Folder "src/test/java:** 1) This folder consists of actual test scripts writted to drive the automation of given application.\
**Steps to execute the test scripts:** Right click and run the test class from src/test/java folder and click on " run as TestNG" to start the execution of test scripts

### Test cases prepared are present in seperate folders attached.

# Task 2 - SQL Task

Seperate file **Task2- SQLtask** is present which consists of results for each task. \ 

    


