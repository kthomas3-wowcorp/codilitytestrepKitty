### codilitytestrepKitty - There is only Webpage automation suite that can run in Selenium
# Note:This is not a Maven Project so there is no POM file (will need to add selenium/testng jars manually - please add selenium 3.14 version as some functions used may be depecrated in Selenium 4) ; extentreports and poi are not required as I have not added Tests for DataProvider/Reports)
### Step 1: src/constants/Constants.java - Change WarriorName as desired - If WarriorName exceeds 10 char, SoftAssert runs and Test fails
### Step 2. src/constants/Constants.java - Change Browser preferably "Firefox" (only Firefox/Chrome options enabled). No explicit wait given. Only implicit wait provided.
## Step 3. Run testng.xml as TestNGsuite


