import java.util.*;

public class stringasciidscore {
    public static void main(String[] args) {
        String s="code";
        System.out.println(scoreOfString(s));
    }
   
    public static int scoreOfString(String s) {
        int score=0;
        for(int i =1;i<s.length();i++){
            int diff = Math.abs((int)s.charAt(i)-s.charAt(i-1));
            score+=diff;
        }
        return score;
    }
} 

