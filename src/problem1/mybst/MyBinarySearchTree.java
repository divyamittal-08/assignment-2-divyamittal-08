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
    TreeNode head;
    TreeNode comp;
    public MyBinarySearchTree(){
        head = null;
        comp = null;
    }
    public void insertElement(int val){
        TreeNode temp = new TreeNode(val);
        if(head == null){
            temp.setLeft(null);
            temp.setRight(null);
            temp.setKey(val);
            head = temp;
            comp = temp;
        }
        else{
            while(comp != temp) {
                if (comp.getKey() > val) {
                    if (comp.getRight() == null) {
                        comp.setRight(temp);
                        temp.setKey(val);
                        temp.setRight(null);
                        temp.setLeft(null);
                        comp = temp;
                        break;
                    } else {
                        comp.setRight(comp);
                    }
                } else if (comp.getKey() < val) {
                    if (comp.getLeft() == null) {
                        comp.setLeft(temp);
                        temp.setKey(val);
                        temp.setLeft(null);
                        temp.setRight(null);
                        comp = temp;
                        break;
                    } else {
                        comp.setLeft(comp);
                    }
                }
            }
        }
        comp = head;
    }
    public void printLeft(){
        if(comp == null){
            System.out.println("Tree is empty");
        }
        else{
            while(comp.getLeft() != null){
                comp = comp.getLeft();
                System.out.println(comp.getKey());
                System.out.println("no output");
            }
        }
    }
    public TreeNode getRoot(){
        TreeNode root = head;
        return root;
    }

}
