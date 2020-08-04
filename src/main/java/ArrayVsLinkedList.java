import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayVsLinkedList {

  public static void main(String[] args) {
//    System.out.println(2 >> 1);
//    System.out.println(5 >> 1);
//    System.out.println(10 >> 1);
//    System.out.println(15 >> 1);
//    System.out.println(49 >> 1);

//    insertion()
//    insertionSmallAmount();
//    insertionIntoBegining();
//    insertionIntoMiddle();
//    randomInsertion();

//    read();
//    randomRead();

//    remove();
//    removeObject();
//    removeLast();
//    removeRandom();
  }

  static void insertion() {
    List<Integer> arrayList = new ArrayList();
    long startTime = System.currentTimeMillis();
    for (int i = 0; i <= 10000000; i++) {
      arrayList.add(i);
    }
    System.out.println(System.currentTimeMillis() - startTime);

    List<Integer> linkedList = new LinkedList();
    startTime = System.currentTimeMillis();
    for (int i = 0; i <= 10000000; i++) {
      linkedList.add(i);
    }
    System.out.println(System.currentTimeMillis() - startTime);
  }

  static void insertionSmallAmount() {
    List<Integer> arrayList = new ArrayList();
    long startTime = System.nanoTime();
    for (int i = 0; i <= 10; i++) {
      arrayList.add(i);
    }
    System.out.println(System.nanoTime() - startTime);

    List<Integer> linkedList = new LinkedList();
    startTime = System.nanoTime();
    for (int i = 0; i <= 10; i++) {
      linkedList.add(i);
    }
    System.out.println(System.nanoTime() - startTime);
  }

  static void insertionIntoBegining() {
    List<Integer> arrayList = new ArrayList();
    arrayList.add(0);
    long startTime = System.currentTimeMillis();
    for (int i = 0; i <= 10000000; i++) {
      arrayList.set(0, i);
    }
    System.out.println(System.currentTimeMillis() - startTime);

    List<Integer> linkedList = new LinkedList();
    linkedList.add(0);
    startTime = System.currentTimeMillis();
    for (int i = 0; i <= 10000000; i++) {
      linkedList.set(0, i);
    }
    System.out.println(System.currentTimeMillis() - startTime);
  }

  static void insertionIntoMiddle() {
    List<Integer> arrayList = new ArrayList();
    for (int i = 0; i <= 1000000; i++) {
      arrayList.add(i);
    }
    long startTime = System.currentTimeMillis();
    for (int i = 0; i <= 1000000; i++) {
      arrayList.set(1000, i);
    }
    System.out.println(System.currentTimeMillis() - startTime);

    List<Integer> linkedList = new LinkedList();
    for (int i = 0; i <= 1000000; i++) {
      linkedList.add(i);
    }
    startTime = System.currentTimeMillis();
    for (int i = 0; i <= 1000000; i++) {
      linkedList.set(1000, i);
    }
    System.out.println(System.currentTimeMillis() - startTime);
  }

  static void randomInsertion() {
    Random randomNumber = new Random();
    List<Integer> arrayList = new ArrayList();
    for (int i = 0; i <= 100000; i++) {
      arrayList.add(i);
    }
    long startTime = System.currentTimeMillis();
    for (int i = 0; i <= 100000; i++) {
      arrayList.set(randomNumber.nextInt(100000), i);
    }
    System.out.println(System.currentTimeMillis() - startTime);

    List<Integer> linkedList = new LinkedList();
    for (int i = 0; i <= 100000; i++) {
      linkedList.add(i);
    }
    startTime = System.currentTimeMillis();
    for (int i = 0; i <= 100000; i++) {
      linkedList.set(randomNumber.nextInt(100000), i);
    }
    System.out.println(System.currentTimeMillis() - startTime);
  }

  static void read() {
    List<Integer> arrayList = new ArrayList();
    for (int i = 0; i <= 100000; i++) {
      arrayList.add(i);
    }
    int j;
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < arrayList.size(); i++) {
      j = arrayList.get(i);
    }
    System.out.println(System.currentTimeMillis() - startTime);

    List<Integer> linkedList = new LinkedList();
    for (int i = 0; i <= 100000; i++) {
      linkedList.add(i);
    }
    startTime = System.currentTimeMillis();
    for (int i = 0; i < linkedList.size(); i++) {
      j = linkedList.get(i);
    }
    System.out.println(System.currentTimeMillis() - startTime);
  }

  static void randomRead() {
    List<Integer> arrayList = new ArrayList();
    for (int i = 0; i <= 100000; i++) {
      arrayList.add(i);
    }
    int j;
    Random randomNumber = new Random();
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < arrayList.size(); i++) {
      j = arrayList.get(randomNumber.nextInt(99999));
    }
    System.out.println(System.currentTimeMillis() - startTime);

    List<Integer> linkedList = new LinkedList();
    for (int i = 0; i <= 100000; i++) {
      linkedList.add(i);
    }
    startTime = System.currentTimeMillis();
    for (int i = 0; i < linkedList.size(); i++) {
      j = linkedList.get(randomNumber.nextInt(99999));
    }
    System.out.println(System.currentTimeMillis() - startTime);
  }

  static void remove() {
    List<Integer> arrayList = new ArrayList();
    for (int i = 0; i <= 100000; i++) {
      arrayList.add(i);
    }
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < arrayList.size(); i++) {
      arrayList.remove(i);
    }
    System.out.println(System.currentTimeMillis() - startTime);

    List<Integer> linkedList = new LinkedList();
    for (int i = 0; i <= 100000; i++) {
      linkedList.add(i);
    }
    startTime = System.currentTimeMillis();
    for (int i = 0; i < linkedList.size(); i++) {
      linkedList.remove(i);
    }
    System.out.println(System.currentTimeMillis() - startTime);
  }

  static void removeObject() {
    List<Integer> arrayList = new ArrayList();
    for (int i = 0; i <= 100000; i++) {
      arrayList.add(i);
    }
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < arrayList.size(); i++) {
      arrayList.remove(new Integer(i));
    }
    System.out.println(System.currentTimeMillis() - startTime);

    List<Integer> linkedList = new LinkedList();
    for (int i = 0; i <= 100000; i++) {
      linkedList.add(i);
    }
    startTime = System.currentTimeMillis();
    for (int i = 0; i < linkedList.size(); i++) {
      linkedList.remove(new Integer(i));
    }
    System.out.println(System.currentTimeMillis() - startTime);
  }

  static void removeLast() {
    List<Integer> arrayList = new ArrayList();
    for (int i = 0; i <= 1000000; i++) {
      arrayList.add(i);
    }
    long startTime = System.currentTimeMillis();
    for (int i = arrayList.size() - 1; i > 0; i--) {
      arrayList.remove(i);
    }
    System.out.println(System.currentTimeMillis() - startTime);

    List<Integer> linkedList = new LinkedList();
    for (int i = 0; i <= 1000000; i++) {
      linkedList.add(i);
    }
    startTime = System.currentTimeMillis();
    for (int i = arrayList.size() - 1; i > 0; i--) {
      linkedList.remove(i);
    }
    System.out.println(System.currentTimeMillis() - startTime);
  }

  static void removeRandom() {
    List<Integer> arrayList = new ArrayList();
    for (int i = 0; i <= 100000; i++) {
      arrayList.add(i);
    }
    int j;
    Random randomNumber = new Random();
    long startTime = System.currentTimeMillis();
    for (int i = 0; i < arrayList.size(); i++) {
      j = arrayList.get(randomNumber.nextInt(99999));
    }
    System.out.println(System.currentTimeMillis() - startTime);

    List<Integer> linkedList = new LinkedList();
    for (int i = 0; i <= 100000; i++) {
      linkedList.add(i);
    }
    startTime = System.currentTimeMillis();
    for (int i = 0; i < linkedList.size(); i++) {
      j = linkedList.get(randomNumber.nextInt(99999));
    }
    System.out.println(System.currentTimeMillis() - startTime);
  }

}
