package _13LeetCode;

public class KLeetCodeGasStation {

	public static void main(String[] args) {
		
		int[] gas = {1, 2, 3, 4, 5};
		int[] cost = {3, 4, 5, 1, 2};
		
		System.out.println(gasStation(gas, cost));
		
	}
	
	public static int gasStation(int gas[], int cost[]) {
		
		int totalGasUse = 0;
		int startIndex = 0;
		int currentGasCost = 0;
		
		for(int i = 0; i < cost.length; i++) {
			
			totalGasUse += (gas[i] - cost[i]);
			currentGasCost += (gas[i] - cost[i]);
			
			if(currentGasCost < 0) {
				startIndex = i + 1;
				currentGasCost = 0;
			}
		}
		if(totalGasUse < 0)
			return -1;
		else
			return startIndex;
	}

}
