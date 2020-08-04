public class Recurtion {

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    print(arr);
    print2(arr, 0);
    System.out.println(fact(5));
  }

  static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  static void print2(int[] arr, int index) {
    if(index == arr.length) {
      return;
    } else {
      System.out.println(arr[index]);
      print2(arr, ++index);
    }
  }

  static int fact(int i) {
    if(i == 1){
      return i;
    }
    return i * fact(--i);
  }

}
