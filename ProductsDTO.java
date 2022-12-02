public class ProductsDTO extends Products{

    public static String productsToString(){
        String output = "Available Products: ";
        for(int i = 0; i < productList.length; i++){
            output += productList[i]+ ". ";
        }
        return output;
    }
}