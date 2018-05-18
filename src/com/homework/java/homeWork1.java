package com.homework.java;



public class homeWork1 {

	public static void main(String[] args) {
		CarHonda carhonda = new CarHonda();
         System.out.println("第一辆车的信息如下:");
         carhonda.showProduce();
         
         carhonda.showColor();
         carhonda.showModel();
	
         carhonda  = new CarHonda("亮白色");
         System.out.println("第二辆车的信息如下:");
         carhonda.showProduce();
         
         carhonda.showColor();
         carhonda.showModel();
         
         carhonda  = new CarHonda("蓝色","卡车","天津一汽");
         System.out.println("第三辆车的信息如下:");
         carhonda.showProduce();
         
         carhonda.showColor();
         carhonda.showModel();
	}
         
}
