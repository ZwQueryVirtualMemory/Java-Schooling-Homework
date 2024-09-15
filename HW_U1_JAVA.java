public class HW_U1_JAVA {
    public static void main(String[] args) {
        //Print a string then a Integer.
        System.out.printf("39 + 3\n");
        System.out.printf("39 + 3 = %d\n", 39 + 3);
        System.out.println();

        //print out 'Hello' to one line then 'World' to the next
        System.out.printf("Hello");
        System.out.printf("World\n");
        System.out.println();

        //How do you discover Syntax errors? how about logic errors?
        //Syntax errors are created by going against the languages rules, you follow the java language just like
        //if you were to follow english, you wouldnt say: "hello are how you", you would say "Hello how are you".
        //---
        //Logic errors are found by debugging your code, this means something you made doesnt work the way you
        //want it to.

        //Write a program that prints the U.S. Flag using '=' & '*'
        System.out.printf("| ********** | ===========\n");
        System.out.printf("| ********** | ===========\n");
        System.out.printf("| ********** | ===========\n");
        System.out.printf("| ********** | ===========\n");
        System.out.printf("| ********** | ===========\n");
        System.out.printf("==========================\n");
        System.out.printf("==========================\n");
        System.out.printf("==========================\n");
        System.out.printf("==========================\n");
        System.out.printf("==========================\n");
        System.out.printf("==========================\n");
        System.out.printf("==========================\n");
        System.out.printf("==========================\n");
        System.out.println();

        //create variables for a article(name, description, price)
        double articlePrice = 4.99;
        String articleName = "codingIsland";
        String articleDescription = "This article's name is made with camelCase!";
        System.out.printf("Price is only %.2f!\n%s\n%s\n", articlePrice, articleName, articleDescription);

        System.out.println();

        //what is the value?
        int mystery = 1;
        mystery = 1 - 2 * mystery;
        mystery = mystery + 1;
        System.out.printf("Expected Value: 0\nValue -> %d\n", mystery);

        //what is wrong?
        /*
         * int mystery = 1;
         * mystery = 1 + 2;
         * int mystery = 3 + 4;
         * ANSWER: you cant re-store a variable, you need to create a new name.
         */
         System.out.println();

         //Find the stored value.
         int storedVal = 9;
         storedVal++;//Increments the value in "storedVal" by 1
         storedVal = storedVal / 2;//Divided what is now 10, by 2.
         System.out.printf("Expected Value -> 5\nValue -> %d\n", storedVal);

    }
}
