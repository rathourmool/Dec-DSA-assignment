


  // problem  1 kth largetand small value
public class binary {
    public static void main(String[] args) {
        int[] arr= {43,12,1,23,66,54,78};

        int n=arr.length;

        for(int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {

                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

        System.out.println("kth small value  :"+arr[0]);
        System.out.println("kth large value is  :"+arr[n-1]);








    }
}
