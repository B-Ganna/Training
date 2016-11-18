package denis_prokopjuk.webinar7_8.collectionsExampleSet;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class StudentListener implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("StudentListener.");
        System.out.println("\tProperty: "+evt.getPropertyName());
        System.out.println("\tOld value: "+evt.getOldValue());
        System.out.println("\tNew value: "+evt.getNewValue());
    }
}
