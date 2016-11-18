package denis_prokopjuk.webinar2506.ex3;


public class Phone {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // TODO: HashCode, equals
    // TODO: при переопределении должны быть удовлетворены следующие условия:
    //1) a~b, b~c --> a~c ==> транзитивность
    //2) a~a ==> рефлективность
    //3) a~b --> b~a ==> симметричность
    //4) a.hashCode() == b.hashCode ==> НЕ СЛЕДУЕТ ==> a~b (равенство хеш-кодов не гарантирует равенство объектов, это могут быть разные объекты в памяти)
    //5) a~b ==> a.hashCode() == b.hashCode()


    public boolean equals(Object obj) {
        //return super.equals(obj);
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }
        if (obj.getClass() == Phone.class) {
            Phone phone = (Phone) obj;
            if (name != null) {
                return name.equals(phone.name);
            }
            if (phone.name != null) {
                return phone.name.equals(name);
            }

        }
        return false;
    }

    public int hashCode() {
        /*if (name == null) {
            return 0;
        }
        return name.hashCode();*/

        // TODO: тернарные операторы
        return name == null ? 0 : name.hashCode();
    }
}
