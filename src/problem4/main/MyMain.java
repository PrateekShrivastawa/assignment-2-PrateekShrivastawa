/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree m = new MyBinarySearchTree();
        MyQueue q = new MyQueue();
        TreeNode root;
        root = new TreeNode(12);
        m.insert(root, 4);
        m.insert(root, 2);
        m.insert(root, 13);
        m.insert(root, 8);
        m.insert(root, 6);
        m.insert(root, 11);
        m.insert(root, 26);
        m.insert(root, 22);
        m.insert(root, 33);
        m.insert(root, 42);
        m.insert(root, 1);
        m.insert(root, 88);
        q.preOrder(root);
        q.queuePrint(q);
        System.out.print("Enter to find preorder Successor : ");
        q.printSuccessor(sc.nextInt());

    }
}

