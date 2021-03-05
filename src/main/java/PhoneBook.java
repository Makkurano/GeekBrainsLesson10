import java.util.*;

public class PhoneBook {

    private Map<String, String> phoneBook = new HashMap<>();

    public void addContact(String phone, String name) {
        phoneBook.put(phone, name);
    }

    public void getPhoneBook() {
        for (String key : phoneBook.keySet()) {
            String value = phoneBook.get(key);
            System.out.println(key + " : " + value);
        }
    }

    public void getContact(String name) {
        for (String key : phoneBook.keySet()) {
            String value = phoneBook.get(key);
            if (value == name) {
                System.out.println(key + " : " + value);
            }
        }
    }
}