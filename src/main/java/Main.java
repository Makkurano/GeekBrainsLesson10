import java.util.*;

public class Main {
    //Создаем массив ArrayList для задания 1
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Lemon");
        fruits.add("Watermelon");
        fruits.add("Melon");
        fruits.add("Apple");
        fruits.add("Peach");
        fruits.add("Banana");

        // выводим первоначальный массив
        System.out.println(fruits);

        // создаем массив типа HashSet, который не поддерживает дублирование
        HashSet<String> uniqueFruits = new HashSet<>();

        // поэлементово копируем значения из первого массива в HashSet
        Iterator<String> iter = fruits.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            uniqueFruits.add(str);
        }

        // выводим что получилось (массив HashSet).
        System.out.println("Уникалньые фрукты:");
        System.out.println(uniqueFruits);

        //Создаем массив типа HashMap. Добавляем в него данные из изначального массива friuts
        //Поэлементово сравниваем наличия такого же ключа, если такой ключ был - добавляем +1 к значению, если не
        //то ставим значение единицы.

        HashMap<String, Integer> fruitsCount = new HashMap<String, Integer>();
        for (String s : fruits) {
            if (fruitsCount.containsKey(s)) fruitsCount.replace(s, fruitsCount.get(s) + 1);
            else fruitsCount.put(s, 1);
        }
        //выводим поулченный массив
        System.out.println(fruitsCount);
        System.out.println("=======Задача 2========");
        PhoneBook pb = new PhoneBook();
        pb.addContact("Иванов", "1111");
        pb.addContact("Иванов", "2222");
        pb.addContact("Петров", "44444");
        pb.addContact("Иночкин", "77777");
        pb.addContact("Сидоров", "66666");
        pb.addContact("Иванов", "33333");
        pb.addContact("Петров", "55555");

        System.out.println("Все номера из книги");
        pb.getAllContscts();
        System.out.println("==================");

        pb.getContact("Иванов");
        pb.getContact("Петров");
    }
}
