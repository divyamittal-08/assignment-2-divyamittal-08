/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;

import java.util.Scanner;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue();
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 for enqueue, press 2 for dequeue:- ");
        int counter = sc.nextInt();
        sc.nextLine();
    }
}
