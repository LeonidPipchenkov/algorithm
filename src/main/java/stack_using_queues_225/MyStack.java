package stack_using_queues_225;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {

    private final Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        int result = 0;
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            result = iterator.next();
        }
        iterator.remove();
        return result;
    }

    public int top() {
        int result = 0;
        for (Integer number : queue) {
            result = number;
        }
        return result;
    }

    public boolean empty() {
        return queue.isEmpty();
    }

}
