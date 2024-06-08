package in.debasish.arraysClass.arraySorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		
		System.out.println("Enter the numbers u want:");
		
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Sorted Array is:");
		
		for(int i=0;i<n;i++) {
			System.out.println(a[i]+" ");
		}
		
	}

}
