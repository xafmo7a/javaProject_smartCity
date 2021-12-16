 package account;

import Collections.AccountCollection;

import user.*;

public class Account  {
	private  String username;
	private  String password;
	private User user;
	public String report;
	
	
	public Account (String U , String P ){
		this.username=U;
		this.password=P;
		
			}

	public boolean isAdmin() {
		return this == AccountCollection.admin;
	}

	public void setAdmin() {
		AccountCollection.admin=this;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "account [username=" + username + ", password=" + password + "]";
	}
	public boolean auth(String username, String password){
        if(this.username.equalsIgnoreCase(username) && this.password.equals(password))
            return true;
        else{
           
            return false;
        }
        
	}
	public void setUser (User u){
		this.user = u;
	}

	public User getUser(){
		return this.user;
	}
     
    public boolean equals(Account acc){
    	return acc.getUsername().equals(this.username) && acc.getPassword().equals(this.password);
    }
	}


	
		
		
	
