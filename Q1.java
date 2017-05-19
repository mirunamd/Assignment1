public class Q1{

	public static void main(String[] args){
		System.out.println(fun("abc", "BC!"));
	}
	
	public static boolean fun(String s1, String s2){
		int l1 = s1.length(), l2 = s2.length();		

		if(l1 != l2){
			print();
			return false;
		}

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(!checkStr(s1, s2)){
			System.out.println("Strings should only contain letters.");
			print();
			return false;
		}
		print();

		int[] v = new int[27];	

		for(int i = 0; i < l1; i++)
			v[s1.charAt(i) - 'a'] ++;

		for(int i = 0; i < l2; i++)
			if(v[s2.charAt(i) - 'a'] != 0)
				v[s2.charAt(i) - 'a'] --;
			else return false;
			
		return true;
	}

	public static boolean checkStr(String s1, String s2){
		String arr = "qwertyuiopasdfghjklzxcvbmn";

		for(int i = 0; i < s1.length(); i++)
			if(arr.indexOf(s1.charAt(i)) < 0 || arr.indexOf(s2.charAt(i)) < 0)
				return false;
		return true;
	}

	public static void print(){
		System.out.print("Result after comparing the strings: ");
	}
}
