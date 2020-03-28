/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args){
        MyBinarySearchTree mybst = new MyBinarySearchTree();
        mybst.insertElement(12);
        mybst.insertElement(11);
        mybst.insertElement(10);
        mybst.insertElement(13);
        mybst.insertElement(14);
        mybst.printLeft();


    }



}
