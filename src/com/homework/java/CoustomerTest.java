package com.homework.java;

public class CoustomerTest {

	public static void main(String[] args) {
		Coustomer coustomer =new Coustomer();
		coustomer.setName("张三女士/先生");
		coustomer.service();
        
		
		VIPCoustomer VIP= new VIPCoustomer();
		VIP.setName("张三先生/女士");
		VIP.touSu();
	}

}
