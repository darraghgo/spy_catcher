/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedata;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author Darragh
 */
public class SpySociety {
    
    
    //Trying to make an Arraylist which contains employees from Staff , that have job as 40 spies from SpyDB
    
    
    
    
    //Declaring ArrayList which will hold employees with same jobs as 40 spies
    ArrayList <Employee> Soc = new ArrayList <Employee>();
    
      ArrayList <Employee> SocPhone = new ArrayList <Employee>();
      
      ArrayList <Employee> SocPhoneJob = new ArrayList <Employee>();
    
      ArrayList <Employee> SocietyAndPhoneAndAddress = new ArrayList <Employee>();
      
           ArrayList <Employee> SocietyAndPhoneAndClub = new ArrayList <Employee>();
      
     ArrayList <Employee> emp = new ArrayList <Employee>();
     
    public void printSocMatches(){
        //This is for printing the arraylist of employees with same jobs as spies
        System.out.println("Printing soc matches ===================");
        System.out.println("Printing soc matches ===================");
        System.out.println("Printing soc matches ===================");
                    /* Removes Duplicate entries by using HashSet*/
        
                    Collection<Employee> hs = new HashSet<Employee>(Soc);
                    
               for(Employee Soc : hs) {
            System.out.println(Soc);
        }
               System.out.println("");
               System.out.println("The number of suspects is : " + hs.size());
    }
    
        public void printSocPhoneMatches(){
        //This is for printing the arraylist of employees with same jobs and phone networkas spies
        System.out.println("Printing soc and phone matches ===================");
        System.out.println("Printing soc and phonematches ===================");
        System.out.println("Printing soc and phone matches ===================");

                /* Removes Duplicate entries by using HashSet*/
        
                     Collection<Employee> hs = new HashSet<Employee>(SocPhone);
                    
               for(Employee SocPhone : hs) {
            System.out.println(SocPhone);
        }
               System.out.println("");
               System.out.println("The number of suspects is : " + hs.size());
        
    }
        
                public void printSocPhoneJobMatches(){
                    

                    
        //This is for printing the arraylist of employees with same jobs,phone network and job as spies
        System.out.println("Printing soc and phone and job matches ===================");
        System.out.println("Printing soc and phone and job matches ===================");
        System.out.println("Printing soc and phone and job matches ===================");
        
        
        /* Removes Duplicate entries by using HashSet*/
        
                     Collection<Employee> hs = new HashSet<Employee>(SocPhoneJob);
                    
               for(Employee SocPhoneJob : hs) {
            System.out.println(SocPhoneJob);
        }
               System.out.println("");
               System.out.println("The number of suspects is : " + hs.size());
    }
                
                
                                public void printSocietyAndPhoneAndAddressMatches(){
                    

                    
        //This is for printing the arraylist of employees with same society,phone network and job as spies
        System.out.println("Printing soc and phone and address matches ===================");
        System.out.println("Printing soc and phone and address matches ===================");
        System.out.println("Printing soc and phone and address matches ===================");
        
        
        /* Removes Duplicate entries by using HashSet*/
        
                     Collection<Employee> hs = new HashSet<Employee>(SocietyAndPhoneAndAddress);
                    
               for(Employee SocietyAndPhoneAndAddress : hs) {
            System.out.println(SocietyAndPhoneAndAddress);
        }
               System.out.println("");
               System.out.println("The number of suspects is : " + hs.size());
    }
                                 public void printSocietyAndPhoneAndClubMatches(){
                    

                    
        //This is for printing the arraylist of employees with same jobs,phone network and job as spies
        System.out.println("Printing soc and phone and Club matches ===================");
        System.out.println("Printing soc and phone and Club matches ===================");
        System.out.println("Printing soc and phone and Club matches ===================");
        
        
        /* Removes Duplicate entries by using HashSet*/
        
                     Collection<Employee> hs = new HashSet<Employee>(SocietyAndPhoneAndClub);
                    
               for(Employee SocietyAndPhoneAndClub : hs) {
            System.out.println(SocietyAndPhoneAndClub);
        }
               System.out.println("");
               System.out.println("The number of suspects is : " + hs.size());
    }
    
    
       public SpySociety (ArrayList <Employee> fibSpies ){
    
           //these are initalised so I can get the data
         EmployeeDB eDB = new EmployeeDB();
         
 
          
           
       
        
          
                //looping through staff list getting each Employee
       
                for(int i=0;i<eDB.staff.size();i++){
                	
            Employee e = eDB.staff.get(i);
          
            //Looping through list of 40 know spies getting their society
            for(int x=0; x< fibSpies.size(); x++){
                     Employee sp = fibSpies.get(x);
            
               if(e.getMemberOf().substring(0,7).equals(sp.getMemberOf().substring(0,7))){
                    Soc.add(e);
                     if(e.getId().contains("fibo"))
                    {Soc.remove(e);
                            }
                }
            }
        }

       
    }
       ///////////////////////////////////////////////////
                  
