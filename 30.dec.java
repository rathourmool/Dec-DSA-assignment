// problem 1 find gcd of two number using recrsive

public class binary {
	static int solve(int x,int y,int p) {
		if(p==0) {
			return -1; //No G.C.D
		}
		if(x%p ==0 && y%p ==0) {
			return p;
		}
		return solve(x,y,p-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x =sc.nextInt();
		int y = sc.nextInt();
		int p = Math.min(x, y);
		System.out.println(solve(x,y,p));
	}

}


// problem  2 find power of given number

public class binary {
	static int p=1;
	static int power(int x,int y) {
		if(y ==0) {
			return p;
		}
		p *= x;
		return power(x,y-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y =sc.nextInt();
		System.out.println(power(x,y));
	}

}

// problem 3 char ascending order

public class binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s  =sc.next();
		
		int a[] =new int[256];
		for(int i=0;i<s.length();i++) {
			int ind =  s.charAt(i);
			a[ind]++;
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i];j++) {
				System.out.print((char)(i));
			}
		}

	}

}

//// problem 3 char dscending order
public class binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s  =sc.next();
		
		int a[] =new int[26];
		for(int i=0;i<s.length();i++) {
			int ind =  s.charAt(i)-'a';
			a[ind]++;
		}
		for(int i=a.length-1;i>=0;i--) {
			for(int j=0;j<a[i];j++) {
				System.out.print((char)(i+'a'));
			}
		}

	}

}
