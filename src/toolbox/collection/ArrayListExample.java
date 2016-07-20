package toolbox.collection;

import java.util.ArrayList;

/**
 * Created by Superduo on 7/20/16.
 */
public class ArrayListExample {

    // Create a new ArrayList named name that holds Strings
    ArrayList<String> names = new ArrayList<>();

    public static void main(String[] args) {
        ArrayListExample arrayListExample = new ArrayListExample();
        arrayListExample.addElement("bob");
        arrayListExample.addElement("kevin");
        arrayListExample.addElement("katie");
        arrayListExample.addElement("nick");
        System.out.println("Element at 3:" + arrayListExample.getElement(2));
    }


    // add another String to the ArrayList
    public void addElement(String name) {
        names.add(name);

    }

    // get a String from the ArrayList at a specific index
    public String getElement(int index) {
        return names.get(index);
    }

    // print out all the Strings in the ArrayList
    public void printAllElements() {
        for (String name : names) {
            System.out.println(names);
        }

    }
}
