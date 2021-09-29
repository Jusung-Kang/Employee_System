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
public class Service {
    //field
    DB db = new DB();
    Employee result[] = new Employee[10];
    //method
    public void registration(Employee e, int visit){
        db.registration(e, visit);
    }
    
    public Employee search(int id){
        Employee result = db.search(id);
        return result;
    }
    
    public int count(){
       int result = db.count();
       return result;
    }
    
    public Employee[] print(){
       result = db.print();
       
       return result;
    }
    //constructor*/
}//class
