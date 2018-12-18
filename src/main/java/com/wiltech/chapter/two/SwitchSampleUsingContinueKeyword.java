package com.wiltech.chapter.two;

/**
 * The break statement transfers control to the enclosing statement, the continue statement transfers control to the boolean expression that determines if the loop should continue.
 */
public class SwitchSampleUsingContinueKeyword {

    public static void main(String[] args) {

        //this prints 1a 3a 4a
        controlFlowUsingContinue();

        System.out.println();

        //this prints 1a
        controlFlowUsingBrake();
    }

    /**
     * continue keyword transfer the flow to the boolean expression of the label.
     */
    private static void controlFlowUsingContinue() {
        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                //if 2 or b then skip to the outer parent loop skipping everything else
                if (a == 2 || x == 'b') {
                    continue FIRST_CHAR_LOOP;
                }
                System.out.print(" " + a + x);// prints 1a 3a 4a
            }
        }
    }

    /**
     * break keyword transfer the flow to the closing bracket of the label.
     */
    private static void controlFlowUsingBrake() {
        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                //if 2 or b then stop
                if (a == 2 || x == 'b') {
                    break FIRST_CHAR_LOOP;
                }
                System.out.print(" " + a + x);//prints 1a
            }
        }
    }

}
