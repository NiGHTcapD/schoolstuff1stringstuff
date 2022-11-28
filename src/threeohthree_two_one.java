

public class threeohthree_two_one {
	public static void main(String[] args) {
	
	
		//1. Three things
		System.out.println(A.length()+B.length());
        
        int comparator = A.compareTo(B);
        String yesorno;
        if (comparator==1){yesorno="Yes";}
        else{yesorno="No";}
        System.out.println(yesorno);
        
        String Astar=A.substring(0, 1).toUpperCase() + A.substring(1);
        String Bstar=B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(Astar+" "+Bstar);
	
        
		//2. Make a substring
	
        System.out.println(S.substring(start, end));
        
        
        //3. Find the "largest" and "smallest" substrings
        smallest=s.substring(0, k);
        largest=s.substring(0, k);
        for (int i = 0; i <= s.length()-k; i++) {
            String est = s.substring(i, i+k);
            if (est.compareTo(smallest)<0){smallest=s.substring(i, i+k);}
            if (est.compareTo(largest)>0){largest=s.substring(i, i+k);}
        }
        
        //4. palindromemordnilap
        String esreverse = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            esreverse = esreverse + A.charAt(i);
        }
        System.out.println(A.equals(esreverse)?"Yes":"No");
        
        
        //5. Token taker
}
