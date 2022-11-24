public class ContactItemEditPayload {
    private String newFirstName;
    private String newSecondName;
    private String newPhoneNumber;

    public String getNewFirstName() {
        return newFirstName;
    }

    public String getNewSecondName() {
        return newSecondName;
    }

    public String getNewPhoneNumber() {
        return newPhoneNumber;
    }

    public ContactItemEditPayload(String newFirstName, String newSecondName, String newPhoneNumber) {
        this.newFirstName=newFirstName;
        this.newSecondName=newSecondName;
        this.newPhoneNumber=newPhoneNumber;
    }
}
