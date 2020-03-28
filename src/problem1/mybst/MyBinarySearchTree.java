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
    int level = 0;
    int count = 0;

    public TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            return createnewnode(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
            count++;
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

    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + "-->");
        inorder(node.right);
    }

    public void leftprint(TreeNode node, int level1) {
        if (node == null) {
            return;
        }
        if (level1 > level) {
            System.out.print(node.data + "-->");
            level++;
        }
        leftprint(node.left, level1 + 1);
        leftprint(node.right, level1 + 1);
    }

    public void rightnode() {
        System.out.println();
        System.out.print(count);
    }
}
