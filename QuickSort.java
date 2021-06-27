import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-27
 * Time: 10:30
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1,123,56,8,99,13,567,23,4,76};
        System.out.println(Arrays.toString(array));
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }
    public  static  void quickSort(int[] array){
        quick(array,0,array.length-1);
    }

    private static void quick(int[] array, int low, int high) {
        if (low<high) {
            int piv = pivot(array, low, high);
            quick(array, low, piv - 1);
            quick(array, piv + 1, high);
        }
    }


    private static int pivot(int[] array, int start, int end) {
        int tmp = array[start];
        while (start < end) {
            while (start < end && array[end] >= tmp) {
                end--;
            }
            array[start] = array[end];
            //把数据赋值给start
            while (start < end && array[start] <= tmp) {
                start++;
            }
            //把start下标的值给end
            array[end] = array[start];
        }
        array[start] = tmp;
        return start;

    }
}
