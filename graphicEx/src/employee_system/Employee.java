/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_system;

/**
 *
 * @author nn
 */
public class Employee {
    //field
    private int id;
    private String name;
    private String dob;
    //method
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }
    //construtor
    public Employee(int id, String name, String dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }
    
}//class
