package factoryClass;

public class chocCake implements productType{
    @Override
    public void create(){
        System.out.println("inside choc cake::cakeType() method");
    }

    @Override
    public String getName() {
        String output = "Chocolate cake";
        return output;
    }

    @Override
    public double getPrice() {
        return 6.0;
    }
}

