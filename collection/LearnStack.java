import java.util.*;
public class LearnStack {
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<>();

        // add element to the top of the stack
        number.push(1);
        number.push(2);
        number.push(3);
        number.push(4);

        // remove top element of the stack
        number.pop();
        System.out.println("stack:"+number);
        System.out.println("peek element:"+number.peek());
    }
}
