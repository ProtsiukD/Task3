package practical;

/**
 * Created by prots on 26.04.2017.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    Product(String name, double price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }

    public static String maxPrice(Product product1, Product product2, Product product3, Product product4) {
        double tmp = product1.price >= product2.price ? product1.price : product2.price;
        double tmp1 = product3.price >= product4.price ? product3.price : product4.price;
        double tmp2 = tmp >= tmp1 ? tmp : tmp1;
        if(tmp2 == product1.price){
            return "Max price = "+Double.toString(tmp2)+". It's "+product1.name+". Them quantity "+product1.quantity+".";
        }
        if(tmp2 == product2.price){
            return "Max price = "+Double.toString(tmp2)+". It's "+product2.name+". Them quantity "+product2.quantity+".";
        }
        if(tmp2 == product3.price){
            return "Max price = "+Double.toString(tmp2)+". It's "+product3.name+". Them quantity "+product3.quantity+".";
        }
        if(tmp2 == product4.price){
            return "Max price = "+Double.toString(tmp2)+". It's "+product4.name+". Them quantity "+product4.quantity+".";
        }
        else
            return "Wrong";
    }

    public static String maxQuantity(Product product1, Product product2, Product product3, Product product4) {
        int tmp = product1.quantity >= product2.quantity ? product1.quantity : product2.quantity;
        int tmp1 = product3.quantity >= product4.quantity ? product3.quantity : product4.quantity;
        int tmp2 = tmp >= tmp1 ? tmp : tmp1;
        if(tmp2 == product1.quantity){
            return "Max quantity = "+Integer.toString(tmp2)+". It's "+product1.name+". Them price "+product1.price+".";
        }
        if(tmp2 == product2.quantity){
            return "Max quantity = "+Integer.toString(tmp2)+". It's "+product2.name+". Them price "+product2.price+".";
        }
        if(tmp2 == product3.quantity){
            return "Max quantity = "+Integer.toString(tmp2)+". It's "+product3.name+". Them price "+product3.price+".";
        }
        if(tmp2 == product4.quantity){
            return "Max quantity = "+Integer.toString(tmp2)+". It's "+product4.name+". Them price "+product4.price+".";
        }
        else
            return "Wrong";
    }

    public static void main(String[] args) {
        Product product1 = new Product("rice", 37.80, 3);
        Product product2 = new Product("buckwheat", 20.13, 5);
        Product product3 = new Product("semolina", 15.45, 4);
        Product product4 = new Product("green pea", 23.50, 7);

        System.out.println(maxPrice(product1, product2, product3, product4));
        System.out.println(maxQuantity(product1, product2, product3, product4));
    }
}