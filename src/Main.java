import java.awt.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Contact myContact = new Contact();
        Search searchKeyword = new Search();

        String firstName = "Adam";
        String lastName = "Brooks";
        String phoneNumber = "124356";
//        Req 1.
        myContact.addContact(firstName, lastName, phoneNumber);
        myContact.addContact("Celina", "Brooks", "1234");
        List<ContactItem> allContacts = myContact.getAllContact();
        for (ContactItem currContact : allContacts) {
            System.out.println(currContact.toString());
        }
//        Req 2.
        System.out.println("Search Results");
        String keyword = "Adam";
        List<ContactItem> searchResults = myContact.search(keyword);
        for (ContactItem searchResult : searchResults) {
            System.out.println(searchResult);
        }

//        Req 3.
        ContactItem editItem = searchResults.get(0);
        String newFirstName="Ada";
        String newSecondName=null;
        String newPhoneNumber=null;
        ContactItemEditPayload contactItemEditPayload = new ContactItemEditPayload(newFirstName, newSecondName, newPhoneNumber);
        myContact.editContact(editItem, contactItemEditPayload);

        allContacts = myContact.getAllContact();
        for (ContactItem currContact : allContacts) {
            System.out.println(currContact.toString());
        }


    }
}
/*
Contact Management System
John Addison 1234
John Doe 890876


Requirements:
1. We can add a contact with fields: first name, last name, phone number.
2. We can search a contact with any field.
3. We can modify any contact.
 */