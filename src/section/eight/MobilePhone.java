package section.eight;

import java.util.Scanner;

public class MobilePhone {
    public static void main(String[] args) {
        Contacts contacts = new Contacts();
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean run = true;
        while (run) {
            System.out.println(":::Enter choice [0-5, 0 for help]:::");
            System.out.print("-> ");
            choice = scanner.nextInt();
            switch(choice) {
                case 0:
                    help();
                    break;
                case 1:
                    contacts.printList();
                    break;
                case 2:
                    contacts.addContact(newContact());
                    break;
                case 5:
                    System.out.println("Exiting System");
                    run = false;
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }

    private static void help(){
        System.out.println("0 - Print this help menu");
        System.out.println("1 - Print list of contacts");
        System.out.println("2 - Add new contact");
        System.out.println("3 - Delete old contact");
        System.out.println("4 - Update existing contact");
        System.out.println("5 - Quit");
    }

    private static String[] newContact(){
        Scanner s = new Scanner(System.in);
        String[] person = new String[2];
        System.out.println("Enter new contact Name: ");
        System.out.print("-> ");
        person[0] = s.nextLine();
        System.out.println("Enter new contact Number: ");
        System.out.print("-> ");
        person[1] = s.nextLine();
        return person;
    }
}
