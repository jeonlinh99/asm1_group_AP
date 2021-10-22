/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asm1;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class main {
    
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Student student = new Student();
    Professor profess = new Professor();
   
    Manager manager = new Manager();
    while(true){
        System.out.println("======Student and Professor Management====");
        System.out.println("Enter your choice");
        System.out.println("1: Add new");
        System.out.println("2: Search people by name");
        System.out.println("3: Show information of People");
        System.out.println("4: Delete people");
        System.out.println("5: Edit information of People");
        System.out.println("6: Exit");
        int choose = sc.nextInt();
        switch(choose){

            case 1:{
                System.out.println("Enter 1: to add new Student");
                System.out.println("Enter 2: to add new Professor");
                int choose1 = sc.nextInt();
                switch(choose1){
                    case 1:{
                        // to add new Student
                        student.inputData();
                        manager.add(student);
                        System.out.println(student.toString());
                    break;}
                    case 2:{
                    // to add new Professor
                        profess.inputData();
                        manager.add(profess);
                        System.out.println(profess.toString());
                      
                    break;}
            
            
            }
            
            break;
            }
            case 2:{
                
                // to Search
                System.out.println("Enter the name that you want to find:");
                sc.nextLine();
                String name = sc.nextLine();
                manager.search(name).forEach(people ->{
                System.out.println(people.toString());});
               
            break;}
            case 3:{
                // to show information
                manager.view();
            break;}
            case 4:{
               // to Delete 
                System.out.println("Enter ID of person that you want to delete:");
                String id = sc.nextLine();
                System.out.println(manager.delete(id) ? "Success" : "Fail");
            break;}
            case 5:{
                // to edit
                System.out.println("Enter ID of person that you want ot edit:");
                String id = sc.nextLine();
                   System.out.println("Enter 1: to edit Student");
                System.out.println("Enter 2: to edit Professor");
                int choose1 = sc.nextInt();
                switch(choose1){
                    case 1:{
                        // to add new Student
                        student.inputData();
                        manager.edit(id,student);
                    break;}
                    case 2:{
                    // to add new Professor
                        profess.inputData();
                        manager.edit(id,profess);
                      
                    break;}
                    default:
                        System.out.println("Invalid");
                        break;
            }
            break;}
            case 6:{
            // to exit
               return; 
            
            }
            default:
                System.out.println("Invalid");
        
        
        }
        
    
    }
    
    
    
    }
    
}
