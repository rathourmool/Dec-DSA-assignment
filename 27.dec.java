// problem 1 spiral matrix

public class binary {
    public static void main(String[] args) {
int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        spiralPrint(matrix, matrix.length, matrix[0].length);

    }

    public static void spiralPrint(int[][] matrix, int r, int c){
        int i;
        int k = 0; // k -> r
        int l = 0; // l -> c

        while(k < r && l < c){
            // left to right --> column varies --> l -> c - 1, row remains constant
            for(i = l; i < c; i++){
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            // top to bottom --> row varies --> k -> r - 1, column remains constant
            for(i = k; i < r; i++){
                System.out.print(matrix[i][c - 1] + " ");
            }
            c--;
            if(k < r){
                // right to left --> column varies --> c - 1 -> l, row remains constant
                for(i = c - 1; i >= l; i--){
                    System.out.print(matrix[r - 1][i] + " ");
                }
                r--;
            }
            if(l < c){
                // bottom to top --> row varies --> r - 1 -> k, column remains constant
                for(i = r - 1; i >= k; i--){
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
        }
    }
}


// problem 2 create and print element in matrix

public class binary {
    public static void main(String[] args) {
		

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of matrix");
		
		int size=sc.nextInt();
		
		System.out.println("enter the element");
		int[][] arr=new int[size][size];
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr[i][j]=sc.nextInt();
				
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+"  ");
				
			}
			System.out.println();
		}
		

		
	}

}

// problem 3 print wave in matrix

public class binary {

	public static void main(String[] args) {


		int[][] arr = {{1,2,3,4},
			           {5,6,7,8},
	                   {9,10,11,12},
	                   {13,14,15,16}
	             };
		
		int n =arr.length;
		int m = arr[0].length;
		
	
			for(int j=0; j<m; j++) {
				if(j%2==0) {
					for(int i=0; i<n; i++) {
						System.out.println(arr[i][j]);
					}
				}else {
					for(int i=arr.length-1; i>=0; i--) {
						System.out.println(arr[i][j]);
					}
				}
				
				
				
		}
		
		
		
		
	}

}
