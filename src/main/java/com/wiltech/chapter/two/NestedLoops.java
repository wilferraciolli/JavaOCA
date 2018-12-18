package com.wiltech.chapter.two;

public class NestedLoops {

    public static void main(String[] args) {

        printNestedLoops();
    }

    /**
     * create and print a 2d array, block by block
     */
    public static void printNestedLoops(){
        //2d array with three arrays in it
        int[][] myComplexArray = {{1,2,3},{4,5,6},{7,8,9}};

        for (int[] mySimpleArray : myComplexArray){
            for (int i =0; i<mySimpleArray.length; i++){
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * This method will print 3  0
     * The first time this loop executes, the inner loop repeats until the value of x is 4. The value will then be decremented to 3 and that will be the output at the end of the first iteration of the outer loop. On the second iteration of the outer loop, the inner do-while will be executed once, even though x is already not greater than 5. As you may recall, do-while statements always execute the body at least once. This will reduce the value to 1, which will be further lowered by the decrement operator in the outer loop to 0. Once the value reaches 0, the outer loop will terminate. The result is that the code will output the following:
     *
     */
    public static void testDoWhileLoops(){
        int x =20;
        while (x >0){
            do{
                x-=2;
            }while (x>5);
            x--;
            System.out.println(x + "\t");
        }
    }
}
