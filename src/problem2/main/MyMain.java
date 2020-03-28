/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public int getData() {

        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }
}

class binarysearch {
    public TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            return createnode(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public TreeNode createnode(int a) {
        TreeNode obj = new TreeNode();
        obj.data = a;
        obj.left = null;
        obj.right = null;
        return obj;
    }

    public void preorder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + "-->");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(TreeNode node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + "-->");
    }
}

public class MyMain {
    public static void main(String[] args) {
        binarysearch obj = new binarysearch();
        TreeNode root = null;
        root = obj.insert(root, 8);
        root = obj.insert(root, 5);
        root = obj.insert(root, 9);
        root = obj.insert(root, 4);
        root = obj.insert(root, 6);
        System.out.println("The data in preorder is given below ");
        obj.preorder(root);
        System.out.println();
        System.out.println("The data in postorder is given below ");
        obj.postorder(root);
    }
}
