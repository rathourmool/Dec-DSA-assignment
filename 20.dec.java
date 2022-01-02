// problem 1 https://leetcode.com/problems/binary-search/
class Solution {
    
    public static void main(String[] args) {
        int [] nums= {-1,0,3,5,9,12};
        int target=9;
       int ans= search(nums,target);
        System.out.println(ans);
    }
    public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while (start<=end){
            int mid= start+(end-start)/2;
            if (target < nums[mid]){
                end=mid-1;
            }else if (target>nums[mid]){
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    }
// problem 2 https://leetcode.com/problems/sqrtx/
class Solution {
    public int mySqrt(int x) {
        int start=1;
        int end =x;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<= x/mid) start=mid+1;
            else end=mid-1;
        }
        return end;
    }
}

// problem 3 Find the frequency of an element in a sorted array with duplicates present. for eg: [1,1,2,2,4,5,5,6,6,6,6,9,10,11] and target = 6

public class binary {
    public static void main(String[] args) {

        int[] a= {1,1,2,2,4,5,5,6,6,6,6,9,10,11};




        int tar=6;

        System.out.println(frequencyCounter(a,tar));
    }

    static int frequencyCounter(int[] a,int tar) {
        int first=firstoccurance(a,tar);
        int last=lastoccurance(a,tar);

        return (last-first+1);

    }


   static int lastoccurance(int[] nums, int target) {
        // TODO Auto-generated method stub
        int last=-1;
        int s=0;
        int e=nums.length-1;
        int m=s+(e-s)/2;

        while(s<=e) {
            m=s+(e-s)/2;

            if(nums[m]==target) {
                last=m;
                s=m+1;
            }
            else if(nums[m]<target){
                s=m+1;
            }
            else {
                e=m-1;
            }
        }
        return last;
    }

    static int firstoccurance(int[] nums, int target) {
        // TODO Auto-generated method stub

        int first=-1;
        int s=0;
        int e=nums.length-1;
        int m=s+(e-s)/2;

        while(s<=e) {
            m=s+(e-s)/2;

            if(nums[m]==target) {
                first=m;
                e=m-1;
            }
            else if(nums[m]<target){
                s=m+1;
            }
            else {
                e=m-1;
            }
        }
        return first;
    }
}


