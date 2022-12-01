package factoryClass;

public class croissant implements productType{
    int price = 50;
    @Override
    public void create(){
        System.out.println("inside croissant::pastryType() method");
    }
    public int getPrice(){
        return this.price;
    }
}
