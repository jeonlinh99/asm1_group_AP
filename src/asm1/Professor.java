
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asm1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Professor extends People {
    private double salary;

    public Professor() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void setPhone(int phone) {
        super.setPhone(phone); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPhone() {
        return super.getPhone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getGender() {
        return super.getGender(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setDob(String dob) {
        super.setDob(dob); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDob() {
        return super.getDob(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAddress() {
        return super.getAddress(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setName(String name) {
        super.setName(name); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(String id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        System.out.println("The information of Professor:")

        return super.toString() + "\nSalary=" + this.salary;
   }

   

    @Override
    public void inputData() {
        System.out.println("The information of Professor: ");
        super.inputData(); //To change body of generated methods, choose Tools | Templates.
         Scanner sc = new Scanner(System.in);
          System.out.println("Enter the salary of the professor: ");
          salary = sc.nextDouble();
    }

   

    @Override
    public void setDepartment(Department department) {
        super.setDepartment(department); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Department getDepartment() {
        return super.getDepartment(); //To change body of generated methods, choose Tools | Templates.
    }
    
   }
