/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedata;

/**
 *
 * @author Darragh
 */
public class Menu {
    
    
    public void welcome (){
        System.out.println("");
        System.out.println("**************************************");
        System.out.println("");
        System.out.println(" Welcome to the spy finder 2000 ");
        System.out.println(" Please select from the options below : ");
        System.out.println("");
        
        System.out.println(" 1: For spies with fibonacci ID numbers ");
        System.out.println("");
        System.out.println(" Employees with one Correlation: ");
        System.out.println(" 2: For employees with same society membership as know spies ");
         System.out.println(" 3: For employees with same job membership as know spies ");
         System.out.println("");
         System.out.println("For Employees with Two Correclations : ");
        System.out.println(" 4: For employees in the same society and have same phone network as spies");
        System.out.println(" 5: For employees in the same job and have same club membership as spies");
        System.out.println("");
        System.out.println("For Employees with Three Correclations : ");
        System.out.println("");
        System.out.println(" 6: For suspected who have matching society,phone and job attributes with known spies ");
          System.out.println("7: For suspected who have matching job,club and address attributes with known spies ");
          System.out.println("8: For suspected who have matching Society,Phone network and address attributes with known spies ");
         System.out.println("9: For suspected who have matching Society,Phone network and Club attributes with known spies ");
          System.out.println("10: For suspected who have matching Job,Phone network and Club attributes with known spies ");
            System.out.println("11: For suspected who have matching Job,Society  and Address attributes with known spies ");
        System.out.println(" 0: To Exit");
        System.out.println("");
    
    }
    
    public void exit (){
    
        System.out.println(" GoodBye");
    }
    
}
