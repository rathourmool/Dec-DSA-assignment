//problem  1    time complexity o(n)
	public class binary {
    public static void main(String[] args) {	
		int a=6;
		
		for(int i=1;i<a;i++) {
			System.out.println(i);
		}
      
		
//problem  2    time complexity is o(log n)
		System.out.println("2nd problem");
		int  n=8;
		for(int i=1;i<n;i=i*2) {
			System.out.println(n);
		}
		

		
//problem  3    time complexity o(n*n)
		
		System.out.println("3rd problem");
		
		int num=5;
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}

   }
}
