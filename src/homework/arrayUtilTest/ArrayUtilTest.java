package homework.arrayUtilTest;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {33, 56, 1, 4, 23, 77, 24, 18};
        arrayUtil.print(array);


        System.out.println("amenamec tiv = " + arrayUtil.max(array));
        System.out.println("amenapoqr tiv = " + arrayUtil.min(array));
        arrayUtil.zuyg(array);
        arrayUtil.kent(array);
        System.out.println(arrayUtil.cauntkent(array));
        System.out.println(arrayUtil.cauntzuyg(array));
        System.out.println(arrayUtil.arjeq(array));


    }
}
