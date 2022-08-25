import java.util.HashMap;

public class ValidAnagram242 {

	public static void main(String[] args) {
		String s = "place";
		String t = "space";
		System.out.println(isAnagram(s, t));

	}
	
	static boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> mapS = new HashMap<>();
		HashMap<Character, Integer> mapT = new HashMap<>();
		char[] arrayS = new char[s.length()];
		char[] arrayT = new char[t.length()];
		for(int i = 0; i < s.length(); i++)
			arrayS[i] = s.charAt(i);
		for(int i = 0; i < t.length(); i++)
			arrayT[i] = t.charAt(i);
		for(char tempS : arrayS) {
			if(mapS.containsKey(tempS))
				mapS.put(tempS, mapS.get(tempS) + 1);
			else
				mapS.put(tempS, 0);
		}
		for(char tempT : arrayT) {
			if(mapT.containsKey(tempT))
				mapT.put(tempT, mapT.get(tempT) + 1);
			else
				mapT.put(tempT, 0);
		}
		return mapS.equals(mapT);
	}

}
