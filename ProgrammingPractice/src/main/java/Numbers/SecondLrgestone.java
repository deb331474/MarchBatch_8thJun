package Numbers;

import java.util.Arrays;

public class SecondLrgestone {

	public static void main(String[] args) {
		
		int[] array = {14, 45, 12, 36, 36, 36, 47, 58, 65, 78, 78};
		
		Arrays.sort(array);
		
		int uniqueCount=0;
		
		int[] uniqueArray=new int[array.length];
		
		for(int i=0;i<array.length-1;i++) {
			if(array[i]!=array[i+1]) {
				uniqueArray[uniqueCount++]=array[i];
			}
		}
		
		uniqueArray[uniqueCount++]=array.length-1;
		
		if(uniqueCount<2) {
			System.out.println("There is no second largest without duplicates");
		}
		else {
			int secondLargest=uniqueArray[uniqueCount-2];
			System.out.println("The second largest number without duplicates is: " + secondLargest);
		}

	}

}
