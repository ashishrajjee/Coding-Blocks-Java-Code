package _10Mislinous;

public class misli {

	public static void main(String[] args) {
		String a = "abcdefabcd";
		String d = "ab";
		String e = "cd";
		String f = "e";
		
		ans = Integer.MAX_VALUE;
		mislinous(a, d, e, f);
		System.out.println(ans);
	}
	static int ans;
	
	private static void mislinous(String a, String d, String e, String f) {
		
		if(a.length() == 0) {
			ans = 0;
			return;
		}
		
		int idx1 = a.indexOf(d);
		int idx2 = a.indexOf(e);
		int idx3 = a.indexOf(f);
		
		if(idx1 == -1 && idx2 == -1 && idx3 == -1) {
			ans = Math.min(ans, a.length());
			return;
		}
		
		if(idx1 != - 1) {
			String roa = a.substring(0, idx1) + a.substring(idx1 + d.length());
			mislinous(roa, d, e, f);
		}
		
		if(idx2 != - 1) {
			String roa = a.substring(0, idx2) + a.substring(idx2 + e.length());
			mislinous(roa, d, e, f);
		}
		
		if(idx3 != - 1) {
			String roa = a.substring(0, idx3) + a.substring(idx3 + f.length());
			mislinous(roa, d, e, f);
		}
	}
	
}
