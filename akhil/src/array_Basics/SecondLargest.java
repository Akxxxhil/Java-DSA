package array_Basics;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("size is : " );
		int n=sc.nextInt();
		System.out.println("Array  is : " );
		int arr[]=new int [n];
		int max=arr[0];
		int sec = 0;
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();	
		}
		for (int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for (int i=0;i<n;i++) {
			if(arr[i]!=max) {
				sec=Math.max(arr[i], sec);
			}
		}
		
		System.out.println("max is : " + max);
		System.out.println("smax is : " + sec);

	}

}
