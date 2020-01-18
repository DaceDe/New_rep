package jtm.tasks.fundamentals;

import java.util.Arrays;

public class EvenNumbers {

    //TODO
        /*
            Complete the function which takes two arguments and returns all numbers which
            are divisible by the given divisor.
            First argument is an array of numbers and the second is the divisor.
            Example:
            divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
         */
    public static int[] divisibleBy(int[] numbers, int divider) {
    	System.out.println(Arrays.toString(numbers));
    	System.out.println(divider);
    	
    	int [] newMassive= new int [numbers.length];
    	int j=0;
    	for (int i =0; i<numbers.length; i++){
    		if (numbers[i] % divider==0){
    			newMassive[j]=numbers[i];
    			j++;
    		}
    		
    	}
    	int k = j--;
    	int[] massiveDivider = new int [k];
    	for (int s =0; s<k; s++){
    		massiveDivider[s]= newMassive[s];
    	}
    	System.out.println(Arrays.toString(newMassive));
    	System.out.println(Arrays.toString(massiveDivider));
        return massiveDivider;
    }}
