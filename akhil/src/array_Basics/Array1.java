package array_Basics;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int nums[]=new int[5];
		
		//input of the array
		
		System.out.print("enter the arrays ");
		for (int i=0;i<=4;i++) {
			nums[i]=sc.nextInt();
			
		}
		
		
		for (int i=0;i<=4;i++) {
			System.out.print(nums[i]+" ");
		}
		

	}

}
