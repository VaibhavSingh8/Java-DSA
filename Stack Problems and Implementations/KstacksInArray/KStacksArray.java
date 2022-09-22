package stack.KstacksInArray;
// O(1)
public class KStacksArray {
    public static void main(String[] args) {
        KStacks s = new KStacks(2, 4);
        s.push(0, 100);
        s.push(1,200);
        System.out.println(s.pop(0));
        System.out.println(s.pop(1));
        s.push(0, 300);
        s.push(1,400);
        System.out.println(s.isEmpty(0));
        System.out.println(s.isEmpty(1));
        System.out.println(s.pop(0));
        System.out.println(s.pop(1));
    }

    public static class KStacks{

        // Two extra integer arrays are needed in this solution

        int arr[] , top[], next[];
        int free_slot = 0, size, k;

        KStacks(int k, int n){
            this.k = k;
            arr = new int[n];
            top = new int[k];
            next = new int[n];

            // initialize all indexes of top as -1 since stack is empty
            for (int i = 0 ; i < k; i++){
                top[i] = -1;
            }

            // next array is for storing next upcoming free slot.
            // So, initialize indexes 0 to n-2 as next elements and (n-1)th slot as -1 as the array ends there.
            // eg: next = [1,2,3,4,-1] n=5;
            for (int i = 0; i < n-1; i++){
                next[i] = i+1;
            }
            next[n-1] = -1;
        }

        void push(int sn, int x) // sn = stack number
        {
            if ( free_slot == -1){
                System.out.println("Stack overflow");
            }
            int index = free_slot; // index to push the element
            free_slot = next[index]; // update next free slot
            next[index] = top[sn];
            top[sn] = index;
            arr[index] = x;


        }

        int pop(int sn){
            if( top[sn] == -1){
                System.out.println("STack underflow error");
            }

            int index = top[sn];
            top[sn] = next[index];
            next[index] = free_slot;
            free_slot= index;
            return arr[index];

        }

        boolean isEmpty(int sn){
            return top[sn] == -1;
        }

    }
}
