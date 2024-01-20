import java.util.*;

public class Even {
    public static void main(String[] args) {

        int[] nums={12,345,2,6,7896};
        //=5;


        System.out.println((fun(nums)));


    }

    static int fun(int[] nums) {

        int count=0;
        //int count1=0;

        int n=nums.length;

        for(int i=0;i<n;i++) {
            int count1=0;

            while(nums[i]>0) {

                count1++;

                nums[i]=nums[i]/10;




            }
            if(count1%2==0) {
                count++;

            }








        }




        return count;
    }

}
