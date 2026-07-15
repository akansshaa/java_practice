package com.examples.challenge101;


class Course {
    static int maxCapacityOfStudents;
    int enrollednums;
    String courseName;
    static {
        maxCapacityOfStudents = 100;
    }
    String[] enrolledStudents = new String[maxCapacityOfStudents];
    Course(String courseName,int enrolledNumber){
        this.courseName = courseName;
        enrollednums = enrolledNumber;
    }
    Course(String courseName){
        this(courseName,0);
    }
    static void setMaxCapacity(int capacity){
        maxCapacityOfStudents = capacity;
    }
    void enrollStudent(String name){
        enrolledStudents[enrollednums] = name ;
        enrollednums++;
    }
    int unenrollStudents(String name){
        int occ = 0;
        for(int i=0;i<enrolledStudents.length;i++){
            if(enrolledStudents[i]==name){
                occ ++;
            }
        }
        if(occ==0){
            System.out.println("student not enrolled");
        }else{
            int size = enrolledStudents.length - occ;
            String[] newArr = new String[size];
            int j=0;
            for(int i=0;i<enrolledStudents.length;i++){
                if(enrolledStudents[i]!=name){
                    newArr[j] = enrolledStudents[i];
                    j++;
                }
            }
            size = enrollednums;
        }
        System.out.println("unenrolled.");
        return enrollednums;
    }
}
