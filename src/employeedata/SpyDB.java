/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedata;

import java.util.ArrayList;


/**
 *
 * @author Darragh
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Darragh
 */
public class SpyDB {
    
     //holds our known spies
        ArrayList <Employee> fibSpies = new ArrayList <Employee>(); 
    //gets staff from employeeDB
    EmployeeDB eDB = new EmployeeDB();
    
  
    
public ArrayList <Employee> getArrayList(){
	
	return this.fibSpies;
	
	
}
public void printSpies(){

    //method to call and print fib spies in main
    
            for(int i =0;i<fibSpies.size();i++){
        
            System.out.println("index : " + i + " " + fibSpies.get(i));
        
        }
           

}
  
    
    //this finds the spies with fibonacci code
   public void fibTest(){
  
       for(int j=0;j<eDB.staff.size();j++){
           String y = eDB.staff.get(j).getId().replaceAll("[^\\d.]", ""); //removes letters from id
    int n = Integer.parseInt(y);

     {
         int a=0, b=1 ,c=0; 
      
          while(c<n) 
          {
              c = a + b; 
              a = b;
              b = c;
          }
      
        
         
           if(c==n) 
           fibSpies.add(eDB.staff.get(j));
           
           
     }
     
}
   }
   
}