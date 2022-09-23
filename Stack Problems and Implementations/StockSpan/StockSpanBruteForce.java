package stack.StockSpan;

public class StockSpanBruteForce {
    public static void main(String[] args) {
        int [] arr = new int[]{ 13,15,12,14,16,8,6,4,10,30};
        printStockSpan(arr, arr.length);
    }

    private static void printStockSpan(int arr[], int n){
        for (int i = 0; i < n; i++){
            int span = 1;
            for (int j = i-1; j >= 0 && arr[j] <= arr[i]; j-- ){
                span++;
            }
            System.out.println( span + " " );
        }
    }
}
