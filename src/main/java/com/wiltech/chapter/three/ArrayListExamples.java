package com.wiltech.chapter.three;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {
        instantiationExamples();

        addMethodToArrayList();

        addMethodToList();

        removeMethodToList();

        //this method replaces the object at index
        setObject();

        generalMethods();
    }

    private static void generalMethods() {
        System.out.println();
        List<String > strings = new ArrayList();
        strings.add("hawk");

        System.out.println(strings.contains("robin")); //false

        System.out.println(strings.isEmpty()); //false
        System.out.println(strings.size()); //1

        //removes all elements
        strings.clear();
        System.out.println(strings.isEmpty());
    }

    private static void setObject() {
        System.out.println();
        List<String > strings = new ArrayList();
        strings.add("hawk");
        System.out.println(strings.size()); //1

        strings.set(0, "robin");
        System.out.println(strings.size()); //1



        //strings.set(5, "hawk");//throws indexOutOfBoundException as no such index
    }

    private static void removeMethodToList() {
        System.out.println();

        //syntax
        //remove(Object object)
        //remove(int index)

        List<String> strings = new ArrayList<>();
        strings.add("hawk");
        strings.add( "hawk");

        System.out.println(strings.remove("cardinal")); //false
        System.out.println(strings.remove("hawk")); //true

        System.out.println(strings.remove(0)); //hawk
        System.out.println(strings); // []
    }

    private static void addMethodToList() {
        System.out.println();

        List<String> strings = new ArrayList<>();
        strings.add("hawk");
        strings.add(1, "robin");
        strings.add(0, "blue jay");
        strings.add(1, "cardinal");

        System.out.println(strings);//[blue jay, cardinal, hawk, robin]
    }

    private static void addMethodToArrayList() {
        ArrayList strings = new ArrayList<>();
        strings.add("First");
        strings.add(Boolean.TRUE); // note that if this was a list with specified type, it would not let adding a boolean type

        System.out.println(strings); //[First, true]
    }

    private static void instantiationExamples() {
        ArrayList defaultList = new ArrayList();
        ArrayList listWithDefinedSize = new ArrayList(12);
        ArrayList createdFromAnotherList = new ArrayList(defaultList);

        //creating list as they extend array list
        List<String> stringList = new ArrayList<>();
    }
}
