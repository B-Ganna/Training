package java2notice_tutorial.collectionExamples;


import java.util.Comparator;

public class EmpyComp implements Comparator<Empy> {
    @Override
    public int compare(Empy o1, Empy o2) {
        return o1.getSalary().compareTo(o2.getSalary());
    }
}
