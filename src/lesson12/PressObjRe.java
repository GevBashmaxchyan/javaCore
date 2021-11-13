package lesson12;

public class PressObjRe {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a и оЬ.Ь до вызова: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a и оЬ.Ь после вызова: " + ob.a + " " + ob.b);


    }

}
