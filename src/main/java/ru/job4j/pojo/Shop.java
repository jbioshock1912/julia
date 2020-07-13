package ru.job4j.pojo;

public class Shop {

    public Product[] delete(Product[] products, int index) {
        Product secondTemp;
        Product temp = products[index];
        for (int i = index; i > 0; i--) {
            secondTemp = products[i - 1];
            products[i - 1] = temp;
            temp = secondTemp;
        }
        products[index] = null;
        return products;
    }

    public void print(Product[] products) {
        for (Product value : products) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Product products[] = new Product[7];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Cake", 2);
        products[4] = new Product("Oil", 13);

        Shop shop = new Shop();
        products = shop.delete(products, 4);
        shop.print(products);
    }
}
