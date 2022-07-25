# CodingTest
First Create the maven Folder Structure and add the required jar files from the remote repository into the pom.xml file.
Create the package test_task and in src/test/java impliements the code.
In src/ test/java under creates the packages.

1. org.pages
     ----> Imdbpages 
     ----> Wikipages
 2. org.testcases
      ----> Imdbtestcases
      ----> Wikitestcase
3.   org.programtask
        -----> JavaScriptMethod
        
  Depending upon requirements I implements the code using Page Object Model.
  1. In org.pages (package) there is 2 java classes and in this class implements the page object model.Identification of web Element , constructor and actions method.
  2. In org.testcases(Package) impliements the test method using @Test annoations .
  3. In org.programtask (package) impliemnts the generic method for scrollIntoView to scroll the page down.
   
   In Imdbpages java class file impliements the logic using page object model and in Imdbtestcases write the @test method .
   Create the object of page class in Imdbtestcases and  call the actions methods of Imdbpages.java class file
   for scroll down the page I wrote the generic function in JavaScriptMethod and call this method from Imdbtestcases.
   
    In Wikipages java class file impliements the logic using page object model and in Wikitestcase write the @test method .
   Create the object of page class in Wikitestcase and  call the actions methods of Wikipages.java class file
   for scroll down the page I wrote the generic function in JavaScriptMethod and call this method from Wikitestcase.
   
  Steps to run the program.
  To run the program we want to execute the testMethod.
  
    Right click on Imdbtestcases  ------> Run as -------> testNG
    Right click on Wikitestcase  ------> Run as -------> testNG
  
  
  
  
  
        
