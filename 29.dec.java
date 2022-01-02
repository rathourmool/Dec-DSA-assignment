// problem 1 avg


public class binary {
	static int i=0,avg=0;
	static  int solve(int[] a) {
		if(i==a.length) {
			avg = avg/a.length;
			return avg;
		}
		avg += a[i++];
		return solve(a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] =sc.nextInt();
		}
		System.out.println( solve(a));

	}

}


// problem 2 rec Binary search

public class binary {
	static int m=0;
	static void solve(int[] a,int t,int s,int e) {
		if(s>e) {
			System.out.println(-1);
		}
		m=e-(s+e)/2;
		if(a[m]==t) {
			System.out.println(m);
			return;
		}
		if(a[m]>t) {
			e =m-1;
		}
		else
		{
			s = m+1;
		}
		solve(a,t,s,e);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		solve(a,t,0,n-1);
		

	}

}


// problem 3 revrse a number recrsive program


public class binary {
	static int r =0;
	static void solve(int n) {
		if(n==0) {
			System.out.println(r);
			return;
		}
		int d = n%10;
		r = r*10+d;
		solve(n/10);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solve(n);
		

	}

}
© 2022 GitHub, Inc.
