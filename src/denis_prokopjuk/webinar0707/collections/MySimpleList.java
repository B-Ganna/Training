package denis_prokopjuk.webinar0707.collections;


public interface MySimpleList extends Iterable {
    public void add(Object obj);

    public Object set(int index, Object obj);

    public Object get(int index);

    public int size();

    Object remove (int index);

    public boolean isEmpty();

}
