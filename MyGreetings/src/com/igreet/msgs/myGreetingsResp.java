package com.igreet.msgs;

public class myGreetingsResp {
	public String rmsg;
	public String greetResp(String fname,String gmsg){
		if (gmsg =="Hi"){
				rmsg = "Hello  " + fname + " , How are you doing";
		}
		else if (gmsg == "Bye"){
			rmsg= "Bye Bye " + fname;
		}
		return rmsg;
	}
}
