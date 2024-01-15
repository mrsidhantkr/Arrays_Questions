// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.





import java.util.*;
public class Main {
    public static void main(String[] args) {
        
    }
    public int[] buildArray(int[] nums) {

        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[nums[i]];

        }
        return ans;


    }
}