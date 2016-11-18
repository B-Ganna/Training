package java2notice_tutorial.treeSet;


import java.util.Comparator;

public class EmpComp implements Comparator<Emp> {
    @Override
    public int compare(Emp e1, Emp e2) {
        if (e1.getEmpId() == e2.getEmpId()) {
            return 0;
        }
        if (e1.getEmpId() < e2.getEmpId()) {
            return 1;
        } else {
            return -1;
        }
    }
}
