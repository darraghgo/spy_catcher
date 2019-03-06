/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedata;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author VilkaS
 */
public class Main implements Serializable{
        
        
        public Main (){
        
            
            EmployeeDB eDB = new EmployeeDB();
            
            //instantiate menu class
            
            Menu menu = new Menu();
            
             
             //instantiate spy database 
           SpyDB sdb = new SpyDB();
           
           sdb.fibTest(); //This builds the arraylist of known spies
           
        
            //Need somewhere to hold the spies in main to to passed elsewhere
           ArrayList <Employee>fibSpies = sdb.getArrayList();
           
           //Class to find employees with same jobs as syarting point
           SpyJobs sj = new SpyJobs(fibSpies);//passing fibSpies arraylist
           
           ArrayList <Employee> jobs = sj.getJobArrayList();
          
           //Class to find employees with same society as syarting point
           SpySociety sc = new SpySociety(fibSpies);
           

          //methods to build arraylists inside each class
          sj.SpyJobsClub(fibSpies);
          sj.SpyJobsClubAddress(fibSpies);
          sj.SpyJobsClubPhone(fibSpies);
          sj.SpyJobsSoc(fibSpies);
          sj.JobsAndSocAdd(fibSpies);

         sc.SpySocPhone(fibSpies);
           sc.SpySocPhoneJob(fibSpies);
           sc.SocietyAndPhoneAndAddress(fibSpies);
           sc.SocietyAndPhoneAndClub(fibSpies);
           

           
           
           
           
           ///////////////////////////////////////////////////////////
           //       Menu  here                               //
           /////////////////////////////////////////////////////////
           
           //Using switch to call print methods for each of the findings
           boolean exit = false;
           
           //switch is wrapped in do while loop so it will contiune to loop
           do{
         menu.welcome();//prints text for menu
          
         //takes user selection
           Scanner scanner = new Scanner(System.in);
           int options = scanner.nextInt();
           
           switch(options){
          // Fibonaci Spies
               case 1:  sdb.printSpies();
           break;
            
                 //One Corraltion
               case 2: sc.printSocMatches();
               break;
               
               case 3: sj.printJobMatches();               
                 break;
          //Two Corraltions
               case 4 : sc.printSocPhoneMatches();
               break;
               
               case 5 : sj.printJobAndClubMatches();
               break;
               
      
      //Three Corraltions
               case 6 : sc.printSocPhoneJobMatches();
               break;
               
               case 7 : sj.printJobAndClubAddressMatches();
               break;
                    
               case 8: sc.printSocietyAndPhoneAndAddressMatches();
               break;
               
               case 9: sc.printSocietyAndPhoneAndClubMatches();
               break;
               
               case 10: sj.printJobAndClubPhoneMatches();
               break;
               
               case 11: sj.printJobAndSocAdd();
               break;
               
               default : exit = true;
           }
        }while(!exit);
           menu.exit();
           }
        
        //to catch errors
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {

        //new main created to work around static and make it easier to pass methods 
      new Main();


        }
  
    
    }

    
       
