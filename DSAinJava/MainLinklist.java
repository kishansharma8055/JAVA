
class MainLinklist {
    public static void main(String[] args) {
        LinkedList_Manually obj = new LinkedList_Manually();
        System.out.println("add last");
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(4);
        obj.addLast(5);
        obj.addLast(6);
        obj.display();
        System.out.println("add first");
        obj.addFirst(7);
        obj.display();
        System.out.println("add Position");
        obj.addPos(4, 10);
        obj.display();
        System.out.println("remove first");
        obj.removeFirst();
        obj.display();
        System.out.println("remove Position");
        obj.removePos(4);
        obj.display();
        System.out.println("remove last");
        obj.removeLast();
        obj.display();
        System.out.println("length of linkedlist");
        // int k = obj.length();
        System.out.println(obj.length());
    }
}