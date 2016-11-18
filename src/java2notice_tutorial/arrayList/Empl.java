package java2notice_tutorial.arrayList;


public class Empl {
    public String name;
    public int salary;

    public Empl(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + this.name + '\'' +
                ", salary=" + this.salary +
                '}';
    }
}
