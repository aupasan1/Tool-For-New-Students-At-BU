# Tool-For-New-Students-At-BU

You need to develop a tool for student orientation program at Binghamton University. Assume that your library is used by each student to write his/her Driver code for their specific orientation plan.

•	The orientation checklist consists of taking a campus tour, buying books, selecting a dorm, and registering for courses. There is time duration, cost, carbon footprint, and effort associated with each of these activities. Effort is measured in the number of calories spent on the activity. Carbon-footprint is measured in tonnes of CO2. Each student is required to complete the checklist before start of classes. However, all students have some flexibility in how and when they go about completing each activity.

•	There are 2 different bookstores to choose from: University Book Store, Mando Boooks. The price difference is within 5% in these book stores.

•	The options for campus tour include the following: bus-ride or on-foot. The bus-ride costs $2.00, while the tour on-foot is $0.10.

•	Selecting a dorm has two options: standing in a long queue outside the dorms administrator's office for your turn or through an online gaming contest that assigns dorms based on your game performance. Using the online option has a 2% surcharge.

•	Registration can be done by submitting forms to the registrar's office or by accessing the registration system using computers from a specific computer-lab in the Engineering building. Submitting forms requires payment via check, which makes tuition 3% cheaper.

•	Assign time duration in minutes for each activitiy (use your own estimate).

•	Assign appropriate carbon footprint value for each activity (use your own estimates).

•	Use your own estimate to decide how to calculate (or assign a value) to the calories spent for each activity.

•	Design and develop the classes/interfaces that can be used for each student's orientation program. Write an example driver program for a specific student to calculate the total time duration, cost, and effort of the orientation, based on her/his choices.

•	Note that each activity should have an interface.

•	Note that time, carboon footprint and cost should also have interfaces.

•	Your directory structure should be the following:

    •	 -LastName_firstName_LastName_firstName
    •	   ---studentOrientation
    •	     ----- build.xml
    •	     ----- README.txt
    •	     ----- src
    •	          ---studentOrientation   
    •	     	   ----------driver
    •	           ----------util
    •	           ----------other packages that you need
