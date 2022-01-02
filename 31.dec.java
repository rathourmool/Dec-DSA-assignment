// problem 1 basic calculator

public int[] solve(String s , int ind ){
    int n=s.length();
    int i=ind ; 
    int val=0;
    int op=1;
    int ans=0;
    while(i<n && s.charAt(i)!=')'){
        char ch=s.charAt(i);
        if(ch==' '){
            i++;
            continue;
        }
        if(Character.isDigit(ch)){
            val=val*10+(ch-'0');
            i++;
        }
        else {
            //System.out.println("ind :"+val);
            if(ch=='+') {
                ans+=val*op;
                op=1;
                val=0;
            }
            else if(ch=='-') {
                ans+=val*op;
                op=-1;
                val=0;
            }
            else if(ch=='('){
                int[] a=solve(s,i+1);
                ans+=op*a[0];
                i=a[1];
            }
           // System.out.println("ind ans :"+ans);
            //System.out.println(ans)
            i++;
        }
    }
    ans+=val*op;
    //System.out.println("ind ans out:"+ans);
    return new int[]{ans,i};
    
}


public int calculate(String s) {
    return solve(s, 0)[0];
}
}


// problem 2 merge sort code 



class MergeSort
{
	
	void merge(int arr[], int l, int m, int r)
	{
		
		int n1 = m - l + 1;
		int n2 = r - m;

		
		int L[] = new int[n1];
		int R[] = new int[n2];

		
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		
		int i = 0, j = 0;

		
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int l, int r)
	{
		if (l < r) {
		
			int m =l+ (r-l)/2;

			
			sort(arr, l, m);
			sort(arr, m + 1, r);

		
			merge(arr, l, m, r);
		}
	}

	
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}


	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };

		System.out.println("Given Array");
		printArray(arr);

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);

		System.out.println("\nSorted array");
		printArray(arr);
	}
}

