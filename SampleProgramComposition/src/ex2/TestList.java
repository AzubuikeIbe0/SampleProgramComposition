package ex2;

import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // Capacity starts at 10, but size starts at 0
        System.out.println("Initial size: " + names.size());

        // Add three String references
        names.add("Grafton Street");
        names.add("Capel Street");
        names.add("South Anne Street");

        System.out.println("new size: " + names.size());

        // Access and print out the Objects
        for (int i = 0; i < names.size(); i++) {
            System.out.println("element " + i + ": " + names.get(i));
        }

        // Access and print out the Objects using enhanced for
        System.out.println("Names");
        for (String s : names) {
            System.out.println(s);
        }
        String overwritten = names.set(0, "Henry Street");
        System.out.printf("Street %s overwritten with Henry Street%n", overwritten);

        //Add the street “Dame Street” into the 2nd element and
        // print the contents of the arrayList
        names.add(1, "Dame Street");
        System.out.println("Dame Street added to 2nd position");
        for (String s : names) {
            System.out.println(s);
        }
        String shortestName = names.get(0);
        int shortest = shortestName.length();
        for (String s : names) {
            if(s.length() < shortest){
                shortest = s.length();
                shortestName = s;
            }
        }
        System.out.println("Shortest Name        :" + shortestName);
        System.out.println("Shortest name length :" + shortest);
    }
}
