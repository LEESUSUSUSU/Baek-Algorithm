

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n번의 반복
		String temp = "";
		
		for(int i = 0 ; i<n; i++ ) {
		
		temp += "*";
		
		System.out.println(temp);
	}
	
	

	}

}
