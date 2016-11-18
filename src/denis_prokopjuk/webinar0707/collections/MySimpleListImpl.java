package denis_prokopjuk.webinar0707.collections;


import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MySimpleListImpl implements MySimpleList {

    private Object data[];
    private int capacity;
    private int currentSize;
    long version;

    public MySimpleListImpl() {
        this(10);
    }

    public MySimpleListImpl(int capacity) {
        this.capacity = capacity;
        data = new Object[capacity];
    }

    @Override
    public void add(Object obj) {
        if (currentSize + 1 > data.length) {
            data = Arrays.copyOf(data, data.length + capacity * 2);
        }
        data[currentSize] = obj;
        currentSize++;
        version++;
    }

    @Override
    public Object set(int index, Object obj) {
        Object oldValue = data[index];
        data[index] = obj;
        return oldValue;
    }

    @Override
    public Object get(int index) {
        return data[index];
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public Object remove(int index) {
        //[] [] [] [] [] [] [] [] [] []
        //["Denis"] ["Boris] ["Piter] [] [] [] [] [] [] []  - [10] size = 3 = currentSize

        //todo:удаление с конца
        //["Denis"] ["Boris] [] [] [] [] [] [] [] []  - [10] size = 2 = currentSize

        if (index + 1 == currentSize) {
            currentSize--;
            data[currentSize + 1] = null;
        }

        //todo:удаление с середины
        //["Denis"] ["Boris] ["Piter] ["Jack"] [] [] [] [] [] []  - [10] size = 4 = currentSize
        //["Denis"] ["Piter] ["Jack"] [] [] [] [] [] [] [] - [10] size = 3 = currentSize

        //["Denis"] ["Boris] ["Piter] ["Jack"] [] [] [] [] [] []  - [10] size = 4 = currentSize
        //["Denis"] ["Piter] ["Jack"] ["Jack"] [] [] [] [] [] [] - [10] size = 4 = currentSize

        if (index + 1 < currentSize) {
            for (int i = index; i < currentSize - 1; i++) {
                data[i] = data[i + 1];
            }
            currentSize--;
            data[currentSize+1]=null;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }


    @Override
    public Iterator iterator() {
        return new Iterator() {
            int iteratorIndex;
            long version = MySimpleListImpl.this.version;

            @Override
            public boolean hasNext() {
                return iteratorIndex < size();
            }

            @Override
            public Object next() {
                if (version != MySimpleListImpl.this.version) {
                    throw new ConcurrentModificationException("Wrong version№ ");
                }
                return get(iteratorIndex++);
            }
        };
    }


    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
