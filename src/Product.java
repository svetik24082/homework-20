import java.util.*;

public class Product {


    private final String nameProducts;
    private final double price;
    private final double quantity;
    private boolean checked;


    public Product(String nameProducts, double price, double quantity) {
        if (nameProducts == null) {
            throw new IllegalArgumentException(" Заполните карточку товара полностью");

        } else {
            this.nameProducts = nameProducts;
        }
        if (price == 0) {
            throw new IllegalArgumentException(" Заполните карточку товара полностью");
        } else {
            this.price = price;
        }

        if (quantity == 0) {
            throw new IllegalArgumentException(" Заполните карточку товара полностью");
        } else {
            this.quantity = quantity;
        }
        this.checked = false;
    }


    public String getNameProducts() {
        return nameProducts;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(nameProducts, product.nameProducts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameProducts);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Да" : "Нет";
        return String.format(this.nameProducts + " , Цена " + this.price + " , " +
                "количество" + this.quantity + " , куплен");
    }

}
















