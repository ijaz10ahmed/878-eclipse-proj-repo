package CodilityPractice;

public class FrogJump {
public static int solution(int x,int y,int d) {
	return (y-x) % d == 0 ? ((y-x)/d) : (((y-x)/d) +1);	
}
public static void main(String[] args) {
		System.out.println(solution(1,5,2));
}
}
