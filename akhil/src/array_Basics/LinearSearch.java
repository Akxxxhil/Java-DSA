package array_Basics;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		
	Scanner scn=new Scanner (System.in);
	System.out.println("enter the number");
	int x=scn.nextInt();
	int arr[]= {1,2,3,4,5};
	
	boolean flag=false;
	for (int i=0;i<arr.length;i++) {
		if(arr[i]==x) {
			flag=true;
			break;
		}
	}
	
	if(flag==true) {
		System.out.println("element found");
	}else {
		System.out.println("element not  found");
	}
	

	}

}
