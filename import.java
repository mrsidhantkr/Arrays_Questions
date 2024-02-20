package kyakru;
import java.util.*;

public class Candies {

	public static void main(String[] args) {
		int[] candies= {12,1,12};
		int extra=10;
		
		List<Boolean> res=kidsWithCandies(candies,extra);
		
		System.out.println(res);
		
		
		
		// TODO Auto-generated method stub

	}
	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
		
		ArrayList<Boolean> fun=new ArrayList<>();
		int ans[]= new int[candies.length];
		
		int maxcandies=0;
		
		for(int num:candies) {
			maxcandies=Math.max(maxcandies, num);
			
		}
		
		for(int i =0;i<candies.length;i++) {
			
			ans[i]=candies[i]+extraCandies;
			
		}
		
		for(int i =0;i<ans.length;i++) {
			if(ans[i]<maxcandies) {
				fun.add(false);
			}
			else {
				fun.add(true);
			}
		}
		
		
		return fun;
	}
}
