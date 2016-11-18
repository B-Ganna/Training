package java2notice_tutorial.linkedList;


import java.util.LinkedList;
import java.util.List;

public class MyListToCsvString {
    public String getListAsCsvString(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(str);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        List<String> li1 = new LinkedList<String>() {
            {
                this.add("animal");
                this.add("nuts");
                this.add("java");
            }
        };

        MyListToCsvString nc = new MyListToCsvString();
        System.out.println(nc.getListAsCsvString(li1));
        List<String> li2 = new LinkedList<String>() {
            {
                this.add("java");
                this.add("unix");
                this.add("c++");
            }
        };
        System.out.println(nc.getListAsCsvString(li2));
    }
}
