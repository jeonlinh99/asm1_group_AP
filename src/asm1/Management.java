/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asm1;

import java.util.List;

/**
 *
 * @author dell
 */
public interface Management {
    public void add(People peole);
    public void edit(String id, People peole);
    public boolean delete(String id);
    public List<People>search(String name);
    public  void view();
}
