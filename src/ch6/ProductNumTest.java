package ch6;

public class ProductNumTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

    }
}
class Product {
    static int idnum = 0;
    {
        idnum ++;
    }
    Product() {
        System.out.println("Product의 idnum : " + idnum);
    }
}