package Collections;

import account.*;

import java.util.*;

public class AccountCollection  {
    public ArrayList<Account> accounts;
	public static Account currentacc;
	public static Account admin;
	
    public AccountCollection() {
        this.accounts = new ArrayList<Account>();
        currentacc = null;
        admin=null;
    }
    
    public  Boolean addAccount(Account aa){             
        if(accounts.contains(aa)){
            System.err.println(aa.getUsername() + " already exsits");
            return false;
        } 
        accounts.add(aa);
         return true;
     }
    public Boolean deleteAccount (Account aCC){
    	if (!accounts.contains(aCC)){
    		System.err.print("can't find this account");
    		return false;
    	}
    	accounts.remove(aCC);
    	return true;
    }
    public Account UpdateAccount(Account AcC , int index){
    	if (!accounts.contains(AcC)){
    		System.err.print("can't find this account");
    		return null;
    	}
    	index=accounts.indexOf(AcC);
    	accounts.set(index, AcC);
    	return AcC;
    }
    public boolean logIn(String username, String password){

        Account acc = new Account(username,password);
        for(Account a: accounts){
        	if(a.equals(acc)){
        		AccountCollection.currentacc = a;
        		return true;
        	}
        }
        return false;
        
    }
    
    public boolean logOut(){
    	if (currentacc == null){
    		return false;
    	}else{
      
        
        return true;
    }
    }
    @Override
	public String toString() {
    	StringBuilder strbld = new StringBuilder();
    	
    	for (Account acc : accounts){
    		strbld.append("[username: "+ acc.getUsername() + ", password: "+acc.getPassword()+"]\n");
    	}
		return strbld.toString();	
		}
    

}	
	



