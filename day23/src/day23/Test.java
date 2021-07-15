package day23;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		/*
		int []arElevator = new int[5];
		Random r = new Random();
		int cnt = 0;
		cnt=r.nextInt(6);
		for(int i=0; i<cnt;i++) {
			arElevator[i]=1;
			System.out.println(i+"·£´ýÀÓ"+arElevator[i]);
		}
		*/
		
		Random r = new Random();
		int max=10;
		int min=-3;
		int choice = 0;
		choice=r.nextInt(max+(min*-1)+1)+min;
				
		choice = r.nextInt(max+(min*-1)+1)+min;
		System.out.println(choice);
		
	}
	
}
