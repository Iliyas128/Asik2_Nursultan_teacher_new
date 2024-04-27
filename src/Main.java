import java.util.ArrayList;
public class Main{
public static void main(String[] args) {
        MyArrayList myArrayList =  new MyArrayList();


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
                "");
        System.out.println(myArrayList.indexOf(4));
        System.out.println(myArrayList.exists(7));


        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addElement(1);
        linkedList.addElement(2);
        linkedList.addElement(3);
        linkedList.addElement(4);
        linkedList.addElement(5);
        linkedList.addElement(6);
        linkedList.addElement(7);
        linkedList.addElement(8);
        linkedList.printArr();

    }
}