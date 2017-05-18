public class Q1{

	public static void main(String[] args){
		System.out.println(fun("1", ""));
	}
	
	public static boolean fun(String s1, String s2){
		int l1 = s1.length(), l2 = s2.length();		

		if(l1 != l2)
			return false;

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();	

		int[] v = new int[130];	// changed to 130 to allow all ASCII chars to be represented

		for(int i = 0; i < l1; i++)
			v[s1.charAt(i)] ++;

		for(int i = 0; i < l2; i++)
			if(v[s2.charAt(i)] != 0)
				v[s2.charAt(i)] --;
			else return false;
			
		return true;
	}
}
