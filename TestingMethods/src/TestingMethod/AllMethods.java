package TestingMethod;

import java.util.Arrays;

public class AllMethods {

	public double max(double a, double b) {


		if (a < b)   

		{
			return b;  
		}
		else { 
			return a ;
		}

	}
	public double mult(double a, double b) {
		return a * b; 
	}




	public int existsInArray(int [] arr, int a) {	



		for (Integer index = 0; index < arr.length; index++)
		{
			if ( arr[index] == a )
				return index; 
		}

		return -1;




	}

	public int areArrayEquals(int [] a, int [] b) {

		if(Arrays.equals(a,b)) {
			return 0;
		}
		else {		
			return -1;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AllMethods at=new AllMethods();

		System.out.println(at.max(6.6, 4.98));
		System.out.println(at.max(4.98, 4.98));
		System.out.println(at.max(4.98, 6.6));
		System.out.println(at.mult(6, 4));
		System.out.println(at.existsInArray(new int []{1, 2, 3}, 2));
		System.out.println(at.existsInArray(new int []{1, 2, 3}, 6));
		System.out.println(at.areArrayEquals(new int []{1, 2, 3}, new int []{1, 2, 3}));
		System.out.println(at.areArrayEquals(new int []{1, 5, 3}, new int []{8, 2, 3}));



	}}