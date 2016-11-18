package denis_prokopjuk.webinar0707.collections2;

abstract class Animal {

    public abstract String getType();

    @Override
    public String toString() {
        return "Animal ("+getType()+")";
    }
}