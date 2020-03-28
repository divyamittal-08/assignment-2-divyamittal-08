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
        mybst.insertElement(12);
        mybst.insertElement(11);
        mybst.insertElement(10);
        mybst.insertElement(13);
        mybst.insertElement(14);
        mybst.insertElement(5);
        mybst.insertElement(3);
        mybst.insertElement(7);

        mybst.printLeft();
        System.out.println("The leaf count of binary tree is : " + mybst.getLeafCount());


    }



}
