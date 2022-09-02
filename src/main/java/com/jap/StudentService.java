package com.jap;

import java.util.*;

public class StudentService {

    public static Set<Student> getAllStudentData(){
        //create six student object by calling Student class parameterized constructor
        Student student1 = new Student("Arjun",10,99);
        Student student2 = new Student("Vaibhav",12,100);
        Student student3 = new Student("Ramesh",13,19);
        Student student4 = new Student("suresh",14,79);
        Student student5 = new Student("rama",15,59);
        Student student6 = new Student("raju",16,29);
        Student student7 = new Student("john",17,79);
        Student student8 = new Student("siri",18,89);
        Student student9 = new Student("rani",19,69);
        Student student10 = new Student("Krishna",20,59);

        //create HashSet object and add all the students object inside it
        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(student6);
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);
        studentSet.add(student7);
        studentSet.add(student8);
        studentSet.add(student9);
        studentSet.add(student10);

        //return the HashSet object


        return studentSet;
    }





}
