public class isAnagram {
    public static void main(String[] args) {
      String s="racecar";
      String t="carrace";
      System.out.println(isAnagram(s, t));

    }
    public static boolean isAnagram(String s, String t) {
     int freq[]=new int[26];
     if(s.length()!=t.length()) return false;
     for(char ch:s.toCharArray()){
        freq[ch-'a']++;
     }
     for(char ch1:t.toCharArray()){
        freq[ch1-'a']--;
     }
     for(int i:freq){
        if(i!=0){
            return false;
        }
       
     }
      return true;
    }
}

