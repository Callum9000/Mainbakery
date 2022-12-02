package factoryClass;

public class chocCake implements productType{
    @Override
    public void create(){
        System.out.println("inside choc cake::cakeType() method");
    }
}
