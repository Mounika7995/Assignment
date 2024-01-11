package com.crnts.assignment;

public class Pattern2 {
	public void pattern() {
		for(int value1=1;value1<=5;value1++) {
			for(int value2=1;value2<=5;value2++) {
				if(value1==1 || value1==5) {
					System.out.print("*");
				}else if(value2==1 ||value2==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern2 pattern2=new Pattern2();
		pattern2.pattern();
	}
}
