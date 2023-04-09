package _10Mislinous;

import java.util.Scanner;

public class CodeChef_BodyBuilder {

	public static void main(String[] args) {
		
		System.out.println("1. Enter number of Test Case");					//1
		System.out.println("2. Enter total number of Exercise");			//2
		System.out.println("3. Enter total number of Relaxed per minutes");	//2
		System.out.println("4. Now enter each Exercise sprated by space ");	//10 11
		System.out.println("5. Then now enter each tension sprated space");	//10 10
		
		Scanner s = new Scanner(System.in);
		
		int nOTest = s.nextInt();			//nOTest = number of test
		
		for(int i = 1; i <= nOTest; i++) {
			
			int nOExercise = s.nextInt();	//nOExercise = number of Exercise
			int tRPM = s.nextInt();			//tRPM = Tension "Relaxed" per minute
			
			int aExercise[] = new int[nOExercise];
			int bTension[] = new int[nOExercise];
			
			for(int j = 0; j < nOExercise; j++) {
				aExercise[j] = s.nextInt();
			}
			for(int j = 0; j < nOExercise; j++) {
				bTension[j] = s.nextInt();
			}
			
			long maxTension = bTension[0];
			long tension = bTension[0];
			
			for(int j = 1; j < nOExercise; j++) {
				
				tension = tension - (aExercise[j] - aExercise[j- 1]) * tRPM;
				
				if(tension < 0) {
					tension = 0;
				}
				
				tension = tension + bTension[j];
				
				if(tension > maxTension) {
					maxTension = tension;
				}
			}
			System.out.println(maxTension);
		}
		s.close();
	}
	
}
