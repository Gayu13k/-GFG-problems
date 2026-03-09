import java.util.*;
public class duplicateInteger {
     public static void main(String[] args) {
        int[] nums={1,2,3,3,4};
        System.out.println(hasDuplicate(nums));
     }
    public static boolean hasDuplicate(int[] nums) {
       HashSet<Integer> set =new HashSet<>();
       for(int num:nums){
        if(set.contains(num)){
            return true;
        }
        else{
            set.add(num);
        }
       }
       return false;
      
    }
}
