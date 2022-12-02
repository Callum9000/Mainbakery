package factoryClass;
public class productFactory{
    public productType getType(String x){
        if(x == null){
            return null;
        }
        if(x.equalsIgnoreCase("CHOC CAKE")) {
                return new chocCake();
        }else if (x.equalsIgnoreCase("CARROT CAKE")) {
                return new carrotCake();
            }else if (x.equalsIgnoreCase("CROISSANT")) {
                return new croissant();
            }
        return null;
    }
}