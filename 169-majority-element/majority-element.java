import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer,Integer> freq=new HashMap<>();
        int len=nums.length;
        for(int n:nums){
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> var:freq.entrySet()){
            if(var.getValue()>len/2){
               return var.getKey();
            }
        }
        return -1;
    }
}