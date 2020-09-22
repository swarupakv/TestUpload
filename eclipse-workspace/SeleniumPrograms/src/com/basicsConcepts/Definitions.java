/*

SELENIUM is a free (open-source) automated testing framework used to validate web applications across different browsers and platforms. 
You can use multiple programming languages like Java, C#, Python etc to create Selenium Test Scripts. 
Testing done using the Selenium tool is usually referred to as Selenium Testing.

Selenium Software is not just a single tool but a suite of software, each piece catering to different testing needs of an organization. Here is the list of tools

Selenium Integrated Development Environment (IDE)
Selenium Remote Control (RC)
WebDriver
Selenium Grid


At the moment, Selenium RC and WebDriver are merged into a single framework to form Selenium 2. Selenium 1, by the way, refers to Selenium RC. 

Following programming languages are supported by WebDriver

Java
.Net
PHP
Python
Perl
Ruby

WebDriver is a tool for testing web applications across different browsers using different programming languages.
You are now able to make powerful tests because WebDriver allows you to use a programming language of your choice in designing your tests.
WebDriver is faster than Selenium RC because of its simpler architecture.
WebDriver directly talks to the browser while Selenium RC needs the help of the RC Server in order to do so.
WebDriver's API is more concise than Selenium RC's.
WebDriver can support HtmlUnit while Selenium RC cannot.
The only drawbacks of WebDriver are:
It cannot readily support new browsers, but Selenium RC can.
It does not have a built-in command for automatic generation of test results.

Selenium installation is a 3 step process:

Install Java SDK
Install Eclipe
Install Selenium Driver Files

Summary for locating elements:

By.className	
finds elements based on the value of the "class" attribute	
findElement(By.className("someClassName"))

By.cssSelector	
finds elements based on the driver's underlying CSS Selector engine	
findElement(By.cssSelector("input#email"))

By.id			
locates elements by the value of their "id" attribute	
findElement(By.id("someId"))  

By.linkText		
finds a link element by the exact text it displays	
findElement(By.linkText("REGISTRATION")) 
 
By.name			
locates elements by the value of the "name" attribute	
findElement(By.name("someName"))  

By.partialLinkText	
locates elements that contain the given link text	
findElement(By.partialLinkText("REG"))  

By.tagName		
locates elements by their tag name	
findElement(By.tagName("div"))  

By.xpath		
locates elements via XPath	
findElement(By.xpath("//html/body/div/table/tbody/tr/td[2]/table/ tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/ form/table/tbody/tr[5]"))

Priority of using locators:

id  
name 
class name
link text
css
xpath
dom

Xpath:
1. Absolute Xpath:
Absolute XPath tries to locates the element from the root. i.e. complete path.
/html/body/p - locates all the p tags in the body portion

2. Relative Xpath:
Relative XPath tries to locate the element directly instead of locating from root.
//p - locates all the Paragraphs on the page

CSS Selectors:

While locating the UI elements, CSS Selectors needs to be used as a priority over XPath Expressions.
The below are the reasons, why the CSS Selectors needs to be preferred over XPath Expressions:
When compared to XPath Expressions, CSS Selectors locate the UI elements faster.
Selenium may not be able to locate few UI elements using XPath Expressions, while executing the Automation scripts on Internet Explorer Browser.

1. Absolute CSS Selectors
Absolute CSS Selectors tries to locates the element from the root. i.e. complete path.
html > body > p - locates all the p tags in the body portion html 

2. Relative CSS Selectors
Relative CSS Selectors locates the elements directly, instead of locating from root.
p - locates all the p tags in the body portion


Get Commands:
get()
getTitle()
getPageSource()
getCurrentUrl()
getText()


Navigate Commands:
navigate().to()
navigate().refresh()
navigate().back()
navigate().forward()


Closing and Quitting Browser Windows:
close()
quit()


WebElement Commands:
clear()
click()
findElement()
findElements()
getAttribute()
getCssValue()
getLocation()
getSize()
getTagname()
getText()
isDisplayed()
isEnabled()
isSelected()
sendKeys()
submit()

Drop-downs:
Select in Selenium WebDriver
The 'Select' class in Selenium WebDriver is used for selecting and deselecting option in a dropdown. The objects of Select type can be initialized by passing the dropdown webElement as parameter to its constructor.
selectByIndex
selectByValue
selectByVisibleText


Actions in Selenium WebDriver
For performing complex user interaction like drag and drop, we have an Actions class in Selenium WebDriver. 
Using the Actions class, we first build a sequence of composite events and then perform it using Action (an interface which represents a single user-interaction). The different methods of Actions class we will be using here are-

clickAndHold(WebElement element) - Clicks a web element at the middle(without releasing).
moveToElement(WebElement element) - Moves the mouse pointer to the middle of the web element without clicking.
release(WebElement element) - Releases the left click (which is in pressed state).
build() - Generates a composite action


Waits
There are two kinds of waits.

Implicit wait - used to set the default waiting time throughout the program
Explicit wait - used to set the waiting time for a particular instance only

Implicit Wait:
It is simpler to code than Explicit Waits.
It is usually declared in the instantiation part of the code.
You will only need one additional package to import.






















































*/