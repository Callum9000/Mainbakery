package BillPackage;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class BillObserver implements PropertyChangeListener {
    public BillObserver(Bill bill) {
        bill.addChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        System.out.println("Changed property: " + event.getPropertyName() + " [old -> "
            + event.getOldValue() + "] | [new -> " + event.getNewValue() +"]");
    }
}
