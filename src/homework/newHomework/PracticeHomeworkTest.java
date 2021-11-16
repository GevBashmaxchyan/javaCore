package homework.newHomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();
        System.out.println(ph.convert(3));
        System.out.println(ph.calcAge(2));
        System.out.println(ph.nextNumber(4));
        System.out.println(ph.isSameNum(5, 5));
        System.out.println(ph.lessThanOrEqualToZero(0));
        System.out.println(ph.reverseBool(true));
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {1, 4, 3, 5,4,4,4,4,4};
        System.out.println(ph.maxLength(array, array2));

    }
}
