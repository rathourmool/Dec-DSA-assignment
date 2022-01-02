//problem 1 https://leetcode.com/problems/intersection-of-two-arrays
public class binary {
    public static void main(String[] args) {
        int n1 =5, n2 = 5;
        int[] a = {1,2,4,5,10,11};
        int[] b = {1,3,4,6,7,5,11};

        for(int i=0;i<n1;i++) {
            for(int j=0;j<n2;j++) {
                if(a[i] == b[j]) {
                    System.out.println(a[i]);

                }
            }
        }
    }
}


// problem 2  https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class binary {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++) {
            a[i] =sc.nextInt();
        }
        int t = sc.nextInt();
		
        if (a == null || a.length == 0)
            System.out.println("0");

        int s = 0;
        int e = a.length - 1;
        while (s < e) {
            int x = a[s] + a[e];
            if (x < t) {
                s++;
            } else if (x > t) {
                e--;
            }
            else {
                System.out.println(a[s]+" "+a[e]);
                break;
            }
        }




    }
}
