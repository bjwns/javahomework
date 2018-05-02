package com.homework.java;

import java.util.Scanner;

public class work {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("请输入一个分数：");
		int score=Scanner.nextInt();
		if(score>=90&&score<=100) {
			System.out.println("一个优秀的分数,你好棒啊.s");
		}else if(score>=80&&score<=89){
			System.out.println("一个良好的分数,加油啊.");
		}else if(score>=70&&score<=79) {
			System.out.println("一个良的分数,再加把油。");
		}else if(score>=60&&score<=69) {
			System.out.println("一个刚刚及格的分数,还需努力。");
		}else if(score>=0&&score<=59) {
			System.out.println("这是一个悲剧。");
		}else {
			System.out.println("哇，您跑到了二次元！");	
			}
		}		
	}


