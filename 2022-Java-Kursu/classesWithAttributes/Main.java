package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Asus");
        product.setDescription("Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        Product product1 =new Product(1, "lenovo", "Dizüstü pc", 5000, "beyaz", 3);
        System.out.println(product1);
    }

}