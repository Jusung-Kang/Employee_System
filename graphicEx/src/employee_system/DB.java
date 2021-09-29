/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_system;

import java.io.*;
import java.util.StringTokenizer;

/**
 *
 * @author nn
 */
public class DB {
    /*//field
    Employee db[] = new Employee[10];
    int index = 0;
    Employee result[] = new Employee[10];
    //method
    Employee registration(Employee e){
        db[index] = e;
        index++;
        return db[index-1];
    }
    Employee search(int id){
        Employee result = null;
        for(int i = 0; i<index; i++){
            if(db[i].getId() == id){
                result = db[i];
                
            }
        }
        return result;
    }
    
    int count(){
        return index;
    }
    
    Employee[] print(){
        result = db;
        return result;
    }
    //constructor
*/
    
    //db as a file management
    //method
    
    //field
    String[] tmp = new String[10];
    Employee result[] = new Employee[10];
    Employee emp[] = new Employee[10];
    //method
    public void registration(Employee emp, int visit){
        String record = emp.getId() + " " +emp.getName() + " " + emp.getDob() ;
        System.out.println("Visit: "+visit);
        try{
            if(visit < 2){
                FileWriter fw = new FileWriter("emp.txt");
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(record);
                bw.newLine();
                bw.close();
            }
            else{
                FileWriter fw =  new FileWriter("emp.txt",true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(record);
                bw.newLine();
                bw.close();
            }
        }catch(IOException ioe){
        }
    }//regist
    Employee search(int id){
        Employee result = null;
        int index = 0;    
        try{
            BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
            while(true){
                String str = br.readLine();
                if(str == null){
                    break;
                }//if
                tmp[index] = str;
                StringTokenizer st = new StringTokenizer(tmp[index]," ");
                int number = Integer.parseInt(st.nextToken());
                String name = (st.nextToken());
                String dob = (st.nextToken());
                Employee employee = new Employee(number, name, dob);
                emp[index] = employee;
                if(number == id){
                   result = emp[index];
                }//if
                index++;
            }//while
        }catch(IOException io){
        }
            return result;
    }//search
    
    int count(){
        int index = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
            while(true){
                String str = br.readLine();
                if(str == null){
                    break;
                }//if
                tmp[index] = str;
                index++;
            }//while
            //System.out.println(index);
        } catch (IOException io) {
        }
        return index;
    }//count
    
    Employee[] print(){
        Employee result[] = new Employee[10];
        try {
            int index = 0;
            BufferedReader br = new BufferedReader(new FileReader("emp.txt"));
            while(true){
                String str = br.readLine();
                if(str == null){
                    break;
                }//if
                tmp[index] = str;
                //System.out.println(tmp[index]);
                StringTokenizer st = new StringTokenizer(tmp[index]," ");
                int id = Integer.parseInt(st.nextToken());
                String name = (st.nextToken());
                String dob = (st.nextToken());
                System.out.println(id+" "+name+" "+dob);
                Employee employee = new Employee(id, name, dob);
                result[index] = employee;
                index++;
            }
        } catch (IOException io) {
        }
        return result;
    }
    //constructor
    
}//class
