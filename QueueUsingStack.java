package DSA;
import java.util.*;

public class QueueUsingStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        System.out.println(stack.pop());
    }

    class queueUsingStack {
        private Stack<Integer> first;
        private Stack<Integer> second;

        public queueUsingStack() {
            first = new Stack<>();
            second = new Stack<>();
        }
        public void add(int n){
            first.push(n);
        }
        public int remove(){
            while (!first.isEmpty()){
                int popped=first.pop();
                second.push(popped);
            }
            int removed= second.pop();
            while (!second.isEmpty()){
                first.push(second.pop());
            }
            return removed;
        }
        public int peek(){
            while (!first.isEmpty()){
                int popped=first.pop();
                second.push(popped);
            }
            int peeked= second.peek();
            while (!second.isEmpty()){
                first.push(second.pop());
            }
            return peeked;
        }
        public boolean isEmpty(){
            return first.isEmpty();
        }
    }
}