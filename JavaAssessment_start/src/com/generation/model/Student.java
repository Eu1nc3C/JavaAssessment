package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student
    extends Person
    implements Evaluation
{

    float PASS_MIN_GRADE = 3.0f;

    private ArrayList<Course> enrolledCourses;


    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );

    }


    public void enrollToCourse( Course course )
    {
        //TODO Add the course to the ArrayList
        enrolledCourses.add(course);
      }



    @Override
    public List<Course> findPassedCourses()
    {
        //TODO return only the passed courses (ie course with credit > 3 of a student with the student ID passes in
        // from the parameter
        //student object (id, name, email, birthDate)







        return null;
    }

    public Course findCourseById( String courseId )
    {
        //TODO  Get the course ID from the caller, and return the Course object back
        if (courses.containsKey(courseId))    //return true or false
        {
            //if true - return course object
            return courses.get(courseId);
        }

       return null;
    }

    @Override
    public List<Course> getEnrolledCourses()
    {
        //TODO Return the whole ArrayList
        return this.enrolledCourses;

    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }

}
