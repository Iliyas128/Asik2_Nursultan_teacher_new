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
        System.out.println("" +
                "");
        myArrayList.addLast(89);
        myArrayList.printArr();
        System.out.println("" +
                "");
        myArrayList.addFirst(45);
        myArrayList.printArr();
        System.out.println("" +
                "");
        myArrayList.remove(2);
        myArrayList.printArr();
        System.out.println("" +
                "");
        myArrayList.addElement(2,69);
        myArrayList.printArr();
        System.out.println("" +
                "ToArray");
        System.out.println(myArrayList.indexOf(4));
        System.out.println(myArrayList.exists(7));



    }
}