/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;
// to store student information and properties
public class Student {
    private int rollno;
    private String name;
    private int backlog;
    private int count;
    public Student(int rollno, String name, int backlog) {
        this.rollno = rollno;
        this.name = name;
        this.backlog = backlog;
        count=0;
    }
}
