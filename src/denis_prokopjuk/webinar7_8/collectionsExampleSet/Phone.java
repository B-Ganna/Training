package denis_prokopjuk.webinar7_8.collectionsExampleSet;


import javax.swing.event.SwingPropertyChangeSupport;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Phone {
    private String title;
    private PropertyChangeSupport support = new SwingPropertyChangeSupport(this);


    public Phone(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        support.firePropertyChange("title", this.title, title);
        this.title = title;
    }
    public void addListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }
}
