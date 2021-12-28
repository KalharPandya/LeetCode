import java.util.*;
public class Solution {
    public Deque<int[]> deque;
    public int k;
    public int ans = Integer.MIN_VALUE;
    public void emptyQueFromStart(int cx){
        while (!deque.isEmpty() && (cx - deque.peekFirst()[0]) > k){
//            System.out.println("Cx = " + cx + " ele = " + deque.peekFirst()[0]);
            deque.pollFirst();
        }
    }
    public void emptyQueueFromEnd(int yx){
        while (!deque.isEmpty() && (yx > deque.peekLast()[1])){
//            System.out.println("yx = " + yx + " ele = " + deque.peekLast()[0]);

            deque.pollLast();
        }
    }
    public void printDqueue(){
        deque.stream().forEach(ints -> System.out.println(ints[0] + ", " + ints[1]));
    }
    public int findMaxValueOfEquation(int[][] points, int k) {
        deque = new ArrayDeque<int[]>();
        this.k = k;
        for (int[] point :
                points) {

            emptyQueFromStart(point[0]);
//            printDqueue();
//            System.out.println("Emptied");
            if (!deque.isEmpty()) {
                ans = Integer.max(ans,point[0]+point[1] + deque.peekFirst()[1]);
            }

            emptyQueueFromEnd(point[1] - point[0]);
//            printDqueue();
//            System.out.println("Emptied from end");
            deque.addLast(new int[]{point[0], (point[1] - point[0])});
//            System.out.println("Adding");
//            printDqueue();
        }
        return ans;
    }
}
