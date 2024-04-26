import java.util.Iterator;

public class MyArrayList<T> implements MyList<T>{

    private Object[] array;
    private int size =0;
    private int capacity = 4;
    public MyArrayList(){

    }

    private void checkIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("index not correct");
    }
    @Override
    public void add( T item) {
    if (size==capacity){
        IncreaseB();
    }
    array[size++] = item;
    }
    private void IncreaseB(){
        capacity = 2 * capacity;
        Object array2 = new Object[capacity];
        for (int i = 0; i < size ; i++) {
            array2[i] = array[i];
        }
        array = (Object[]) array2;
    }
    @Override
    public T get(int index) {
        return (T) array[index];
    }

    @Override
    public void set(int index, T item) {
    Object array2[] = new Object[size];
        int i;
        for (i = 0; i < size ; i++){
            if(i == index){
                array2[index] = (Object) item;
                continue;
            }
            array2[i] = array[i];
        }
        array = (Object[]) array2;
    }

    @Override
    public void add(int index, T item) {

    }

    @Override
    public void addFirst(T item) {

    }

    @Override
    public void addLast(T item) {

    }


    @Override
    public T getFirst() {
        return (T) array[0];
    }

    @Override
    public T getLast() {
        return (T) array[size-1];
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void sort() {

    }

    @Override
    public int indexOf(Object object) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object object) {
        return 0;
    }

    @Override
    public boolean exists(Object object) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public void clear() {
        array = (T[]) new Object[5];
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
