/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_system;

import java.util.Scanner;

/**
 *
 * @author nn
 */
public class Ui {
    //field
    Scanner scan = new Scanner(System.in);
    Service service = new Service();
    Employee result[] = new Employee[10];
    int visit = 0;
    //method
    int index;
    void showMenu(){
        int w1 = 0;
        while(w1 == 0){
            System.out.println("MENU-----------------------");
            System.out.println("1. registration \n2. search \n3. count \n4. total \n5. exit");
            System.out.println("-----------------------");
            System.out.print("SELECT MENU 1-5: ");
            String menu1 = scan.next();
            
            //registration
            if(menu1.equals("1")){
                visit++;
                System.out.println("REGISTRATION-----------------------");
                System.out.println("Visit UI: "+visit);
                System.out.print("insert id (2 digits): ");
                String s1 = scan.next();
                int id = Integer.parseInt(s1);
                System.out.print("insert name: ");
                String name = scan.next();
                System.out.print("insert DOB(mm/dd/yy): ");
                String dob = scan.next();

                Employee emp = new Employee(id, name, dob);
                service.registration(emp, visit);
                System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getDob()+" registered successfully!");
            }//Registration
            //search by id
            if(menu1.equals("2")){
                System.out.println("search by id-----------------------");
                System.out.print("insert id (2 digits):");
                String s1 = scan.next();
                int id = Integer.parseInt(s1);
                System.out.println("search by id: "+id);
                service.search(id);
                System.out.println(service.search(id).getId()+" "+service.search(id).getName()+" "+service.search(id).getDob());
                
            }//Search by id
            //count
            if(menu1.equals("3")){
                System.out.println("TOTAL NUMBER OF EMPLOYEE: "+service.count());
            }//Count
            //print
            if(menu1.equals("4")){
                result = service.print();
                for(int i = 0; i<index; i++){
                   System.out.println(result[i].getId()+" "+result[i].getName()+" "+result[i].getDob());
                }
                
            }//Print
            //exit
            if(menu1.equals("5")){
                System.out.println("Terminate the system!");
                break;
            }//Exit
        }//while
    }//showMenu()
}//class
