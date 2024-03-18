package BinarySearch;

public class nextGreaterElementOfChar {
    public static void main(String[] args) {
        char[] letters={'c','f','j'};
        System.out.println(nextGreatestLetter(letters,'c'));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        int mid;

        while(start<=end){
            mid=start+(end-start)/2;

            if(target>=letters[mid]){
                start=mid+1;
            }else {
                end=mid-1;
            }
        }

        return letters[start % letters.length];
    }
}
