package CodilityPractice;

public class GenomeSol1 {
	public int[] solution(String S, int[] P, int[] Q) {
		String subStr="";
	    int[] result = new int[P.length];
	  for(int i=0; i < P.length; i++)  {
	      		  subStr = S.substring(P[i], Q[i] + 1);
	      			  if(subStr.contains("A"))
					 { result[i] = 1; }
	      			  else if(subStr.contains("C"))
					{ result[i] = 2; }
	       			 else if(subStr.contains("G"))
					{ result[i] = 3;  } 
				else if(subStr.contains("T"))
					{ result[i] = 4; }
	    }
	    
	    return result;
	}
}