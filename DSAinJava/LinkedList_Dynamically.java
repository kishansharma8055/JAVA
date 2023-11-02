
// package DataStructure;
import java.util.LinkedList;
// import java.util.List;

public class LinkedList_Dynamically {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        // List<String> ll = new LinkedList<>();

        ll.addFirst("kishan");
        ll.addFirst("am");
        System.out.println(ll);
        ll.addFirst("i");
        System.out.println(ll);
        ll.addLast("sharma");
        System.out.println(ll);
        ll.add("king-star");
        System.out.println(ll);
        System.out.println(ll.size());
        ll.remove(2);
        System.out.println(ll);

    }
}
