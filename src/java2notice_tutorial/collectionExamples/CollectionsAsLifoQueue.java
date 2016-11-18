package java2notice_tutorial.collectionExamples;


import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Queue;

public class CollectionsAsLifoQueue {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>(5);
        dq.add("java");
        dq.add("c");
        dq.add("c++");
        dq.add("unix");
        dq.add("perl");
        Queue<String> q = Collections.asLifoQueue(dq);
        System.out.println("Returned queu is: " + q);
    }
}
