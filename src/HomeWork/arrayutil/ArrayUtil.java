package HomeWork.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("1) tpel masivi bolor elemenery .");

        for (int i = 0; i < array.length; i++) {


            System.out.println(array[i]);

        }

        System.out.println("2) mijin tvabanakan \n");


        double result = 0;
        int i;


        for (  i = 0; i < array.length; i++) {
            result += array[i];


        }
        System.out.println("michin tvabanakan arjeqy = " + result / 10);


        System.out.println("\n3) tpel zuyg elementnery");
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);


            }


        }
        System.out.println("\n 4) tpel kent elementnery");
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }

        }
        System.out.println("\n 5) tpel zuyg elementneri qanaky");

        int caunt = 0;
        for (i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                caunt++;

            }


        }
        System.out.println("\n zuyg tver= " + caunt);

        System.out.println("\n 6) tpel kent elementneri qanaky");
        int caunt2 = 0;
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                caunt2++;
            }

        }
        System.out.println("\n kent tver = " + caunt2);

        System.out.println("\n 7) tpel masivi bolor elementneri gumary");
        int result2=0;

        for (i = 0; i < array.length ; i++) {
            result2=result2+array[i];

        }
        System.out.println("\nbolor tveri gumary = " +result2);


        System.out.println("\n 8) tpel amenamec tivy");

        int max =array[0];
        for (i = 0; i < array.length ;i ++) {
            if (array[i]>max) {
                max= array[i];

            }




        }System.out.println(max);

        System.out.println("9) tpel amenapoqr tivy ");
        int min = array[0];
        for (i = 0; i < array.length ; i++) {
            if(array[i]<min){
                min=array[i];
            }

        }
        System.out.println(min);






    }


}
