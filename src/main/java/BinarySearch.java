import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = new int[101];
    for (int i = 0; i <= 100; i++) {
      arr[i] = i;
    }
    int randomNumber = new Random().nextInt(100);
//    System.out.println(findArrayElement(arr, 100));
//    System.out.println(binarySearch(arr, 100));
    System.out.println(findArrayElement(arr, randomNumber));//linear time O(n)
    System.out.println(binarySearch(arr, randomNumber));    //logarithmic(log) time O(log n)

    List<Integer> arrayList = new ArrayList();
    List<Integer> linkedList = new LinkedList();
    for (int i = 0; i <= 10000000; i++) {
      arrayList.add(i);
      linkedList.add(i);
    }
    long startTime = System.nanoTime();
    arrayList.contains(9999999);
    System.out.println(System.nanoTime() - startTime);
    startTime = System.nanoTime();
    linkedList.contains(9999999);
    System.out.println(System.nanoTime() - startTime);
  }

  static int findArrayElement(int[] arr, int element) {
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == element){
        return i;
      }
    }
    return -1;
  }

  static int binarySearch(int[] arr, int element) {
    int i = 0;
    int low = 0;
    int high = arr.length - 1;
    while(low <= high) {
      i++;
      int mid = (high + low)/2;
      if(arr[mid] == element){
        return i;
      } else if (arr[mid] > element) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return -1;
  }

}
