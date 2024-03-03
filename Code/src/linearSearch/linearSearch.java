package linearSearch;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr={12,45,1,41,5,1,6,71,5,23,-6};
        int n= arr.length;
        System.out.println(search(arr,n,71));
    }

    static int search(int[] arr, int n,int target) {
        if(n==0){
            return -1;
        }
        for(int i=0;i<n;i++) {
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
}
