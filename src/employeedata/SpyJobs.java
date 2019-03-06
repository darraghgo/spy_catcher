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
public class SpyJobs {
    //Trying to make an Arraylist which contains employees from Staff , that have job as 40 spies from SpyDB
    
    
    
    
    //Declaring ArrayList which will hold employees with same jobs as 40 spies
    ArrayList <Employee> Jobs = new ArrayList <Employee>();
    
     ArrayList <Employee> JobsSoc = new ArrayList <Employee>();
    
    //holds employees who get filtered through jobs arraylist and also have clubs that match fib spies
     ArrayList <Employee> JobsAndClub = new ArrayList <Employee>();
     
      //holds employees who get filtered through jobsAndClub arraylist and also have address that match fib spies
     ArrayList <Employee> JobsAndClubAddress = new ArrayList <Employee>();
     
          ArrayList <Employee> JobsAndClubPhone = new ArrayList <Employee>();
          
                ArrayList <Employee> JobsAndSocAdd = new ArrayList <Employee>();
     
     ArrayList <Employee> emp = new ArrayList <Employee>();
      
     
    public void printJobMatches(){
        //This is for printing the arraylist of employees with same jobs as spies
        System.out.println("Printing job matches ===================");
        System.out.println("Printing job matches ===================");
        System.out.println("Printing job matches ===================");
        
        
        /* Removes Duplicate entries by using HashSet*/
        
                     Collection<Employee> hs = new HashSet<Employee>(Jobs);
                    
               for(Employee Jobs : hs) {
            System.out.println(Jobs);
            
        }
               System.out.println("");
               System.out.println("The number of suspects is : " + hs.size());
    }
       public void printJobAndClubMatches(){
        //This is for printing the arraylist of employees with same jobs and clubs as spies
        System.out.println("Printing job and Club matches ===================");
        System.out.println("Printing job and Club matches ===================");
        System.out.println("Printing job and Club matches ===================");
 
                
        /* Removes Duplicate entries by using HashSet*/
        
                     Collection<Employee> hs = new HashSet<Employee>(JobsAndClub);
                    
               for(Employee JobsAndClub : hs) {
            System.out.println(JobsAndClub);
        }
               System.out.println("");
               System.out.println("The number of suspects is : " + hs.size());
        
        
    }
       
              public void printJobAndClubAddressMatches(){
        //This is for printing the arraylist of employees with same jobs and clubs and address as spies
        System.out.println("Printing job , Club and Address matches ===================");
        System.out.println("Printing job , Club and Address matches ===================");
        System.out.println("Printing job , Club and Address matches ===================");

                
        /* Removes Duplicate entries by using HashSet*/
        
                     Collection<Employee> hs = new HashSet<Employee>(JobsAndClubAddress);
                    
               for(Employee JobsAndClubAddress : hs) {
            System.out.println(JobsAndClubAddress);
        }
               System.out.println("");
               System.out.println("The number of suspects is : " + hs.size());
        
        
    }
    
                       public void printJobAndClubPhoneMatches(){
        //This is for printing the arraylist of employees with same jobs and clubs and address as spies
        System.out.println("Printing job , Club and Address matches ===================");
        System.out.println("Printing job , Club and Address matches ===================");
        System.out.println("Printing job , Club and Address matches ===================");

                
        /* Removes Duplicate entries by using HashSet*/
        
                     Collection<Employee> hs = new HashSet<Employee>(JobsAndClubPhone);
                    
               for(Employee JobsAndClubPhone : hs) {
            System.out.println(JobsAndClubPhone);
        }
               System.out.println("");
               System.out.println("The number of suspects is : " + hs.size());
        
        
    }     
                       
                       
                       //JobsAndSocAdd
                       
                                              public void printJobAndSocAdd(){
        //This is for printing the arraylist of employees with same jobs and clubs and address as spies
        System.out.println("Printing job , soc and Address matches ===================");
        System.out.println("Printing job , soc and Address matches ===================");
        System.out.println("Printing job , soc and Address matches ===================");

                
        /* Removes Duplicate entries by using HashSet*/
        
                     Collection<Employee> hs = new HashSet<Employee>(JobsAndSocAdd);
                    
               for(Employee JobsAndSocAdd : hs) {
            System.out.println(JobsAndSocAdd);
        }
               System.out.println("");
               System.out.println("The number of suspects is : " + hs.size());
        
        
    }   
              
    
       public SpyJobs (  ArrayList <Employee> fibSpies ){
    
           //these are initalised so I can get the data
         EmployeeDB eDB = new EmployeeDB();
         
      
          
           
       
        
          
                //looping through staff list getting each Employee
       
                for(int i=0;i<eDB.staff.size();i++){
                	
            Employee e = eDB.staff.get(i);
          
            //Looping through list of 40 know spies getting their jobs
            for(int x=0; x< fibSpies.size(); x++){
                     Employee sp = fibSpies.get(x);
                   
                     //comparing two and adding matches to Jobs Arraylist
                if(e.getJobTitle().equals(sp.getJobTitle())){
                    Jobs.add(e);
                    if(e.getId().contains("fib"))
                    {Jobs.remove(e);
                            }
                }
            }
        }

       
    }
       
       /////////////////////////////////////////////////////////
           
