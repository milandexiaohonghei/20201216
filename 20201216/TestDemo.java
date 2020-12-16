import java.util.Arrays;

public class TestDemo {


   // 实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组
   public static void main(String[] args) {
       int[] array = new int[]{1,8,10,12,65,17,45};
        int[] array2 = mycopyof(array);
       System.out.println(Arrays.toString(array2));
   }
   public static int[] mycopyof(int[] array){
       int ret[] = new int[array.length];
       for(int i = 0;i < array.length;i++){
           ret[i] = array[i];
       }
       return ret;
   }




    //实现一个方法 toString, 把一个整型数组转换成字符串. 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]", 注意 逗号 的位置和数量.

    public static void main4(String[] args) {
        int[] array = new int[]{1,8,10,12,65,17,45};
         System.out.println(mytoString(array));
    }
    public static String mytoString(int[] array){
        String ret = "[";

        for(int i = 0;i<array.length;i++){
            ret += array[i];
            if(i != array.length-1 ){
                ret += ",";
            }
        }
        ret = ret + "]";
        return ret;
    }



    //给定一个有序整型数组, 实现二分查找

    public static void main3(String[] args) {
        int[] array = new int[]{1,8,10,12,65,17,45,25,46,56,65};
        System.out.println(binarySearch(array, 46));
    }
    public static int binarySearch(int[] array,int k){
       Arrays.sort(array);
       int left = 0;
       int right= array.length - 1;
       while(left<=right){
           int mid = (array[(right+left)/2]);
           if(mid == k){
               return k;
           }else if(mid < k){
               left = (right+left)/2 +1;
           }else{
               right = (right+left)/2 -1;
           }
       }
       return -1;

    }




    //给定一个整型数组, 判定数组是否有序（递增）
  public static void main2(String[] args) {
      int[] array = new int[]{1,8,10,12,65,17,45};
      System.out.println(isSorted(array));
  }
  public static boolean isSorted(int[] array){
      for(int i = 0;i<array.length-1;i++){
          if(array[i]>array[i+1]){
              return false;
          }
      }
      return true;
  }





   //给定一个整型数组, 实现冒泡排序(升序排序)

    public static void main1(String[] args) {
        int[] array = new int[]{4,25,8,10,13,12,9,5,6};
       int ret[] = bubbleSort(array);
        System.out.println(Arrays.toString(ret));

    }


    public static int[] bubbleSort(int[] array){
        for(int i= 0;i<array.length-1;i++){
            boolean a = true;
            for(int j= 0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    a = false;
                }
            }
            if(a=false){
                return array;
            }
        }
        return array;

    }

}
