/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.node.Node;

public class MyPriorityQueue {
    private Node front;
    private Node rear;
    private int size;

    public MyPriorityQueue(){
        front = null;
        rear = null;
        size = 0;
    }
    public boolean isEmpty()
    {
        boolean response = false;
        if(front != null || size != 0){
            response = true;
        }
        return response;
    }
}
