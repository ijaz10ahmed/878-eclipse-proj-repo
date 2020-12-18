package CodilityPractice;
import java.util.HashMap;

public class OddOccurence {
	public static int solution(int[] A) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int oddnum=0;
		for(int i:A) {
			if(map.containsKey(i)) {
				int occurence = map.get(i);
				occurence++;
				map.put(i,occurence);
			}else {
				map.put(i, 1);
			}
		}
		
	for (Integer i: map.keySet()) {
		int occurence = map.get(i);
		if (occurence %2 !=0) {
			oddnum=i;
		}
	}
	return oddnum;
}
public static void main(String[] args) {
 		int[] arr = {9,8,6,9,5,4,4,3,7,1,6,1};
 		System.out.println(solution(arr));
 }
}
