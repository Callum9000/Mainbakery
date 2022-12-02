package factoryClass;

public class carrotCake implements productType{
    @Override
    public void create(){
        System.out.println("inside carrot cake::cakeType() method");
    }

    @Override
    public String getName() {
        String output = "Carrot Cake";
        return output;
    }

    @Override
    public double getPrice() {
        return 5.0;
    }

}