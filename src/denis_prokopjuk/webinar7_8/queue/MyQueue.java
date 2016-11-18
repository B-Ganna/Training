package denis_prokopjuk.webinar7_8.queue;


public interface MyQueue {

    public Object peek();

    public Object poll();

    public void offer(Object val);

    public int size();

    public boolean isEmpty();

}
