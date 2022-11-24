import java.util.ArrayList;
import java.util.List;

public class Search {
    public List<ContactItem> searchByAllFields(List<ContactItem> contactList, String keyword) {
        List<ContactItem> result = new ArrayList<>();
        for (ContactItem item : contactList) {
            if(item.getFirstName().contains(keyword) || item.getLastName().contains(keyword) ||
                    item.getPhoneNumber().contains(keyword)){
                result.add(item);
            }
        }
        return result;
    }
}
