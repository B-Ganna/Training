package denis_prokopjuk.webinar0707.collections;


public class MyListApp {
    public static void main(String[] args) {
        MySimpleList mySimpleList = new MySimpleListImpl(5);
        mySimpleList.add("Name1");
        mySimpleList.add("Name2");
        mySimpleList.add("Name3");
        mySimpleList.add("Name4");
        System.out.println(mySimpleList.size());
        System.out.println(mySimpleList.isEmpty());

        mySimpleList.add("Name1");
        mySimpleList.add("Name1");
        mySimpleList.add("Name1");
        System.out.println(mySimpleList.size());
        System.out.println(mySimpleList.isEmpty());

        System.out.println(mySimpleList.get(3));
        Object oldValue = mySimpleList.set(3, "Test");
        System.out.println("OldValue= " + oldValue);
        System.out.println(mySimpleList.get(3));
        System.out.println("-------------------------");
        for (int i =0;i<mySimpleList.size();i++){
            System.out.println(mySimpleList.get(i));
        }
        for (Object obj:mySimpleList){
            System.out.println(obj);
        }


    }
}
