package BillPackage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Bill {
    private int price = 0;
    private boolean paid = false;

    private List<PropertyChangeListener> listener = new ArrayList<PropertyChangeListener>();

    public Bill(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public boolean getPaid(){
        return this.paid;
    }

    
    public void setPrice(int price){
        this.price = price;
    }

    public void pay(){
        notifyListeners(this, "PAID", paid, paid = true);
    }

    private void notifyListeners(Bill object, String paid2, boolean paid3, boolean b) {
        for (PropertyChangeListener name : listener) {
            name.propertyChange(new PropertyChangeEvent(this, paid2, paid3, b));
        }
    }

    public void addChangeListener(PropertyChangeListener newListener) {
        listener.add(newListener);
    }
    
}
