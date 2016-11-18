package denis_prokopjuk.webinar7_8.collectionsExampleSet;


import javax.swing.event.SwingPropertyChangeSupport;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Student {
    private String name;
    private int age;
    private PropertyChangeSupport support = new SwingPropertyChangeSupport(this);


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        support.firePropertyChange("name", this.name, name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        support.firePropertyChange("age",this.age,age);
        this.age = age;
    }

    public void addListener(PropertyChangeListener listener){
        support.addPropertyChangeListener(listener);
    }

    @Override
    public String toString() {
        return "Student: " +
                "name='" + name + '\'' +
                ", age=" + age;
    }
}
