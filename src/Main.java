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


        Passport ivanov = new Passport(123456789, "Иванов", "Иван", "Иванович", LocalDate.now());
        Passport petrov = new Passport(256984215, "Петров", "Иван", "Иванович", LocalDate.now());
        Passport sydorov = new Passport(598745632, "Сидоров", "Иван", "Иванович", LocalDate.now());
        Passport sydorov2 = new Passport(598745632, "Сидор", "Иван", "Иванович", LocalDate.now());

        // System.out.println(ivanov);
        PassportList passportList = new PassportList();
        passportList.addOrUpdatePassport(ivanov);
        System.out.println();
        passportList.addOrUpdatePassport(petrov);
        passportList.addOrUpdatePassport(sydorov);
        passportList.addOrUpdatePassport(sydorov2);
        passportList.findByNumber(sydorov2.getNumber());

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












