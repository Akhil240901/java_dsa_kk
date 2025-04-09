package TwoPointerSS;
//Q.find max points from cards array but you can select k element from either start or end they should be consecutive
public class MaxPointfromcard {
    public static void main(String[] args) {
        int[] cards = {1, 2, 3, 4, 5, 6, 1};
        int k=4;
        System.out.println( maxPoint(cards,k));
    }
    static  int maxPoint(int cards[],int k){
        int n= cards.length;
        int lsum=0,max=0;
        for (int i=0;i<k;i++){
            lsum=lsum+cards[i];
            max=lsum;
        }

        int rsum=0, rindex=n-1;
        for(int j=k-1;j>=0;j--){
            rsum=rsum+cards[rindex];
            lsum=lsum-cards[j];
            max=Math.max(max,(rsum+lsum));
            rindex--;
        }

        return max;
    }
}
