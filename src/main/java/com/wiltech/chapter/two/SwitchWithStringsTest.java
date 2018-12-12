package com.wiltech.chapter.two;

import static java.util.Calendar.SUNDAY;

public class SwitchWithStringsTest {

    public static void main(String[] args) {

    }

    public static int getSortedOrder(String firstName, String lastName){
        String middlName = "Patricia";
        final String suffix = "JR";
        int id = 0;

        switch (lastName){
            case "Test":
                return 52;
//        case middlName: //does not compile be3cause middleName is not final
//            id = 5;
//            break;
        case suffix:
            id = 0;
            break;
//        case lastName: //does not compile as it is not a constant
//            id = 8;
//            break;
//        case 5: //doe snot compile because it is an int
//            id = 110
//            ;break;
       /* case 'J': //does not coimpile because it is a char
            id = 1;
            break;*/
//        case SUNDAY: //does not compile because it is an enum
//        id = 9;
//            break;

        }
    return id;
    }
}
