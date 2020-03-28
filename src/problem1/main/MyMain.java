/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;
// executable class


public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        TreeNode root = null;
        root = obj.insert(root, 8);
        root = obj.insert(root, 5);
        root = obj.insert(root, 9);
        root = obj.insert(root, 4);
        root = obj.insert(root, 6);
        //obj.inorder(root);
        obj.leftprint(root, 0);
        obj.rightnode();
    }
}