       public void SpyJobsClub (  ArrayList <Employee> fibSpies ){
    
           //these are initalised so I can get the data
         EmployeeDB eDB = new EmployeeDB();
         
    
          
           
       
        
          
                //looping through Jobs list getting each Employee
                
                for(int i=0;i<Jobs.size();i++){
                	
            Employee e = Jobs.get(i);
          
            //Looping through list of 40 know spies getting their clubs
            for(int x=0; x< fibSpies.size(); x++){
                     Employee sp = fibSpies.get(x);
                  
                     //comparing two and adding matches to JobsAndClub Arraylist
                     if(e.getMemberOf().substring(15, 22).equals(sp.getMemberOf().substring(15, 22)))
                     {
                    JobsAndClub.add(e);
                }
                
            }
            
        }
                
       
                
     
    }
       
       ////////////////////////////////////////////////////////
       
             /////////////////////////////////////////////////////////
           
       public void SpyJobsClubAddress (  ArrayList <Employee> fibSpies ){
    
           //these are initalised so I can get the data
         EmployeeDB eDB = new EmployeeDB();
         
        
          
           
       
        
          
                //looping through jobs and club list getting each Employee
                
                for(int i=0;i<JobsAndClub.size();i++){
                	
            Employee e = JobsAndClub.get(i);
          
            //Looping through list of 40 know spies getting their address
            for(int x=0; x< fibSpies.size(); x++){
                     Employee sp = fibSpies.get(x);
                    
                     //comparing two and adding matches to JobsAndClubAddress Arraylist
                     //if(e.getAddress().substring(0,4).equals(sp.getAddress().substring(0, 4)))
                     if(e.getAddress().equals(sp.getAddress()))
                     {
                    JobsAndClubAddress.add(e);
                }
                
            }
            
        }
                
       
                
     
    }
       
       /////////////////////////////////////////////////////////
       
              public void SpyJobsSoc (  ArrayList <Employee> fibSpies ){
    
           //these are initalised so I can get the data
         EmployeeDB eDB = new EmployeeDB();
         
        
          
           
       
        
          
                //looping through jobs and club list getting each Employee
                
                for(int i=0;i<Jobs.size();i++){
                	
            Employee e = Jobs.get(i);
          
            //Looping through list of 40 know spies getting their address
            for(int x=0; x< fibSpies.size(); x++){
                     Employee sp = fibSpies.get(x);
                    
                     //comparing two and adding matches to JobsAndClubAddress Arraylist
                     //if(e.getAddress().substring(0,4).equals(sp.getAddress().substring(0, 4)))
                     if(e.getMemberOf().substring(0,7).equals(sp.getMemberOf().substring(0,7)))
                     {
                    JobsSoc.add(e);
                }
                
            }
            
        }
                         
     
    }
              //////////////////////////////////////////////////
              
              
                     public void JobsAndSocAdd (  ArrayList <Employee> fibSpies ){
    
           //these are initalised so I can get the data
         EmployeeDB eDB = new EmployeeDB();
         
        
          
           
       
        
          
                //looping through jobs and club list getting each Employee
                
                for(int i=0;i<JobsSoc.size();i++){
                	
            Employee e = JobsSoc.get(i);
          
            //Looping through list of 40 know spies getting their address
            for(int x=0; x< fibSpies.size(); x++){
                     Employee sp = fibSpies.get(x);
                    
                     //comparing two and adding matches to JobsAndClubAddress Arraylist
                     //if(e.getAddress().substring(0,4).equals(sp.getAddress().substring(0, 4)))
                     if(e.getAddress().equals(sp.getAddress()))
                     {
                    JobsAndSocAdd.add(e);
                }
                
            }
            
        }
                         
     
    }
       
       
       
       ////////////////////////////////////////////////////////
       
              public void SpyJobsClubPhone (  ArrayList <Employee> fibSpies ){
    
           //these are initalised so I can get the data
         EmployeeDB eDB = new EmployeeDB();
         
        
          
           
       
        
          
                //looping through jobs and club list getting each Employee
                
                for(int i=0;i<JobsAndClub.size();i++){
                	
            Employee e = JobsAndClub.get(i);
          
            //Looping through list of 40 know spies getting their address
            for(int x=0; x< fibSpies.size(); x++){
                     Employee sp = fibSpies.get(x);
                    
                     //comparing two and adding matches to JobsAndClubAddress Arraylist
                     if(e.getPhone().contains("083")||e.getPhone().contains("084")||e.getPhone().contains("088")||e.getPhone().contains("089"))
                
                     {
                    JobsAndClubPhone.add(e);
                }
                
            }
            
        }
                
       
                
     
    }
       
       
       
       
       // Below to access arraylists elsewhere
       /////////////////////////////////////////////////////////
           public ArrayList <Employee> getArrayListOfEmp(){
          return this.emp;
      }
               
       public void addEmployee(Employee e){
          
          emp.add(e);
       }
       
       public ArrayList <Employee> getJobArrayList(){
	
	return this.Jobs;
	
	
}
            public ArrayList <Employee> getJobAndClubArrayList(){
	
	return this.JobsAndClub;
	
	
}  
            
                        public ArrayList <Employee> getJobsSocArrayList(){
	
	return this.JobsSoc;
	
	
}  
            
     
                        public ArrayList <Employee> getJobAndClubAddressArrayList(){
	
	return this.JobsAndClubAddress;
	
	
} 
                        
                          public ArrayList <Employee> getJobAndClubPhoneArrayList(){
	
	return this.JobsAndClubAddress;
	
	
}                     
                                public ArrayList <Employee> getJobsAndSocAddArrayList(){
	
	return this.JobsAndSocAdd;
	
	
}                   
}
       

