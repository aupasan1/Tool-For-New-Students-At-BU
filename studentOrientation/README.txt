CS542 Design Patterns
Fall 2016
PROJECT <3> README FILE

Due Date: <PROJECT DUE DATE, IN FORMAT: Friday, October 28, 2016>
Submission Date: <DATE YOU SUBMIT, IN FORMAT: Friday, October 28, 2016>
Grace Period Used This Project: <0> Days
Grace Period Remaining: <0> Days
Author(s): <ABHISHEK NIRANJAN UPASANI>
e-mail(s): <aupasan1@binghamton.edu>


PURPOSE:

[
  The purpose of this project is to understand and implement the Builder Pattern in Java.
  
]

PERCENT COMPLETE:

[
  "I believe I have completed 100% of this project."
]

PARTS THAT ARE NOT COMPLETE:

[
  None
]

BUGS:

[
  None
]

FILES:

[
  Included with this project are 31 files:

  Driver.java, the main file associated with the program also contains main
  AdministratorOffice.java, the file associated with registering for dorm
  OnlineContest.java, the file associated with registering for dorm
  ComputerLab.java, the file associated with registering for course
  RegistrarOffice.java, the file associated with registering for course
  BusRide.java, the file associated with taking a campus tour
  OnFoot.java, the file associated with taking a campus tour
  MandoBooks.java, the file associated with buying books
  UniversityBookStore.java, the file associated with buying books 
  BookStoreInterface.java, the file associated with buying books
  TourInterface.java, the file associated with taking a campus tour
  CourseRegistrationInterface.java, the file associated with registering for course
  DormSelectionInterface.java, the file associated with registering for dorm
  CarbonFootprintInterface.java, the file associated with calculating carbon footprint
  CostInterface.java, the file associated with calculating cost
  TimeInterface.java, the file associated with calculating time
  EffortInterface.java, the file associated with calculating effort
  MyCheckList.java, the file associated with generating the checklist
  OrientationChecklist.java, the file associated with generating the checklist
  Books.java, the file associated with choices for the user
  CampusTour.java, the file associated with choices for the user
  Course.java, the file associated with choices for the user
  Dorm.java, the file associated with choices for the user
  Constants.java, the file associated with all the constant values
  Logger.java, the file associated with debugging
  Workshop.java, the file associated with creating the cheklist
  WorkshopInterface.java, the file associated with creating the cheklist
  build.xml, the file associated with cleaning, compiling and running the code
  README.txt the text file you are presently reading
]

SAMPLE OUTPUT:

[
     [java] CheckList[Time = 45 minutes, Cost = $42.50, Carbon Footprint = 520.00 tonnes, Effort = 600.00 calories]
     
]

TO UNTAR:
[
  tar -xvf upasani_abhishek.tar.gz
]

TO COMPILE:

[
  ant -buildfile build.xml all
]

TO RUN:

[
  ant -buildfile build.xml run
]

TO GENERATE JAVADOCS:

[
  ant -buildfile build.xml docs
]

CHOICE OF DATA STRUCTURES:

[
  A class named Attributes with 4 data members namely cost, time, effort and carbon footprint. Each class which needs
  to calculate them instantiates an object of this class.
  
  ArrayList to store the user choices.
  
  Since we have only one student using this library at a time, the worst case time complexity of the algorithm is O(n) 
]

CHOICE OF INTERFACES:

[
	The class Attributes is a 'DTO' (Data Transfer Object) and so there is no interface implementation for this class. 
	It just creates objects for other classes and has only getters and setters defined in it. 
	Used interfaces for all the activities and specifically for time, cost, effort and carbon footprint calculation.  
]

EXTRA CREDIT:

[
 "N/A" 
]


BIBLIOGRAPHY:

[
  For formatting the output
  https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
  https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
  
  For generating Javadocs using ANT
  
  http://javabeat.net/javadoc-ant-task/
]

ACKNOWLEDGEMENT:

[
  None
]