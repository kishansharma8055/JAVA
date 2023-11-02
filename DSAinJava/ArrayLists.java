
// ArrayList
// Time Complexity
// insert = O(n)
// search = O(1)

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        // create a arraylist
        List<String> list = new ArrayList<>();

        // add element in arraylist
        list.add("kishan");
        list.add("sharma");
        list.add("ram");
        list.add("shyam");

        // print all element in arraylist
        System.out.println(list);

        // contain method
        System.out.println(list.contains("ram"));

        // print particular element
        System.out.println(list.get(2));

        // insert any index of the arraylist
        list.add(2, "hello");
        System.out.println(list);

        // modify a arraylist
        list.set(2, "welcome");
        System.out.println(list);

        // delete a element in arraylist
        list.remove(2);
        System.out.println(list);

        // length of arraylist
        System.out.println(list.size());

        // sort method available in Collections class
        Collections.sort(list);
        System.out.println(list);

    }
}
