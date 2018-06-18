# Attendance Management System

This was a Java individual class assignment from APU. 

The three types of users of this system:
1. Admin
2. Lecturers
3. Students 


------


## Objectives

### 1. Admin 
- register lecturers and students as new users
- search for a specific lecturer or student
- edit and delete the record of lecturer or student
- view all lecturers and students 
- modify the attendance of student by changing ABSENT to ABSENT WITH REASON as per student’s reasonable request

### 2. Lecturers
- view the intakewise students as assigned to them by Admin
- mark attendance for each class by providing class specifics such as lecture date, start and end times, module name, and intake code
- mark the attendance record as PRESENT, ABSENT, or LATE 
- modify the attendance after submitting it

### 3. Students
- view their attendance summary
- if Student would like to update their attendance, they are able to send a message to admin containing the reason why they were absent so that Admin would change their attendance record from ABSENT to ABSENT WITH REASON.
------
## Assumptions
### 1. General
- This system should begin with a startup form where user must choose which type of user they are (Admin/Lecturer/Student) and it will bring them to an appropriate login form depending on their user type. 
- Once logged in using their user ID and password, a main menu for the appropriate user type will appear containing links to forms that allow user to perform the functionalities as assigned to them. 
- Validations exist in the registration form, edit details form, and every other form that contains a search bar. This means if there are any unfulfilled requirements then the system will show an error message. Otherwise, if everything seems acceptable, the system will issue a dialog box to indicate success of performing the function.

### 2. Admin
- When registering a new user, Admin has to fill in the user details in all the required fields and must make sure that the data entered are in the correct format, otherwise an error message will show up. Admin must assign 2 intakes and 2 modules for each lecturer, and those 2 intakes must be different from one another, so do the 2 modules. When assigning user ID and password for the new user, Admin must retype the password in another field and those 2 password fields have to match before the user is created.
- When editing the details of a user, first Admin has to search for the user by entering their user ID in the search bar. If the user exists, the details of the user will be displayed in the appropriate fields which are editable. If the user does not exist, an error message will show up to indicate Admin to enter a valid user ID. There is validation in the contact number field to ensure that the data entered is in integer only, and the email address field to ensure that data entered is in a valid email format. Once user clicks the “Update” button to save the information, a confirmation message will pop up in which user has to click the Yes option in order for the data to be updated in the system. The delete user form uses the same concept, except the text fields are non-editable. 
- Admin can also view records of lecturers or students inside a table. They can also search for a specific user using the search bar, however the details displayed in the text fields are not editable as this form is for viewing only.
- To view messages sent by students, Admin can check their inbox which will load one message per form, thus to go to the next message Admin has to click the “Next Message” button. 
- After reading the reasons of absenteeism sent by students, Admin can modify their attendance after picking the related class in the modify attendance form. However, Admin can only change the student’s attendance from Absent to ABSENT WITH REASON.  

### 3. Lecturers
- For lecturers to view the intakewise students assigned to them, they have to first choose one out of the two intakes in which they are in charge of from the combo box. The module field will be set automatically based on the intake chosen. The student records will be shown in a table after user clicks the “Get List” button. 
- To mark attendance, lecturer has to enter the class details such as intake code and the time period from the combo box. The date is set automatically to today’s date, because lecturers take attendance near the end of a lecture class. The module is also set automatically depending on the intake chosen. Afterwards, the system will show the list of students for that particular class inside the table, then the lecturer can mark them as PRESENT, LATE, or ABSENT. Whereas to modify the attendance, lecturer has to pick a previous class first and then modify the attendance to either PRESENT, LATE, or ABSENT and save it. 

### 4. Students
- Students are able to view their attendance summary, and if they are unsatisfied with it, they can send a message to Admin stating the reason why they were absent for a particular class, so that Admin would change their attendance. 
