package com.crnts.assignment;

public class Pattern1 {
	public void pattern() {
		int star=1,space=4;
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			if(i<5) {
			star++;
			space--;
			}
			else {
				star--;
				space++;
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Pattern1 pattern1=new Pattern1();
		pattern1.pattern();
	}
}
