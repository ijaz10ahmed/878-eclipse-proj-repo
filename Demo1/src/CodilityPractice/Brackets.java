package CodilityPractice;
import java.awt.*;
import java.util.Stack;
public class Brackets {
	public static void main(String[] args) {
	
	/*if (solution() == 1) {
		
	}
		
	else {
		System.out.println("String is not properly nested. ");
	}
		
	}	
	public static void int solution(String S) {
		List<Character> open = Arrays.asList('{','[','(');
		List<Character> close= Arrays.asList('{','[','(');
		
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < S.length(); i++) {
			if (open.contains(S.charAt(i))) {
				stack.push(S.charAt(i));
			}
			else if (close.contains(S.charAt(i)) && !stack.isEmpty()) {
				Character top = stack.peek();
				
				if (open.indexOf(top) == close.indexOf(S.charAt(i))) {
					stack.pop();
				}
				else {
					return 0;
					}
				}
			else {
				return 0;
			}
			}
			return stack.isEmpty() ? 1 : 0;
		}*/
}}
