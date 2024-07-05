package twoD_Array;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row =sc.nextInt();
		int col=sc.nextInt();
		System.out.println("enter search num: ");
		int x=sc.nextInt();
		int [][]number=new int [row] [col];
		
		//insert:
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				number[i][j]=sc.nextInt();			}
		}

		for (int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(number[i][j]+" | ");
			}
			System.out.println(" ");
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(x==number[i][j]){
				System.out.println("("+i+","+j+")");
				}
			}
		}
	}

}
