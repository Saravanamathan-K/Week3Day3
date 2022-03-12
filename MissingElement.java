package Week3Day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
			List<Integer> sortedList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
			Collections.sort(sortedList);
			System.out.println("Sorted numbers are" +(sortedList));
			int size = sortedList.size();
			
			for(int i=0;i<size;i++) {
				if(i+1 != sortedList.get(i)) {
					System.out.println("The Missing number is "+(i+1));
					
				}
				
			}


	}

}
