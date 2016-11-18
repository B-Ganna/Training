package java2notice_tutorial.collectionExamples;


import java.util.Collections;
import java.util.List;

public class MyObjectNCopies {
    public static void main(String[] args) {
        String temp = "JAVA_TO_NOTICE";
        List<String> tempCopies = Collections.nCopies(5, temp);
        System.out.println(tempCopies);
        Empy emp = new Empy(10, "Raghu", 25000);
        List<Empy> empyCopies = Collections.nCopies(5, emp);
        for (Empy em : empyCopies) {
            System.out.println(em);
        }

    }
}
