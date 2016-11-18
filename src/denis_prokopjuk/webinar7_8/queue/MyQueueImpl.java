package denis_prokopjuk.webinar7_8.queue;


import java.util.Iterator;

public class MyQueueImpl implements MyQueue, Iterable {
    // TODO: Добавление элементов в конец массива

    private Object[] data;
    private int capacity;
    private int currentSize;

    public MyQueueImpl() {
        this(10);
    }

    public MyQueueImpl(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    @Override
    public Object poll() {
        return data[0];
    }

    @Override
    public Object peek() {
        Object oldVAlue = data[0];
        for (int i = 0; i < currentSize - 1; i++) {
            data[i] = data[i++];
        }
        data[currentSize - 1] = null;
        return oldVAlue;
    }

    @Override
    public void offer(Object val) {

        if (currentSize + 1 > data.length) {
            Object[] enrichedData = new Object[capacity + 10];
            System.arraycopy(data, 0, enrichedData, 0, data.length);
            data = enrichedData;

        }
        data[currentSize++] = val;

    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return !isEmpty();
            }

            @Override
            public Object next() {
                return data[0];
            }
        };
    }
}
