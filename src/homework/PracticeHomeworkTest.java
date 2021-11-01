package homework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();
        System.out.println("փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել: "+ph.convert(4));
        System.out.println("ընդունել տարին, վերադարձնել օրերի քանակը։ "+ ph.calcAge(3));
        System.out.println("վերադարձնել տրված թվի հաջորդ թիվը " + ph.nextNumber(5));
        System.out.println("վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false: " + ph.isSameNum(5, 5));
        System.out.println("վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին մնացած դեպքերում  false: "+ph.lessThanOrEqualToZero(2));
        System.out.println("վերադարձնել ընդունող բուլյանի ժխտված արժեքը։ "+ph.reverseBool(true));
        int[]array1={1,2,3,4,5,6,7,5,4,6};
        int[]array2={1,2,3,4,5,6,7,8,2};
        System.out.println("ամենամեծ length-ը "+ph.maxLength(array1,array2));

    }
}
