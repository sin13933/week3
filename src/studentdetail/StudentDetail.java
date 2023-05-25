/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetail;

/**
 *
 * @author saini
 */
public class StudentDetail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //array of object
        Student[] list = new Student[2];
        Student s1 = new Student();
        s1.setName("peter");
        s1.setAge(20);
        Student s2 = new Student();
        s2.setName("karan");
        s2.setAge(21);
        list[0]=s1;
        list[1]=s2;
        System.out.println(list[0].getName() + list[0].getAge());
        System.out.println(list[1].getName() + list[1].getAge());
        System.out.println("Hello");
    }
    
}
