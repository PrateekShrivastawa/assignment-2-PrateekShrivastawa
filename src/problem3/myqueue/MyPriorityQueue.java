/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

public class MyPriorityQueue {
    private Node first, last;
    private int size;

    public MyPriorityQueue() {
        first = null;
        last = null;
        size = 0;
    }

    public Node getNewnode(int val) {
        Node obj = new Node();
        obj.data = val;
        obj.next = null;
        return obj;
    }

    public void insert(int val) {

        if (last == null) {
            first = last = getNewnode(val);
            size++;
            return;
        }
        size++;
        last.next = getNewnode(val);
        last = last.next;
    }

    public int getfront() {
        if (ifEmpty()) {
            System.out.println("So the queue is empty");
            return Integer.MIN_VALUE;
        }
        return first.data;
    }

    public int getrear() {
        if (ifEmpty()) {
            System.out.println("so the queue is empty");
            return Integer.MIN_VALUE;
        }
        return last.data;
    }

    public boolean ifEmpty() {
        if (last == null) {
            return true;
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public class Node {
        int data;
        Node next;

    }
}