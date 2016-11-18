package java2notice_tutorial.collectionExamples;


public class Empl implements Comparable<Empl> {
    private int id;
    private String name;
    private Integer salary;

    public Empl(int id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return id + " " + name + " " + salary;
    }

    @Override
    public int compareTo(Empl emp) {
        return this.salary.compareTo(emp.getSalary());
    }
}
