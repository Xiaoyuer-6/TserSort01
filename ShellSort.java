import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-26
 * Time: 16:27
 */
public class ShellSort {
    public static void main(String[] args) {
        int[]  array = {1,123,56,8,99,13,567,23,4,76};
        System.out.println(Arrays.toString(array));
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void shellSort(int[] array){
        int[] drr = {5,3,1};
        for (int i = 0; i <drr.length ; i++) {
            shell(array,drr[i]);
        }
    }

    private static void shell(int[] array, int gap) {
        for (int i = gap; i <array.length ; i++) {
            int tmp = array[i];
            int j = i-gap;
            for (; j>=0; j=j-gap) {
                if (array[j]>tmp){
                    array[j+gap] = array[j];

                }else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }
}
