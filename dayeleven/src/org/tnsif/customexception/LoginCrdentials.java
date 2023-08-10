package org.tnsif.customexception;
//Program to demonstrate on User-Defined exception
public class LoginCrdentials extends Exception {

	//Private Data Member
	private String str;

	//Getter and Setter
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	//Parameterized constructor
		public LoginCrdentials(String str) {
			super();
			this.str = str;
		}
		
	@Override
	public String toString() {
		return "LoginCrdentials [str=" + str + "]";
	}
		
}
