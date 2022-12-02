package factoryClass;

public class carrotCake implements productType{
    @Override
    public void create(){
        System.out.println("inside carrot cake::cakeType() method");
    }
}