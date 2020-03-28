/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import com.sun.source.tree.Tree;
import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
    public static void main(String[] args){
        MyBinarySearchTree mybst = new MyBinarySearchTree();
        mybst.head = new TreeNode(1);
        mybst.head.setLeft(new TreeNode(2));
        mybst.head.setRight(new TreeNode(3));
        mybst.printLeft();
        System.out.println("The leaf count of binary tree is : " + mybst.getLeafCount());


    }



}
