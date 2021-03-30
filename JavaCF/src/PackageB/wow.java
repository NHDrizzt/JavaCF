package PackageB;

public class wow {

	public static void main(String[] args) {
		String a = "51Pa*0Lp*0e";
		char b, c, d, e;
		StringBuilder nomes = new StringBuilder();
		nomes.append(a);
		for(int i=a.length()-1; i>=0; i-- ) {
			b = a.charAt(i);
			d = a.charAt(i-1);
			e = Character.toLowerCase(d);
			c = Character.toUpperCase(b);
			if(b == c && d == e) {
				b = d;
				d = c;
				nomes = nomes.deleteCharAt(i-1);
			}
			else if(b == (int)b) {
				b=0;
			}
		}

	}

}
