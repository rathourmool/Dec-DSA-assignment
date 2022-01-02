
// problem 1 factorial
public class binary {
	static int p =1;
	public static int solve(int n) {
		if(n ==0) {
			return p;
		}
		else {
			p *= n;
			return solve(--n);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solve(n));

	}

}

// problem 2 Fibanocci

public class binary {
	static int fib(int n) {
		if(n ==0)
			return 0;
		if(n==1)
			return 1;
		
		return fib(n-1)+fib(n-2);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fib(n));

	}

}


// problem 3  MinMaxRec

public class binary {
	static void solve(int[] a,int i,int max,int min) {
		if(i==a.length) {
			System.out.println(max+" "+min);
			return;
		}
		if(a[i]>max) {
			max = a[i];
		}
		if(a[i]<min) {
			min =a[i];
		}
		solve(a,i+1,max,min);
	}
	public static void main(String[] args) {
		
		int a[] = {1,-1,0,2,3,-3,4,-4};
		solve(a,0,a[0],a[0]);

	}

}

// problem 4  Palindrome 


public class binary{
	
	public static String solve(String s, String r,int n,int i) {
		if(i == n) {
			return "Palindrome";
		}
		if(s.charAt(i)== r.charAt(i)) {
			return solve(s,r,n,i+1);
		}
		else {
			return "Not Palindrome";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		String r =""+sb.reverse();
		int n = s.length();
		System.out.println(solve(s,r,n,0));

	}

}

// problem 5 PrintEven
public class binary {
	public static void solve(int i,int n) {
		if(i>n) {
			return;
		}
		else {
			solve(i+2,n);
			System.out.print(i+",");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solve(0,n);

	}
}
