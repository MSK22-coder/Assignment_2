package com.learn.Assignment_2;

import java.util.Scanner;
import java.util.Arrays;
public class DigitalLockAnalyzer {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter code:");
		
		int n=sc.nextInt();
		
		if(n<=0) {
			System.out.println("Error!! Enter only positive number");
			System.exit(0);
		}
		int n1=n;
		int c=0;
		while(n>0) {
			n=n/10;
			c=c+1;
		}
		//System.out.println(c);
		int d=0,i=0;
		int a[]=new int[c];
		while(n1>0) {
			d=n1%10;
			if(d%2==0) {
				a[i]=d*d;
				i++;
			}
			else {
				a[i]=d*d*d;
				i++;
			}
			n1=n1/10;
			
		}
		//System.out.println(Arrays.toString(a));
		
		int sum=0;
		boolean flag=false;
		for(i=0;i<a.length;i++) {
			sum=sum+a[i];
			if(a[i]%5==0) {
				flag=true;
			}
		}
		//System.out.println(sum);
		
		if(sum%2==0) {
			sum=sum/2;
		}
		else {
			sum=(sum*3)+1;
		}
		System.out.println("New sum: "+sum);
		
		if(sum<=50) {
			System.out.println("Weak");
		}
		else if(sum>50 && sum<=150) {
			System.out.println("Moderate");
		}
		else if(sum>150 && sum<=300){
			System.out.println("Strong");
		}
		else {
			System.out.println("Ultra Secure");
		}
		
		if(flag==true) {
			System.out.println("Digit '5' found -> Hidden Security Trigger Activated");
		}
	}

}
