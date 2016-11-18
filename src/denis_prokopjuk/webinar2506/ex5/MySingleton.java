package denis_prokopjuk.webinar2506.ex5;


import java.util.ArrayList;
import java.util.List;

public class MySingleton {
    private List<Cap> data = new ArrayList<>();
    private static MySingleton instance;

    private MySingleton() {

    }

    public void addCap(Cap cap) {
        boolean isValid = validate(cap);
        if (isValid) {
            data.add(cap);
        }
    }

    public int getSize() {
        return data.size();
    }

    public Cap getCap(int index) {
        return data.get(index);
    }

    public boolean validate(Cap cap) {
        if (cap != null) {
            if (cap.getColor() != null) {
                return true;
            }
        }
        return false;
        ///return cap != null ? cap.getColor() != null : false;
    }

    public static MySingleton initInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}
