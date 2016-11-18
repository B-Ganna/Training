package java2notice_tutorial.collectionExamples;


import java.util.Comparator;

public class EmpComp implements Comparator<Emp> {

    @Override
    public int compare(Emp e1, Emp e2) {
        if (e1.getEmpId() == e2.getEmpId()) {
            return 0;
        } else {
            return -1;
        }
    }
}
