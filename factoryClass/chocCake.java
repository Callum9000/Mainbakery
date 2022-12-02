package factoryClass;

public class chocCake implements productType{
    int price = 200;
    @Override
    public void create(){
        System.out.println("inside choc cake::cakeType() method");
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}
