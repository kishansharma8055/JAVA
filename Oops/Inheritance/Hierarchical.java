// 
// 
// 
// this code is not work
// 
// 

import java.util.Scanner;

class Shape {
    public int a;

    Scanner obj = new Scanner(System.in);

    public void input() {
        System.out.println("class shape display call");
        System.out.println("enter a number");
        a = obj.nextInt();
        obj.close();
    }
}

class test1 extends Shape {
    int b = a;

    public void display1() {
        System.out.println("class test1 call " + b);
    }
}

class test2 extends Shape {
    int c = a;

    public void display2() {
        System.out.println("class test2 call " + c);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        test1 t1 = new test1();
        test2 t2 = new test2();
        t1.input();
        t1.display1();
        t2.input();
        t2.display2();
    }
}
