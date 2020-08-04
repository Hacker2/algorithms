public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = new int[101];
    int[] arr2 = new int[101];
    for (int i = 100, j = 0; i > 0; i--, j++) {
      arr[j] = i;
      arr2[j] = i;
    }
    int[] sortedArr = sort(arr);
    sort2(arr2);
    for (int i = 0; i < sortedArr.length; i++) {
      System.out.println(sortedArr[i]);
      System.out.println(arr2[i]);
    }
  }

  static int[] sort(int[] arr) {
    int[] sortedArr = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      int minIndex = getMin(arr);
      sortedArr[i] = arr[minIndex];
      arr[minIndex] = 999;
    }
    return sortedArr;
  }

  static int getMin(int[] arr) {
    int min = 0;
    for (int i = 1; i < arr.length; i++) {
      if(arr[min] > arr[i]) {
        min = i;
      }
    }
    return min;
  }

  static void sort2(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int minIndex = getMin2(arr, i);
      if(minIndex != i) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
      }
    }
  }

  static int getMin2(int[] arr, int index) {
    int min = index;
    for (int i = index + 1; i < arr.length; i++) {
      if(arr[min] > arr[i]) {
        min = i;
      }
    }
    return min;
  }

}
