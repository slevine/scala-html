Background
===========
This project enhances [Florian Hars][] nice Scala HTML parsing libraries.  There was only an Ant build script as part of the project, so I decided to create a Scala Simple Build Tool project for it.  By creating the project it makes it much easier to get started using the libraries.  


To run the project
==================
Install [Simple Build Tool][]
   
Run the following sequence of commands:
  
     cd <project-dir> 
     sbt
     update  (downloads dependencies) 
     test    (runs Scala Test)


[Florian Hars]: http://www.hars.de/2009/01/html-as-xml-in-scala.html
[Simple Build Tool]: http://code.google.com/p/simple-build-tool/ 