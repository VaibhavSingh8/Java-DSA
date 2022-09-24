package stack.PreviousGreaterElement;

// O(n^2)

public class PreviousGreaterNaive {
    public static void main(String[] args) {
        int [] arr = new int[]{ 13,15,12,14,16,8,6,4,10,30};
        PrevGreaterEle(arr, arr.length);
    }

    private static void PrevGreaterEle(int [] arr,int n){
        for (int i = 0; i<n; i++){
            int j;
            for ( j = i-1; j>=0; j--){
                if (arr[j] > arr[i]){
                    System.out.print(arr[j] + " ");
                    break;
                }

            }
            if (j == -1){
                System.out.print(-1 + " ");
            }
        }
    }
}
