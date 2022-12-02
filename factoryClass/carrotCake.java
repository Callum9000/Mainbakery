package factoryClass;

public class carrotCake implements productType{
    int price = 100;
    @Override
    public void create(){
        System.out.println("inside carrot cake::cakeType() method");
    }
    @Override
    public int getPrice(){
        return this.price;
    }
}