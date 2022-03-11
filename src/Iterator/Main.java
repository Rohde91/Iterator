package Iterator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
/*
        ArrayList<Person> tabel = new ArrayList<Person>();

        person p1 = new person(1, "Bob", "Ross");
        person p2 = new person(2, "Donkey", "Kong");
        person p3 = new person(3, "Super", "Mario");
        person p4 = new person(4, "Monkey", "Man");
        person p5 = new person(5, "Insane", "Ex");
*/

        Person[] array = new Person[3];

        array[0] = new Person(1, "Martin", "Rohde");
        array[1] = new Person(2, "Dan", "Petersen");
        array[2] = new Person(3, "Bob", "Ross");

        CollectionofNames cmpnyRepository = new CollectionofNames(array);

        for(Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
