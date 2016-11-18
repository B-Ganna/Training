package denis_prokopjuk.webinar2306.ex3;


public class GrandParent {

    /*public GrandParent() {
        super();
        System.out.println("GrandParent");
    }*/

    public GrandParent(String param) {
        System.out.println("StringGrandParent" + param);
    }

    public GrandParent(int param) {
        System.out.println("IntGrandParent" + param);
    }

    public GrandParent(boolean param) {
        System.out.println("BooleanGrandParent" + param);
    }

    public GrandParent(String param, int param1) {
        this(param);
        System.out.println("StringGrandParent " + param + "IntGrandParent " + param1);
    }


}
