package homework.bracechecker;

public class BraceCheckerTest {



    public static void main(String[] args) {

        String text = "Hello (from) Ja(va";
        BraceChecker bc = new BraceChecker(text);
        bc.check();


    }

}
