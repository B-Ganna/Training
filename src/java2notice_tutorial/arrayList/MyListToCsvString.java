package java2notice_tutorial.arrayList;


import java.util.ArrayList;
import java.util.List;

public class MyListToCsvString {
    public String getListAsScvString(List<String> list) {
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
        List<String> lil = new ArrayList<String>() {
            {
                this.add("animal");
                this.add("nuts");
                this.add("java");
            }
        };
        MyListToCsvString mtc = new MyListToCsvString();
        System.out.println(mtc.getListAsScvString(lil));
        List<String> lil2 = new ArrayList<String>() {
            {
                this.add("java");
                this.add("unix");
                this.add("c++");
            }
        };
        System.out.println(mtc.getListAsScvString(lil2));


    }
}
