// create a stact using simple array

class Stacks {

    int arr[];
    int top;

    public Stacks(int n) {
        arr = new int[n];
        top = 0;
    }

    void push(int a) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                arr[i] = a;
                return;
            }
            i++;
        }
    }

    void pop() {
        int i = 0;
        while (i < arr.length) {
            if (arr[i + 1] == 0) {
                arr[i] = 0;
                return;
            }
            i++;
        }
    }

    void display() {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                System.out.println();
                return;
            }
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}

class StackArrayMain {
    public static void main(String[] args) {
        Stacks obj = new Stacks(10);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.push(7);
        obj.push(8);
        obj.display();
        obj.pop();
        obj.display();
        obj.pop();
        obj.pop();
        obj.display();
    }
}
