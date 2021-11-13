package homework.newHomework;

public class PracticeHomework {
    long convert(int minutes) {
        return 60 * minutes;
    }

    int calcAge(int years) {
        return 365 * years;
    }

    int nextNumber(int number) {
        return ++number;
    }

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else return false;
    }
    boolean lessThanOrEqualToZero(int number) {
        if (number<=0){
            return true;
        }else
        return  false;
    }
    boolean reverseBool(boolean value) {
        return !value;
    }
    int maxLength(int[] array1, int[] array2) {
        if (array1.length>array2.length)
        return array1.length;
        else return array2.length;
    }

}
