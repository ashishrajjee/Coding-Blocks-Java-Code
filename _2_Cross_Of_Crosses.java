import java.util.Scanner;

public class _2_Cross_Of_Crosses {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int test = s.nextInt();
	    for (int t = 1; t <= test; t++) {
	        int n = s.nextInt();
	        for (int i = 1; i <= n; i++) {
		        for (int j = 1; j <= n; j++)
                {
                    if (j == i || j == (n + 1 - i))
                        System.out.print("\\/");
                    else
                        System.out.print("  ");
                }
                System.out.println();
                for (int j = 1; j <= n; j++)
                {
                    if (j == i || j == (n + 1 - i))
                        System.out.print("/\\");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
	    }
	    s.close();
	}
}
