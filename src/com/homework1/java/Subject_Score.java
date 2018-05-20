package com.homework1.java;

public class Subject_Score {
      private String name;   protected String review; 
      private String classroom;  protected double s1;
      protected String sub1;       protected double s2;
      protected String sub2;       protected double s3;
      protected String sub3;       protected double s4;
      protected String sub4;
	public Subject_Score(String sub1,String sub2,String sub3,String sub4) {
		this.sub1= "代数";
		this.sub2= "英语";
		this.sub3= "语文";
		this.sub4= "政治";
	}
	public Subject_Score(double s1, double s2, double s3, double s4) {
		this("代数","英语","语文","政治");
		this.s1 = 80.5;
		
		this.s2 = 78.5;
		
		this.s3 = 88.0;
		
		this.s4 = 91.0;
		
	} 
	public double getSum() {
		return s1+s2+s3+s4;
		
	}
	public double getAverage() {
		return (s1+s2+s3+s4)/4;
	}	
	public String getRemark(String review) {
			return this.review=review;
	
		}
	public String setRemark(String review) {
		return review;

	}
	
	
}
