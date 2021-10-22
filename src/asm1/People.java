/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asm1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class People {
    private String id;
    private String name;
    private String address;
    private String dob;
    private String gender;
    private int phone;
    private Department department;

    public People(String id, String name, String address, String dob, String gender, int phone, Department department) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.department = department;
    }

    public People() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
   
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID: ");
        id = sc.nextLine();
                    sc.nextLine();

        System.out.println("Enter the name: ");

        name = sc.nextLine();

        System.out.println("Enter the Date of birth(dd/MM/yyyy): ");
        dob = sc.nextLine();
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

        date.setLenient(false);
        try{
         date.parse(dob);
            
        }catch(ParseException e){
            System.out.println("Invalid date");
        }
        System.out.println("Enter the Gender: ");
        gender = sc.nextLine();
        System.out.println("Enter the Address: ");
        address = sc.nextLine();
        System.out.println("Enter the Phone number:");
        phone = sc.nextInt();
    
        
    }

    @Override
    public String toString() {
      return "ID: " + id + "\n Name=" + name + "\n Address=" + address + "\n Date of Birth=" + dob + "\n Gender=" + gender + "\n Phone number=" + phone;
    }
  
    }
