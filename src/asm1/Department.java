/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asm1;

/**
 *
 * @author dell
 */
public class Department {
    private int id;
    private String name;

    public Department() {
    }

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", name=" + name + '}';
    }
    
    
}
