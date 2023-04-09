package _10Mislinous;

public class SunLightOnTopBulding {

	public static void main(String[] args) {
		
		int[] arr = {7, 4, 8, 2, 9};
		int maxSunLightOnBulding = maxBuldingOnSunLight(arr);
		System.out.println(maxSunLightOnBulding);
	}

	private static int maxBuldingOnSunLight(int[] arr) {
		int max = Integer.MIN_VALUE;
		int countBulding = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= max) {
				max = arr[i];
				countBulding++;
			}
		}
		return countBulding;
	}
}
