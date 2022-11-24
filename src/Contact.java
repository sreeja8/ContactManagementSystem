import java.util.ArrayList;
import java.util.List;

public class Contact {

    private List<ContactItem> contactList;
    private Search search;

    public Contact() {
        this.contactList = new ArrayList<>();
        this.search = new Search();
    }

    public void addContact(String firstName, String lastName, String phoneNumber) {
        ContactItem contactItem = new ContactItem(firstName, lastName, phoneNumber);
        contactList.add(contactItem);
    }

    public List<ContactItem> search(String keyword) {
        return this.search.searchByAllFields(this.contactList, keyword);
    }

    public List<ContactItem> getAllContact() {
        return this.contactList;
    }

    public ContactItem editContact(ContactItem editItem, ContactItemEditPayload contactItemEditPayload) {
        if(contactItemEditPayload.getNewFirstName() != null){
            editItem.setFirstName(contactItemEditPayload.getNewFirstName());
        }
        if(contactItemEditPayload.getNewSecondName() != null){
            editItem.setLastName(contactItemEditPayload.getNewSecondName());
        }
        if(contactItemEditPayload.getNewPhoneNumber() != null){
            editItem.setPhoneNumber(contactItemEditPayload.getNewPhoneNumber());
        }
        int index=0;
        for (ContactItem contactItem : this.contactList) {
            if(contactItem.getId() == editItem.getId()){
                contactList.set(index,editItem);
            }
            index++;
        }
        return editItem;
    }
}
