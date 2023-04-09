import java.util.Scanner;
public class _3_Bit_Swapping {
	//wrong
	public static int swap(int[][] arr)
    {
        int n = arr.length;
	    for (int i = 0; i < n; i++)
	    {
	        for (int j = 0; j < n; j++)
	        {
	            if ((arr[0][0] ^ arr[0][j] ^ arr[i][0] ^ arr[i][j]) == 1)
	            	return -1;
	        }
	        
	    }
	    int rowSum = 0;
	    int colSum = 0;
	    int rowSwap = 0;
	    int colSwap = 0;
	    for (int i = 0; i < n; i++)
	    {
	        rowSum += arr[i][0];
	        colSum += arr[0][i];
	        int n1 = 0;
	        int n2 = 0;
	        if(arr[i][0] == i % 2)
	        n1 = 1;
	        if(arr[0][i] == i % 2)
	        n2 = 1;
	        rowSwap += n1;
	        colSwap += n2;
	    }
	    if (rowSum != n / 2 && rowSum != (n + 1) / 2)
	        return -1;
	    if (colSum != n / 2 && colSum != (n + 1) / 2)
	        return -1;
	   if (n % 2 == 1)
	   {
	        if ((colSwap % 2) == 1)
	            colSwap = n - colSwap;
	        if ((rowSwap % 2) == 1)
	        rowSwap = n - rowSwap;
	       
	   }
	    else
	    {
	        colSwap = Math.min(colSwap, n - colSwap);
	        rowSwap = Math.min(rowSwap, n - rowSwap);
	        
	    }
	    return (rowSwap + colSwap) / 2;
        
    }
    public static void main (String[] args)
    {
    	Scanner s = new Scanner(System.in);
    	int test = s.nextInt();
    	for(int i = 1; i <= test; i++) {
    		int m = s.nextInt();
    		int n = s.nextInt();
    		
    		int[][] arr = new int[m][n];
    		
    		for(int j = 0; j < m; j++) {
    			for(int k = 0; k < n; k++) {
    				arr[j][k] = s.nextInt();
    			}
    		}
    		int ans = swap(arr);
    		System.out.println(ans);
    	}
    	s.close();
    }
}
