import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> var=new HashMap<>();
        for(int i:nums){
            if (var.containsKey(i)) {
                return true;
            }
            var.put(i,1);
        }
        return false;
    }
}