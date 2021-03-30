package JavaC;

public class yey {

	public static void main(String[] args) {
		String s = "aeiouia";
		int k = 3;
		
		 String a = "a";
	        String subs, ans = "Not Found!";
	        int cont=0 , test=0 ;
	        char b;
	        for(int i=0; i <= s.length()-k; i++){
	                subs = s.substring(i, i+k);
	               
	                for(int j=0; j < k; j++){
	                    b = subs.charAt(j); 
	                    
	                    if(b == 'a' || b == 'e' || b == 'i'  || b == 'o' || b == 'u'  ){
	                        cont++;
	                    }
	                    
	                    if(test < cont){
	                        test = cont;
	                        ans = subs;
	                    }
	                }
	                cont = 0;      
	        }
	        System.out.println(ans);
	        System.out.println(test);

	}

}
