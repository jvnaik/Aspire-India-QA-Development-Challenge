# Aspire-India-QA-Development-Challenge
Code for Aspire India QA Development Challenge

# Details of attached Code
Consists of two folders: src and Properties.
src contains all the java code along with packages &  classes. Properties folder contains two .properties files which consist of site data & element locator mapping.

# Instructions once code is downloaded
Copy & paste both the files at Java Workspace location in System. (e.g. C:\Users\eclipse-workspace)

# Pre-requisite to run the code
Please ensure below dependencies are installed before running the code. Mentioned in brackets the version uses, can use the same or higher.
Selenium Java (3.141.59)
Selenium API  (3.141.59)
TestNG        (6.14.3)

Browser drivers for Chrome/IE/Firefox should be placed in the system. Can be downloaded from web.

# Input data required in Sitedata.properties file
browser_name - please specify the browser name which will be used for test. Please use the text: firefox / chrome / ie. By default it is firefox.
driver_path  - please specify the path where browser driver is placed in the system.

# Code Structure
TestCase - TestCaseChallenge.java :  Test methods to run
Driver - InitializeDriver.java : Code for initializing & stopping the driver
Utilities - Utilities.java : Code to fetch the element from properties file
Pages : Clases for different pages in the tool
Asserions - Assertions.java : Validation post order done

# How to Run the Code
Open TestCaseChallenge.java file and simple run it. All test cases will run and once done browser will be closed.

Please revert in case of any queries.