       public void SpySocPhone (  ArrayList <Employee> fibSpies ){
    
           //these are initalised so I can get the data
         EmployeeDB eDB = new EmployeeDB();
         
   
          
           
       
        
          
                //looping through staff list getting each Employee
                
                for(int i=0;i<Soc.size();i++){
                	
            Employee e = Soc.get(i);
          
            //Looping through list of 40 know spies getting their phone
            for(int x=0; x< fibSpies.size(); x++){
                     Employee sp = fibSpies.get(x);
                    
                     //comparing two and adding matches to SocPhone Arraylist
                      if(e.getPhone().contains("083")||e.getPhone().contains("084")||e.getPhone().contains("088")||e.getPhone().contains("089"))
                   //  if(e.getPhone().substring(0,3).equals(sp.getPhone().substring(0,3)))
                     {
                    SocPhone.add(e);
                }
                
            }
            
        }
                
       
                
     
    }
       
       ///////////////////////////////////////////////////////
              public void SpySocPhoneJob (  ArrayList <Employee> fibSpies ){
    
           //these are initalised so I can get the data
         EmployeeDB eDB = new EmployeeDB();
         
    
           
       
        
          
        
                
                for(int i=0;i<SocPhone.size();i++){
                	
            Employee e = SocPhone.get(i);
          
           
            for(int x=0; x< fibSpies.size(); x++){
                     Employee sp = fibSpies.get(x);
                     
                     
                     if(e.getJobTitle().equals(sp.getJobTitle()))
                     {
                    SocPhoneJob.add(e);
                }
                
            }
            
        }
                
       
                
     
    }
       /////////////////////////////////////////////////////////
              
                     ///////////////////////////////////////////////////////
              public void SocietyAndPhoneAndAddress (  ArrayList <Employee> fibSpies ){
    
           //these are initalised so I can get the data
         EmployeeDB eDB = new EmployeeDB();
         
    
           
       
        
          
        
                
                for(int i=0;i<SocPhone.size();i++){
                	
            Employee e = SocPhone.get(i);
          
           
            for(int x=0; x< fibSpies.size(); x++){
                     Employee sp = fibSpies.get(x);
                     
                     
                     if(e.getAddress().equals(sp.getAddress()))
                     {
                    SocietyAndPhoneAndAddress.add(e);
                }
                
            }
            
        }
                
       
                
     
    }
              
       ////////////////////////////////////////////////
              
                          public void SocietyAndPhoneAndClub (  ArrayList <Employee> fibSpies ){
    
           //these are initalised so I can get the data
         EmployeeDB eDB = new EmployeeDB();
         
    
           
       
        
          
        
                
                for(int i=0;i<SocPhone.size();i++){
                	
            Employee e = SocPhone.get(i);
          
           
            for(int x=0; x< fibSpies.size(); x++){
                     Employee sp = fibSpies.get(x);
                     
                     
                   if(e.getMemberOf().substring(15, 22).equals(sp.getMemberOf().substring(15, 22)))
                     {
                    SocietyAndPhoneAndClub.add(e);
                }
                
            }
            
        }
                
       
                
     
    }  
              
              
       
       ///////////////////////////////////////////////////
       
           public ArrayList <Employee> getArrayListOfEmp(){
          return this.emp;
      }
               
       public void addEmployee(Employee e){
          
          emp.add(e);
       }
       
                   public ArrayList <Employee> getSocAndPhoneArrayList(){
	
	return this.SocPhone;
	
	
} 
                   
            
                   public ArrayList <Employee> getSocAndPhoneJobArrayList(){
	
	return this.SocPhoneJob;
	
	
}     
                   
                               
                   public ArrayList <Employee> getSocietyAndPhoneAndAddressArrayList(){
	
	return this.SocietyAndPhoneAndAddress;
	
	
}   
   
                                public ArrayList <Employee> getSocietyAndPhoneAndClubArrayList(){
	
	return this.SocietyAndPhoneAndClub;
	
	
}        
                   
}
    
    
    

