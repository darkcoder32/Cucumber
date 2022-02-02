package amazonImplementation;

import java.util.*;

public class Product {
    private String productName;
    private int price;
    public Product(String productName, int price) {
        this.price = price;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<String> getProductList() {
        List<String> productList = new ArrayList<String>();
        productList.add("Apple Macbook Air");
        productList.add("Apple Iphone");
        productList.add("Apple Macbook Pro");
        return productList;
    }
}
