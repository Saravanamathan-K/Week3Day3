package Week3Day2;

import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargest {

public static void main(String[] args) {
		
	ArrayList<Integer> Num = new ArrayList<Integer>();
		
		Num.add(7);
		Num.add(4);
		Num.add(3);
		Num.add(7);
		Num.add(11);
		Num.add(5);
		
		Collections.sort(Num);
		
		System.out.println("Ascending order of the given numbers are: " +Num);
		
		int Num2 = Num.size();
		System.out.println("size of the list of number is " + Num2);
		
		System.out.println("second element from the last number is " + Num.get(Num2-2));
}

	}


