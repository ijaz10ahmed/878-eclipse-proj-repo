package CodilityPractice;
import java.util.Stack;
public class Fish {
	public static int solution(int[] A, int[] B) {
      
        if(A.length == 0)
            return 0;
       // main idea: use "stack" to store the fishes with B[i]==1 
        // that is, "push" the downstream fishes into "stack"
        // note: "push" the Size of the downstream fish
        Stack<Integer> st = new Stack<>(); 
        int numAlive = A.length;
        
        //i=0...4  //0 1 2
        for(int i=0; i<A.length; i++){
            // case 1; for the fish going to downstrem
            // push the fish to "stack", so we can keep them from the "last" one
        	
        	//b[0]=1 //downstream
            if(B[i] ==1){ //false
                st.push(A[i]); // push the size of the downstream fish
            }
            // case 2: for the fish going upstream
            // check if there is any fish going to downstream
            if(B[i] ==0){
                while( !st.isEmpty() ){ // to find if there is a fish in opposite
                    // if the downstream fish is bigger (eat the upstream fish)
                    if( st.peek() > A[i] ){
                        numAlive--;
                        System.out.println("Fish Going to Eat which is stack "+st.peek());
                        System.out.println("Fish eaten " +A[i]);
                        System.out.println("Fish which is alive in the stack "+st.peek());
                        System.out.println("number of alive fishes "+numAlive);
                        break;      // the upstream fish is eaten (ending)   
                    }
                    // if the downstream fish is smaller (eat the downstream fish)
                    else if(st.peek() < A[i]){
                        numAlive--;
                        System.out.println("Fish Going to Eat "+A[i]);
                        System.out.println("Fish Eaten " +st.peek());
                        System.out.println("number of alive fishes "+numAlive);
                        System.out.println("number which is alive and not in stack "+A[i]);
                        System.out.println("Fish "+st.peek()+" will be removed from stack");
                        st.pop();   // the downstream fish is eaten (not ending)
                    }
                }
            }  
        }    
        System.out.println("fishh in stack "+st.peek());
        return numAlive;
    }
	public static void main(String[] args) {
		//int[] A= {4,3,2,1,5}; //fish in stack is always bigger
		int[] A= {3,5,2,1,4}; //fish in a stack is smaller 
		//int[] A= {1,3,2,4,6};
		int[] B= {1,0,0,0,1};
		System.out.println(solution(A,B));
	}
}
