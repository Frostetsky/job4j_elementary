package job4j.pojo;

import java.util.Arrays;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Fish",22);
        products[4] = new Product("Sausage",23);
        System.out.println(Arrays.toString(products));
        new Shop().delete(products,2);
        System.out.println(Arrays.toString(products));
    }

    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
