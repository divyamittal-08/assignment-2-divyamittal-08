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
    public TreeNode head;
    TreeNode comp;
    public MyBinarySearchTree(){
        head = null;
        comp = head;
    }
    public void insertElement(int val){
        comp = head;
        TreeNode temp = new TreeNode(val);
        if(head == null){
            temp.setLeft(null);
            temp.setRight(null);
            temp.setKey(val);
            head = temp;
            comp = temp;
            System.out.println("root ="+head.getKey());

        }
        while(comp != temp) {
            if (comp.getKey() < val) {
                if (comp.getRight() == null) {
                    comp.setRight(temp);
                    temp.setKey(val);
                    temp.setRight(null);
                    temp.setLeft(null);
                    comp = temp;
                }
                else {
                    comp = comp.getRight();
                }
            } else if (comp.getKey() > val) {
                if (comp.getLeft() == null) {
                    comp.setLeft(temp);
                    temp.setKey(val);
                    temp.setLeft(null);
                    temp.setRight(null);
                    comp = temp;
                } else {
                    comp = comp.getLeft();
                }
            }
        }
    }
    static int max_level = 0;
    public void leftView(TreeNode node, int level){
        // Base Case
        if (node == null)
            return;

        if (max_level < level) {
            System.out.println(" " + node.getKey());
            max_level = level;
        }

        // Recur for left and right subtrees
        leftView(node.getLeft(), level + 1);
        leftView(node.getRight(), level + 1);
    }



    public void printLeft(){
        leftView(head, 1);
    }
    public TreeNode getRoot(){
        TreeNode root = head;
        return root;
    }
    public int getLeafCount()
    {
        return getLeafCount(head);
    }
    public int getLeafCount(TreeNode node)
    {
        if (node == null)
            return 0;
        if (node.getLeft() == null && node.getRight() == null)
            return 1;
        else
            return getLeafCount(node.getLeft()) + getLeafCount(node.getRight());
    }

}
