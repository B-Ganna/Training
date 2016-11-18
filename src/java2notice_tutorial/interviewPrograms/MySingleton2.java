package java2notice_tutorial.interviewPrograms;


class MySingleton2 {
    private static MySingleton2 instance;

    static {
        instance = new MySingleton2();
    }

    private MySingleton2() {
        System.out.println("Creating MySingleton object");
    }

    public static MySingleton2 getInstance() {
        return instance;
    }

    public void testSingleton(){
        System.out.println("Hey... Instance got created!");
    }
}
