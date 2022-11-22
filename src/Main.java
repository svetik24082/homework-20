
import pasport.Passport;
import pasport.PassportList;

import java.time.LocalDate;
import java.util.*;

import static java.util.List.of;

public class Main {

    public static void main(String[] args) {
        Product sugar = new Product(" Сахар", 90.0, 1.0);
        Product milk = new Product(" Молоко", 80, 1.0);
        Product onion = new Product(" Лук", 40, 1.5);
        Product sausage = new Product(" Колбаса", 400, 0.5);
        ProductList productList = new ProductList();
        productList.addProduct(sugar);
        productList.addProduct(milk);
        productList.addProduct(onion);


        productList.removeProduct(onion.getNameProducts());
        productList.checkProduct(sausage.getNameProducts());

        System.out.println(productList);


        numberSetRemoveEven();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);
        Task task = new Task(3, 4);
        Task task2 = new Task(4, 3);
        Set<Task> set = new HashSet<>();
        set.add(task);
        set.add(task2);
        System.out.println(set);

        HashMap<Integer, String> passportsAndNames = new HashMap<>();


        Passport ivanov = new Passport(123456789, "Иванов", "Иван", "Иванович", LocalDate.of(1985, 3, 28));
        Passport petrov = new Passport(223456789, "Петров", "Иван", "Иванович", LocalDate.of(1987, 12, 25));
        Passport sydorov2 = new Passport(323456789, "Сидоров", "Иван", "Иванович", LocalDate.of(1960, 11, 19));
        Passport sydorov = new Passport(223456789, "Васильев", "Иван", "Иванович", LocalDate.of(1960, 11, 19));

        passportsAndNames.put(123456789, " Иванов Иван Иванович");
        passportsAndNames.put(223456789, " Петров Иван Иванович");
        passportsAndNames.put(323456789, " Сидоров Иван Иванович");
        passportsAndNames.put(223456789, " Васильев Иван Иванович");
        System.out.println(passportsAndNames);
        for (Map.Entry entry : passportsAndNames.entrySet()) {
            System.out.println(entry);
        }

        PassportList passportList = new PassportList();
        passportList.addPassport(ivanov);
        passportList.addPassport(petrov);
        passportList.addPassport(sydorov);
        passportList.addPassport(sydorov2);
        passportList.findByNumber(ivanov.getNumber());

        System.out.println(passportList);

    }

    private static void numberSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }
        }
        System.out.println(numbers);

        //  Домашка 2, Задание 4
        //Меньше всего времени на выполнение данного метода( так как он состоит только из целых чисел), потребуется коллекции HashSet, т.к она умеет находить
        // элементы за константное время( фиксированное время), но при условии, что хэш-код написан корректно.
        //   Коллекции ArrayList нужно перебрать весь список.
        // Коллекции LinkedList  потребуется перебрать все ссылки.


    }
}












