/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedata;

//import static employeedata.Main.deserializeFromDisk;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

/**
 *
 * @author Darragh
 */
public class EmployeeDB implements Serializable{
    
   // Supplied employee data placed into its own class
     
        
       public   ArrayList<Employee> staff = new ArrayList<>();{
           try {
               staff = deserializeFromDisk(staff);
           } catch (IOException ex) {
               Logger.getLogger(EmployeeDB.class.getName()).log(Level.SEVERE, null, ex);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(EmployeeDB.class.getName()).log(Level.SEVERE, null, ex);
           }

           

         

        
    }

       public static ArrayList<Employee> deserializeFromDisk(ArrayList<Employee> staff)throws IOException, ClassNotFoundException 
       {
            FileInputStream fileIn = new FileInputStream("Employee.ser");
            ObjectInputStream in   = new ObjectInputStream(fileIn);
            staff = (ArrayList<Employee>)in.readObject();
            return staff;
        }
       
  

}