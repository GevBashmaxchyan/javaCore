package homework.dynamicArray;

import lesson9.Stack;

public class DynamicArray {
    // sa mer himnakan masivn e vortex pahelu enq avelacvox elementnery
    private int[] array = new int[10];
    //sa mer masivi mej avelacvac elementneri qanakn e
    private int size = 0;


    // stugel ete masivi mej tex chka ->kanchel extend()
    //ev avelacnenq
    public void add(int value) {
        if (size == array.length - 1) {
            extend();
            array[size++]=value;

        } else {

            array[size++] = value;
        }


    }
    //1. stexcel hin masivic 10 element aveli mec masiv
    //2. qcel hin masivi elementnery nori mej
    //3. hin masivi hxumy kapel nor masivi hxman het

    private void extend() {

        int[] array1 = new int[array.length + 10];
        int c = 0;


        for (int i = 0; i < array.length; i++) {
            array1[c++] = array[i];

        }
        array = array1;


    }

    // ete trvac indexsy mer unecac masivi indexsi sahmannerum e veradarcnel
    // masivi indexerord elementy: hakarak depqum veradarcnel -1:`
    public int getByIndex(int index) {
        if (index < array.length) {
            return array[index];
        } else {
            index = -1;
            System.out.println("sahmanic durs e");
        }
        return array[index];

    }


    //tvpel masivi avelacvac elementnery
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }


    }

}
