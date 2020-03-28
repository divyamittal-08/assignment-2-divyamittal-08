/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem1.node.TreeNode;

public class MyQueue {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    Node front;
    Node rear;
    public MyQueue(){
        front = null;
        rear = null;
    }
    public void enqueue(int data){
        Node ns = new Node(data);
        if(front==null){
            front = ns;
            rear = ns;
        }
        else{
            rear.next = ns;
            rear = ns;
        }
    }
    public void preSuccessor(TreeNode root){
        if(root == null)
            return;
        else{
            enqueue(root.getKey());
            preSuccessor(root.getLeft());
            preSuccessor(root.getRight());
        }

    }
    public void getPreSucc(){
        Node temp = front.next;
        while(temp!=null){
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
    }
}


