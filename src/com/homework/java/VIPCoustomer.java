package com.homework.java;

public class VIPCoustomer extends Coustomer {
	private int level;
     
	public void touSu() {
    	 
	System.out.println("投诉信息："+"\n"+"VIP3级别"+getName()+"投诉中...");
  }
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
    

}
