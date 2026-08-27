package fundamentals.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        // CREATE
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Shanghai");
        cities.add("Beijing");
        cities.add("Casablanca");
        cities.add("Rabat");

        System.out.println("After add: " + cities);


        // READ
        String city = cities.get(0);
        boolean has = cities.contains("Fes");
        int index = cities.indexOf("Beijing");

        System.out.println("Get index 0: " + city);
        System.out.println("Contains Fes: " + has);
        System.out.println("Index of Beijing: " + index);
        System.out.println("Size: " + cities.size());


        // UPDATE
        cities.set(2, "Madrid");

        System.out.println("After update: " + cities);


        // DELETE
        cities.remove("Rabat");

        System.out.println("After remove: " + cities);


        // LOOP
        System.out.println("Cities:");

        for (String cityName : cities) {
            System.out.println(cityName);
        }


        /*
         * Array vs ArrayList:
         *
         * 1. Array has a fixed size, while ArrayList can grow and shrink.
         * 2. Array uses .length, while ArrayList uses .size().
         * 3. ArrayList uses methods like add(), get(), set(), and remove().
         */
    }
}