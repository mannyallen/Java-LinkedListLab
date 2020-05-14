import java.util.LinkedList;
import java.util.Collections;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

public class LinkedListLab {
    public static void main(String[] args) {
        // List #1
        LinkedList<String> list1 = new LinkedList<>();
        // List #2
        LinkedList<String> list2 = new LinkedList<>();

        // #1
        System.out.println(isItEmpty(list1));

        // #2
        addNode(list1, "test 1");
        addNode(list1, "test 2");
        System.out.println(list1);

        // #3
        System.out.println(makeEmpty(list1));
        System.out.println(list1);

        // #4
        addNode(list1, "test 1");
        addNode(list1, "test 2");
        addNode(list1, "test 3");
        printedNode(list1);

        // #5
        delNode(list1, 2);

        // #6
        sdelete(list1, "test 1");

        // #7
        headNode(list1, "test 4");

        // #8
        addSpecNode(list1, 1, "test 5");

        // #9
        appendList(list1, list2);

        // #10
        printReverse(list1);
    }

    // #1 CODE
    public static boolean isItEmpty(LinkedList<String> list) {
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    // #2 CODE
    public static void addNode(LinkedList<String> list, String nodeData) {
        list.add(nodeData);
    }

    // #3 CODE
    public static String makeEmpty(LinkedList<String> list) {
        if (list.size() == 0) {
            return "List previously contained nothing";
        } else {
            list.clear();
            return "List is now empty";
        }
    }
    // #4 CODE
    public static void printedNode(LinkedList<String> list) {
        for (String element : list) {
            System.out.println(element);
        }
    }

    // #5 CODE
    public static void delNode(LinkedList<String> list, int index) {
        list.remove(index);
        System.out.println(list);
    }

    // #6 CODE
    public static void sdelete(LinkedList<String> list, String value){
        for(String element: list){
            if(element == value){
                list.remove(value);
                System.out.println(list);
            }
        }
    }
    // #7 CODE
    public static void headNode(LinkedList<String> list, String value){
        list.add(0, value);
        System.out.println(list);
    }
    // #8 CODE
    public static void addSpecNode(LinkedList<String> list, int index, String value){
        list.add(index + 1, value);
        System.out.println(list);
    }
    // #9 CODE
    public static void appendList(LinkedList<String> list, LinkedList<String> secondList){
        list.addAll(secondList);
    }
    // #10 CODE
    public static void printReverse(LinkedList<String> list) {
        for (String String : list) {
            Collections.reverse(list);
        }

    }
}