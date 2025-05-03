package variables;

public class Account {
	    private String accnumber;
	    private String accpin;
	    private double balance;
	    public Account(String accnumber,String accpin,double balance){
	        this.accnumber=accnumber;
	        this.accpin=accpin;
	        this.balance=balance;
	    }
	    public String getaccnumber(){ return accnumber;}
	    public String getaccpin(){ return accpin;}
	    public double getbalance(){ return balance;}
	    
	    public void deposite(double amount){
	        balance+=amount;

	    }
	    public boolean withdraw(double amount){
	        if (amount<=balance){
	            balance-=amount;
	            return true;
	        }  
	        else{
	            return false;
	        }    
	        
	    }
	    
}
