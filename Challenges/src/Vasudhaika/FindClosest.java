package Vasudhaika;

import java.util.Scanner;

public class FindClosest {
	public static int[] arr;
	public static int target;
	
	public static int findClose(){
		int diff=0,min=0,loc=0;
		for(int i=0; i<arr.length;i++) {
			if(target == arr[i]) {
				return target;
			} else {
				diff = Math.abs(target - arr[i]);
				if((min > diff)||(min == 0)) {
					min = diff;
					loc = i;
				}
			}
		}
		return arr[loc];
	}
	
	public static void main(String[] args) {
		int ar[] = {-7, -4, -1, 0, 2, 5, 8};
		arr = ar;
		Scanner sc = new Scanner(System.in);
		target = sc.nextInt();
		System.out.println(findClose());
		
	}
	

}
