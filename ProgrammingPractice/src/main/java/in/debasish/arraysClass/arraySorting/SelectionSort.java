package in.debasish.arraysClass.arraySorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		
		System.out.println("enter the numbers u want in the array:");

		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			int minIndex=0;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
				}
			}
			int temp=a[minIndex];
			a[minIndex]=a[i];
			a[i]=temp;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
