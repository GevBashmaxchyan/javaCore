package homework;

public class PracticeHomework {
    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    long convert(int minutes) {
        int rope = 60;
        return rope * minutes;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը։
    int calcAge(int years) {
        int tari = 365;
//
        return tari * years;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {
        number++;
        return number;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
    boolean isSameNum(int a, int b) {
        boolean caunt = false;
        if (a == b) {
            caunt = true;

        }

        return caunt;
    }

    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
    //մնացած դեպքերում վերադարձնել false
    boolean lessThanOrEqualToZero(int number) {
        boolean caunt = false;
        if (number <= 0)
            caunt = true;
        return caunt;
    }

    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
    boolean reverseBool(boolean value) {

        if (value == true) {
            value = false;
        } else if (value == false) {
            value = true;
        }


        return value;
    }

    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    int maxLength(int[] array1, int[] array2) {
        int caunt0;
        if (array1.length > array2.length) {
            caunt0 = array1.length;
        } else {
            caunt0 = array2.length;
        }
        return caunt0;

    }

}
