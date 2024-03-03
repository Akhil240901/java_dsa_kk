package linearSearch;

public class minimumElement {
    public static void main(String[] args) {
        int[] arr={12,34,3,33,6,77,-98,4};
        find(arr);
    }

    private static void find(int[] arr) {
        int min=arr[0];
        for(int element: arr){
            if(element<min){
                min=element;
            }
        }
        System.out.println(min);
    }
}
