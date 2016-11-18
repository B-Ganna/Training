package java2notice_tutorial.collectionExamples;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyListBinarySearch {
    public static void main(String[] args) {
        List<Emp> empList = new ArrayList<>();
        empList.add(new Emp(12, "Dinesh", 50000));
        empList.add(new Emp(146, "Tom", 20000));
        empList.add(new Emp(201, "John", 40000));
        empList.add(new Emp(302, "Krish", 44500));
        empList.add(new Emp(543, "Abdul", 10000));

        Emp searchKey = new Emp(201, "John", 40000);
        int index = Collections.binarySearch(empList, searchKey, new EmpComp());
        System.out.println("Index of the searched key: " + index);
    }
}
