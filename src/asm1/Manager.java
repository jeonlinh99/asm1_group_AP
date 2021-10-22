/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asm1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author dell
 */
public class Manager implements Management{

    /**
     * @param args the command line arguments
     */
    
    private List<People> peoList;
    public Manager(){
    this.peoList = new ArrayList<>();
    
    }

    

    @Override
    public void add(People peole) {
        this.peoList.add(peole);
        
    }
    @Override
    public List<People> search(String name){
    return this.peoList.stream().filter
        (o -> o.getName().contains(name)).collect(Collectors.toList());
    
    }

    @Override
    public void edit(String id, People peole) {
        
        search(id).forEach(people ->{
            peoList.set((peoList.indexOf(people)), peole);
        });
    }

    @Override
    public boolean delete(String id) {
        People peoDel = this.peoList.stream().filter(document -> document.getId().equals(id)).findFirst().orElse(null);
        if(peoDel == null){
        return false;
        }
        this.peoList.remove(peoDel);
        return true;
    }


    @Override
    public void view() {
        this.peoList.forEach(o -> System.out.println(o.toString()));
        
    }

   
    
    
    
    
    
}
