package section.eight;

import java.util.ArrayList;
import java.util.Arrays;

class Contacts {
    private ArrayList<String[]> list = new ArrayList<String[]>();

    void addContact(String[] person){
        list.add(person);
    }

    void printList() {
        for (String[] person : list){
            System.out.println(Arrays.toString(person));
        }
    }




}
