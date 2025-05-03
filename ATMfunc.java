package variables;
import variables.Account;
import variables.ATMfunc;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.lang.System;



public class ATMfunc {
	    private List<Account> accounts;
	    private Account currentacc;
	    public ATMfunc(){
	        accounts=new ArrayList<>();
	        accounts.add(new Account("12345","3108",5000));
	        accounts.add(new Account("67890","0707",8000));
	    }
	    public Account autherticate(String accnumber,String accpin){
	        for(Account acc :accounts){
	            if(acc.getaccnumber().equals(accnumber) && acc.getaccpin().equals(accpin)){
	                return acc;
	            }
	            
	         }
	        return null;
	     }

	    
	    public void start(){
	        Scanner scan=new Scanner(System.in);
	        System.out.println("enter accnumber: ");
	        String accnumber=scan.nextLine();
	        System.out.println("enter pin ");
	        String pin=scan.nextLine();
	        
	        currentacc=autherticate(accnumber, pin);
	        if(currentacc==null){
	              System.out.println("Invalid number verify");
	                return;
	        }
	        while (true) {
	            System.out.println("------ATM menu------");
	            System.out.println("1.check balance");
	            System.out.println("2.withdraw");
	            System.out.println("3.deposite");
	            System.out.println("4.exit");
	            int ch=scan.nextInt();
	            switch(ch){
	                case 1:{
	                     System.out.println("your balance is  " +currentacc.getbalance());
	                     break;

	                }
	                case 2:{
	                    System.out.println("enter your amount ");
	                    double amount=scan.nextDouble();
	                    if(currentacc.withdraw(amount)){
	                        System.out.println("successfully withdraw and balance "+currentacc.getaccnumber());
	                        break;
	                    }
	                    else
	                      System.out.println("invalid amount ");
	                      break;
	                }
	                case 3:{
	                    System.out.println("enter your deposite amount");
	                    double amount=scan.nextInt();
	                    currentacc.deposite(amount);
	                    System.out.println("now your current balance "+ currentacc.getbalance());
	                    break;

	                }
	                case 4:{
	                    System.out.println("thank you for useing our ATM");
	                    break;
	                }
	                default:{
	                    System.out.println("invaild try again");
	                }
	            }


	            
	        }
	     }
	


}
