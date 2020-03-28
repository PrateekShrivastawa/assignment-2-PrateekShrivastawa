/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert(2);
        obj.insert(5);
        obj.insert(6);
        obj.insert(1);
        obj.insert(3);
        System.out.println("Size: " + obj.getSize());
        System.out.println("front :" + obj.getfront());
        System.out.println("rear: " + obj.getrear());

    }
}
