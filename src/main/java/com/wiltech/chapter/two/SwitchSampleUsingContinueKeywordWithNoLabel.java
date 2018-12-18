package com.wiltech.chapter.two;

/**
 * The break statement transfers control to the enclosing statement, the continue statement transfers control to the boolean expression that determines if the loop should continue.
 */
public class SwitchSampleUsingContinueKeywordWithNoLabel {

    public static void main(String[] args) {

        //this prints 1a 1c 3a 3c 4a 4c
        controlFlowUsingContinueWithoutLabel();
    }

    /**
     * continue keyword transfer the flow to the boolean expression of the label.
     */
    private static void controlFlowUsingContinueWithoutLabel() {
        for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                //if 2 or b then skip but carry on
                if (a == 2 || x == 'b') {
                    continue;
                }
                System.out.print(" " + a + x);// prints 1a 1c 3a 3c 4a 4c
            }
        }
    }

}
