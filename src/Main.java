import java.util.ArrayList;
public class Main{
public static void main(String[] args) {
        MyArrayList myArrayList =  new MyArrayList();

        ArrayList arrayList = new ArrayList();

        //arrayList.add(5);


        myArrayList.addElement(11.5);
        myArrayList.addElement(10);
        myArrayList.addElement(9);
        myArrayList.addElement(8.7);
        myArrayList.addElement(7);
        myArrayList.addElement(6);
        myArrayList.addElement(2);
        myArrayList.addElement(1);
        myArrayList.addElement(4);
        myArrayList.removeFirst();
        myArrayList.printArr();

    }
}