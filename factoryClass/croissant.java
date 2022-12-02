package factoryClass;

public class croissant implements productType{
    @Override
    public void create(){
        System.out.println("inside croissant::pastryType() method");
    }

    @Override
    public String getName() {
        String output = "croissant";
        return output;
    }

    @Override
    public double getPrice() {
        return 2;
    }
}

