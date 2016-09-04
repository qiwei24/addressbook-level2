package seedu.addressbook.data.person;

public class Contact {
    
    public final String value;
    private boolean isPrivate;
    
    
    public Contact(String contact, boolean isPrivate){
        this.isPrivate = isPrivate;
        contact = contact.trim();
        this.value = contact; 
    }
    
    @Override
    public String toString() {
        return value;
    }
    
    @Override
    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}
