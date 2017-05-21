public class Q1{

	public static void main(String[] args){
		System.out.println(perm("Aa", "aA")); // Result after comparing the strings: true
		System.out.println(perm("ABc", "CAb")); // Result after comparing the strings: true
		System.out.println(perm("a", "Ab")); // Result after comparing the strings: false
		System.out.println(perm("", "")); // Result after comparing the strings: true
		System.out.println(perm("ACB!", "ACB!")); // Strings should only contain letters.\nfalse
		
	}
	
	public static boolean arePermutations(String s1, String s2){ 
		int l1 = s1.length(), l2 = s2.length();		

		if(l1 != l2){ // if inputs are different in size, they are clearly not permutations of each other
			print();
			return false;
		}

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if(!checkStr(s1, s2)){ // inputs must be letters only 
			System.out.println("Strings should only contain letters.");
			print();
			return false;
		}
		print();

		int[] v = new int[26];	

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
