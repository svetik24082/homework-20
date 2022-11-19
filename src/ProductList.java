import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {
    private final Set<Product> products = new HashSet<>();

    void addProduct(Product product) {
        if (product == null) {
            return;
        }
        if (this.products.contains(product)) {
            throw new IllegalArgumentException(" Такой товар уже есть в корзине");
        } else {
            this.products.add(product);
        }
    }

    public void checkProduct(String nameProducts) {
        for (Product product : this.products) {
            if (product.getNameProducts().equals(nameProducts)) {
                product.setChecked();
                break;
            }
        }
    }

    public void removeProduct(String nameProduct) {
        Iterator<Product> productIterator = this.products.iterator();
        while (productIterator.hasNext()) {
            if (productIterator.next().getNameProducts().equals(nameProduct)) {
                productIterator.remove();
                break;
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" Список продуктов: ").append('\n');
        for (Product product : this.products) {
            stringBuilder.append(product).append('\n');
        }
        return stringBuilder.toString();
    }
}

