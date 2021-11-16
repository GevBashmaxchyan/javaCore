package homework.bracechecker;

public class BraceChecker {
    // sa henc textn e
    private String text;

    //klasi kanstruktoren e vory piti ynduni string tipi text ev veragri verevi textin
    // vor chkaroxananq BreaeChecker -i obekt sarqenq aranc text talu kanstruktori mijocov
    public BraceChecker(String text) {
        this.text = text;

    }

    // sa himnakan metodn e vori mej grelu enq amboxch logikan,ashxatelu enq te stecki e te verevi texti het;
    public void check() {
        Stack stack = new Stack();
        boolean isValid = true;
        for (int i = 0; i < text.length(); i++) {
            int pop;
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error : Closed " + c + "but nothing opend at " + i);
                    } else if (pop != '(') {
                        isValid = false;
                        System.err.println("Error : Closed " + c + " but opend " + (char) pop + "at " + i);
                    }
                    break;
                case '}':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error : Closed " + c + "but nothing opend at " + i);
                    } else if (pop != '{') {
                        isValid = false;
                        System.err.println("Error : Closed " + c + " but opend " + (char) pop + "at " + i);
                    }
                    break;
                case ']':
                    pop = stack.pop();
                    if (pop == 0) {
                        isValid = false;
                        System.err.println("Error : Closed " + c + "but nothing opend at " + i);
                    } else if (pop != '[') {
                        isValid = false;
                        System.err.println("Error : Closed " + c + " but opend " + (char) pop + "at " + i);
                    }
                    break;

            }


        }
        while (!stack.isEmpty()) {
            isValid = false;
            System.err.println("Error: opened " + (char) stack.pop() +
                    "but nothing closed ");
        }


        if (isValid) {
            System.out.println(" Everything is good");
        }


    }
}
