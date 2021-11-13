package bracechecker;

public class BraceChecker {
    // sa henc textn e
    private String text;

    //klasi kanstruktoren e vory piti ynduni string tipi text ev veragri verevi textin
    // vor chkaroxananq BreaeChecker -i obekt sarqenq aranc text talu kanstruktori mijocov
    public BraceChecker(String text) {


    }

    // sa himnakan metodn e vori mej grelu enq amboxch logikan,ashxatelu enq te stecki e te verevi texti het;
    public void check(String text) {

        Stack stack = new Stack();


        for (int i = 0; i < text.length(); i++) {
            String name = text;
            char c = name.charAt(i);
            System.out.print(c);


            switch (c) {
                case '(':
                    stack.push('(');
//                case ')':
//                    stack.pop();
//                    break;
                case '{':
                    stack.push('{');
//                case '}':
//                    stack.pop();
//                    break;
                case '[':
                    stack.push('[');
//                case ']':
//                    stack.pop();
                    break;
            }



//            switch (c) {
//                case ')':
//                    System.out.println(stack.pop());
//
//                case '}':
//                    System.out.println(stack.pop());
//
//                case ']':
//                    System.out.println(stack.pop());
//                    break;
//            }


//            switch (c) {
//                case '(':
//                    stack.push('(');
//
//                case '{':
//                    stack.push('{');
//
//                case '[':
//                    stack.push('[');
//                    break;
//            }

//            switch (c) {
//                case ')':
//                    System.out.println(stack.pop());
//
//                case '}':
//                    System.out.println(stack.pop());
//
//                case ']':
//                    System.out.println(stack.pop());
//                    break;
//            }
//            if (c=='('&&stack.pop()==')')
//                System.out.println(true);


        }


    }


}











