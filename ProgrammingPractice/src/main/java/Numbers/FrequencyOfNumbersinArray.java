package Numbers;

import java.util.HashMap;

public class FrequencyOfNumbersinArray {

	public static void main(String[] args) {

		int[] numbers = {1, 2, 2, 3, 4, 4, 4,4,4,5};
		
		HashMap<Integer,Integer> numFreq=new HashMap<Integer, Integer>();
		
		for(int num:numbers) {
			numFreq.put(num, numFreq.getOrDefault(num,0)+1);
		}
		for(int num:numFreq.keySet()) {
			System.out.println("Numbers "+num+",Frequency: "+numFreq.get(num));
		}
		
	}

}
