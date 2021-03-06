import java.util.*;

public class PhoneBook {

    private final Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void addContact(String name, String phone) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phone);
        } else {
            ArrayList<String> numbs = new ArrayList<>();
            numbs.add(phone);
            phoneBook.put(name, numbs);
        }
    }
    public void getAllContscts () {
        System.out.println(phoneBook.entrySet());
    }

    public List<String> getContact(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Номера людей с фамилией " + name + ":");
            System.out.println(phoneBook.get(name));
            return phoneBook.get(name);
        }

        return null;
    }
}