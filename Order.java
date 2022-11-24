import java.util.ArrayList;

import factoryClass.productFactory;
import factoryClass.productType;

public class Order {
   ArrayList<productType> products = new ArrayList<productType>();
// add database
String accountname = "TestUser";
String address = "testplace";
Boolean delivered = false;
Boolean paid = false;

public Order(String accountname, String address){
    this.accountname = accountname;
    this. address = address;
}

public Order(String accountname, String address, productType product){
    this.accountname = accountname;
    this. address = address;
    products.add(product);
}

public String getOrder(String orderId){
    String output;

for (productType product : products) {
    output = output + product.toString();
    }

    return("current order = " + output);
     
}

public String addOrder(productType newProd){
    try{
    products.add(newProd);
    return newProd.toString();
    }
    catch(Exception e){
        return ("could not add :" + newProd.toString());
    }
}

public String getAccountName(){
 return this.accountname;
}
public String getAddress(){
    return this.address;
}
public boolean getdelivered(){
    return this.delivered;
}

public boolean getPaid(){
    return this.paid;
}

public String setAccountName(String accountname){
this.accountname = accountname;
}
public String setAddress(String address){
    this.address = address;
}
public boolean setdelivered(boolean delivered){
    this.delivered = delivered;
}
public boolean setPaid(boolean paid){
    this.paid = paid;
}

}
