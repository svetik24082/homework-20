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
    }
}












