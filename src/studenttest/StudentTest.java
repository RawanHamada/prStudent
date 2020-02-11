/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studenttest;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author jit
 */
public class StudentTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException{
        Student[] students={
          new ItStudent(111, "Ahmad", 50, 40,20,30),
            new ItStudent(222, "Huda", 60, 10,5,20),
            new ItStudent(333, "Maher",40, 20,15,25),
            new ArtStudent(444, "Sami", 60, 10,5,20),
            new ArtStudent(555, "Marwa", 60, 10,5,20)
       };
       
    for(Student student: students)
            System.out.println(student);
    List<Student> studentList=Arrays.asList(students);
    
    studentList= studentList.stream().sorted(Comparator.comparing(Student::getGrade)).collect(Collectors.toList());
   
        System.out.println("Sorting================");
        for(Student employee: studentList)
            System.out.println(employee);
            PrintWriter output= new PrintWriter (new File("src/StudentTest/emp.data"));
            for(Student employee:studentList)
                output.println(employee);
            output.close();
    }
    
}
