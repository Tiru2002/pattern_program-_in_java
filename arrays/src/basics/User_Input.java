package basics;

import java.util.Scanner;

public class User_Input {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int arr[]= new int [size];
		System.out.println("enter element in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		//display array:
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" | ");
		}

	}

}
