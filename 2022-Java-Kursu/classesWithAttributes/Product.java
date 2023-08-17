package classesWithAttributes;

public class Product {
    public Product(){
    }

    public Product(int id,String name,String description,double price,String renk,int stockAmount){
        this.id=id;
        this.description=description;
        this.name=name;
        this.price=price;
        this.renk=renk;
        System.out.println(id+" " +name +" "+stockAmount+" "+description+" "+price+" "+renk+" özelliklerdeki ürün");
    }
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String description;
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    private double price;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    private int stockAmount;
    public int getStockAmount() {
        return stockAmount;
    }
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
    private String renk;
    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    private String kod;
    public String getKod() {
        return this.name.substring(0,1) + id;
    }    
}
