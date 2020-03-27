/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    public TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            return createnewnode(data);
        }
        return node;
    }

    public TreeNode createnewnode(int a) {
        TreeNode obj1 = new TreeNode();
        obj1.data = a;
        obj1.left = null;
        obj1.right = null;
        return obj1;
    }
}
