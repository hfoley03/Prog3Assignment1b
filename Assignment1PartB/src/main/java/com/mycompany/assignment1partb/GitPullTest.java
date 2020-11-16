/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment1partb;
import com.mycompany.studentregsystem.Course;
import com.mycompany.studentregsystem.Student;
import com.mycompany.studentregsystem.Module;

public class GitPullTest {
    public GitPullTest() {}
        public static void main(String[] args) {
            
            Student s1 = new Student("Harry", 12345, 22,"2002-01-01");
            Student s2 = new Student("Barry", 45678, 44, "1991-08-08");
            Student s3 = new Student("Simon", 99966, 21, "2002-01-01");
            Student s4 = new Student("Shmoley", 123455, 22, "2002-01-01");
            
            Module m1 = new Module("Programming 111","ct101");
            Module m2 = new Module("Applied Synthesis","ct202");
            Module m3 = new Module("Introduction to Big Beat Manifesto","AB212");
           
            Course c1 = new Course("ece", "2020-06-09", "2020-08-09");
            
            m1.addStudent(s1);
            m1.addStudent(s2);
                      
            m2.addStudent(s3);
            m2.addStudent(s4);
                        
            m3.addStudent(s1);
            m3.addStudent(s2);
            m3.addStudent(s3);
            m3.addStudent(s4);
            
            c1.addStudent(s1);
            c1.addStudent(s2);
            c1.addStudent(s3);
            c1.addStudent(s4);
            c1.addModule(m1);
            c1.addModule(m2);
            c1.addModule(m3);
         
            c1.courseInfo(c1);
        }
    
}
