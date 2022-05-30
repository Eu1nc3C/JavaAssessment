package com.generation.service;

import com.generation.model.Course;
import com.generation.model.Student;

import java.util.*;


public class StudentService
{
    //Hashmap for Students
    private final Map<String, Student> students = new HashMap<>();
    private ArrayList<Course> enrolledCourses;


    public void subscribeStudent( Student student )
    {
        //TODO to be able to subscribe a new student to the course center
        //0) Check if the new student id exist
        //1) Create a new instance of Student Object
        //2) Add the new instance into the student Hashmap using put() method
        students.put( student.getId(), student );
    }

    public Student findStudent( String studentId )
    {
        //TODO get the student ID from the caller, and return the student object back
        //1. check if the id that passed in exist in the Hashmap
        //2. Get the student object from the Students Hashmap using the id(key)
        //3. Return the student object to the caller
        if (students.containsKey(studentId)) //if true - return student object
        {
            return students.get(studentId);
        }
        return null; //if false
    }

    public boolean showSummary()
    {
        //TODO
        return false;
    }

    public void enrollToCourse( String studentId, Course course )
    {
        //create an empty enrolledCourses ArrayList
        enrolledCourses = new ArrayList<>();
        //Add the course to the ArrayList
        enrolledCourses.add(course);

        //TODO to enroll studentId to courseId

        if(students.get(studentId)==null){
            System.out.println("Enroll Failed. Student could not be found.");
        }
        else if(courses.get(code))==null){
            System.out.println("Enroll Failed. Course could not be found.");
        }
        else {
            //Get that particular student object
            //key to the Hashmap to find that particular student
            students.get(studentId);

            //Get the course object id
            courses.get(courseCode);

            //To enroll the course to the student, I need to add the course object to
            // the ArrayList from the student object.


           students.get(studentId).enroll(courses.get(courseId));
        }


    }


}
