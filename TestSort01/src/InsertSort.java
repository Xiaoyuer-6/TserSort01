import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-06-24
 * Time: 19:30
 */
public class InsertSort {
    public static  void  insertsort(int[] array){
        for (int i = 1; i <array.length ; i++) {
            int tmp = array[i];
            int j =i-1;
            for (; j >=0 ; j--) {
                if (array[j]>tmp){
                    array[j+1] =array[j];
                }else {
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,123,56,8,99,13};
        System.out.println(Arrays.toString(array));
        insertsort(array);
        System.out.println(Arrays.toString(array));
    }
}
