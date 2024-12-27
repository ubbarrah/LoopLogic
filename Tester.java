import java.math.BigInteger;

public class Tester extends Object{

//test


    public static void main(String args[]){
        
        /*tests
            //Main Cases
            #1 
            System.out.println(HW2.isAlphabeticalOrder("ac!ffG1h"));
            //Expected and Actual Value: true

            System.out.println(HW2.isAlphabeticalOrder("ac!nfG1h"));
            //Expected and Actual Value: false

            System.out.println(HW2.isAlphabeticalOrder("hiya"));
            //Expected and Actual Value: false

            System.out.println(HW2.isAlphabeticalOrder("hey"));
            //Expected and Actual Value: false

            System.out.println(HW2.isAlphabeticalOrder("adgyz"));
            //Expected and Actual Value: true

            //Edge Cases
            These are edge cases because of the presence of no characters, the presence of non-letter characters, and the presence
            of differences in case (upper/lower case to make sure that this program works correctly regardless of case)
            
            System.out.println(HW2.isAlphabeticalOrder(""));
            //Expected and Actual Value: true

            System.out.println(HW2.isAlphabeticalOrder("!!!"));
            //Expected and Actual Value: true

            System.out.println(HW2.isAlphabeticalOrder("!n!"));
            //Expected and Actual Value: true

            System.out.println(HW2.isAlphabeticalOrder("!n1!"));
            //Expected and Actual Value: true

            System.out.println(HW2.isAlphabeticalOrder("iIg"));
            //Expected and Actual Value: false

            System.out.println(HW2.isAlphabeticalOrder("Rg"))
            //Expected and Actual Value: false

            System.out.println(HW2.isAlphabeticalOrder("gRzz"))
            //Expected and Actual Value: true




            #2
            1. System.out.println(HW2.removeNchars("gRzz", 1, 'z'))
            //Expected and Actual Value: gRz

            2. System.out.println(HW2.removeNchars("gRzz", 2, 'z'))
            //Expected and Actual Value: gR

            3. System.out.println(HW2.removeNchars("gRzz", 0, 'z'))
            //Expected and Actual Value: gRzz

            4. System.out.println(HW2.removeNchars("gRzz", 1, 'R'))
            //Expected and Actual Value: gzz

            5. System.out.println(HW2.removeNchars("heyyah", 100, 'y'))
            //Expected and Actual Value: heah

            6. System.out.println(HW2.removeNchars("!!!???", 2, '?'))
            //Expected and Actual Value: !!!?

            6. System.out.println(HW2.removeNchars("!!!???", 2, '!'))
            //Expected and Actual Value: !???

            Test no presence of the character
            7. System.out.println(HW2.removeNchars("???", 2, '!'));
            //Expected and Actual Value: ???

            Test all occurences of the character
            8. System.out.println(HW2.removeNchars("???", 3, '?'));
            //          --> EMPTY STRING

            More occurrences than appearances of removed letter
            9. System.out.println(HW2.removeNchars("???", 4, '?'));
            //          --> EMPTY STRING

            //#3
            System.out.println(HW2.removeString("ellelle", "elle"));
            //"lle"

            HW2.removeString("elellele", "elle")

            //"elle"
            Test the presence of the word on the middle
            System.out.println(HW2.removeString("sellelle", "elle"));
            //slle

            Test none
            System.out.println(HW2.removeString("elellele", "les"));
            //elellele

            System.out.println(HW2.removeString("ellellelle", "elle"));
            //ll

            Test no remove parameter
            System.out.println(HW2.removeString("hahaha", ""));
            //          --> REMOVE STRING
"ll"

            Test only one character long remove parameter
            System.out.println(HW2.removeString("hahaha", "a"));
            //hhh


            //#4
            1. many X's 
        System.out.println(HW2.moveAllXsRight('X', "abcXdeXXXfghXiXXjXX"));
            EXPECTED AND ACTUAL OUTPUT: abcdXefXXXghiXjXXXX

            2. One xs
        System.out.println(HW2.moveAllXsRight('X', "abcXdeffffghfi11j22"));
            abcdXefffghfi11j22

            3. No xs
            System.out.println(HW2.moveAllXsRight('X', "abcdef"));
            abcdef

            4. last is x
        System.out.println(HW2.moveAllXsRight('X', "abcXefX"));
            abceXfX

            5. all xs except for one (this case uses a different character)
            System.out.println(HW2.moveAllXsRight('S', "SSSSSSfS"));
            fSSSSSSS

            6. System.out.println(HW2.moveAllXsRight('S', "SfSfSfSfS"));
            fSSSSSSS

            7. System.out.println(HW2.moveAllXsRight('S', "SfSfSfSfS"));;
            fSfSfSS


            //#5 Test Cases Default Case
            1. char[][] board = {{'a','b','c','X'},{'d','X','e','f','X'},{'X','X','i'},{'X','j','k','l'}};
        HW2 h = new HW2();
        HW2.moveAllXsDown('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }

        a b c f 

        d j e X X 

        X X i 

        X X k l 

            2. char[][] board = {{'a','b','c','X'},{'d','X','e','f','X'},{'X','X','i'},{'X','X','X','X'}};
        HW2 h = new HW2();
        HW2.moveAllXsDown('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }

        a b c f 

        d X e X X 

        X X i 

        X X X X 

        3. Move all Xs down
        char[][] board = {{'X','X','X','X'},{'d','f','e','f','f'},{'f','f','i'},{'f','f','f','f'}};
        HW2 h = new HW2();
        HW2.moveAllXsDown('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }

        d f e f 

        X X X X f 

        f f i 

        f f f f 

        4. Test one, move one X down
        char[][] board = {{'X','f','f','f'},{'d','f','e','f','f'},{'f','f','i'},{'f','f','f','f'}};
        HW2 h = new HW2();
        HW2.moveAllXsDown('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }
        
        d f f f 

        X f e f f 

        f f i 

        f f f f


        5. Test none
        char[][] board = {{'f','f','f','f'},{'d','f','e','f','f'},{'f','f','i','X'},{'f','f'}};
        HW2 h = new HW2();
        HW2.moveAllXsDown('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }

        f f f f 

        d f e f f 

        f f i 

        f f f f

        6. The X can't move down
        char[][] board = {{'f','f','f','f'},{'d','f','e','f','f'},{'f','f','i', 'X'},{'f','f'}};
        HW2 h = new HW2();
        HW2.moveAllXsDown('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }
        
        f f f f 

        d f e f f 

        f f i X 

        f f

            //#6 
            1. Test Cases Default Case
            char[][] board = {{'a','b','c','X'},{'d'},{'e','f','g','h'},{'i','j','k'},{'l','m','n','o'}};
        HW2 h = new HW2();
        HW2.moveXDownLeft('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        } EXPECTED AND ACTUAL VALUE
         a b c f 

        d 

        e i g h 

        X j k 

        l m n o 

        2. 
        This is an edge case because none of the rows you are traversing over have 
        a slot to place X in while you go through it.
        char[][] board = {{'a','b','c','X'},{'d'},{'d'},{'i'},{'l','m','n','o'}};
        HW2 h = new HW2();
        HW2.moveXDownLeft('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }
        EXPECTED AND ACTUAL:
        a b c f 

        d 

        d 

        X j k 

        l m n o

        3. 
        HAS SLOTS TO iterate over
        char[][] board = {{'a','b','c','X'},{'d', 'f', 'f', 'f'},{'d', 'f', 'f', 'f'},{'i', 'f', 'f', 'f'},{'l','m','n','o'}};
        HW2 h = new HW2();
        HW2.moveXDownLeft('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }
        EXPECTED AND ACTUAL:
        a b c f 

        d f f f 

        d i f f 

        X f f f 

        l m n o 

        4. 
        Try it with X in other spots
        char[][] board = {{'a','b','X','d'},{'d', 'f', 'f', 'f'},{'d', 'f', 'f', 'f'},{'i', 'f', 'f', 'f'},{'l','m','n','o'}};
        HW2 h = new HW2();
        HW2.moveXDownLeft('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }
        EXPECTED AND ACTUAL:
        a b f d 

        d d f f 

        X f f f 

        i f f f 

        l m n o 
        
        5.
        X not taken all the way to the left
        char[][] board = {{'a','b','f','d'},{'d', 'f', 'f', 'f'},{'d', 'f', 'f', 'f'},{'i', 'f', 'X', 'f'},{'l','m','n','o'}};
        HW2 h = new HW2();
        HW2.moveXDownLeft('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }

        a b f d 

        d f f f 

        d f f f 

        i f m f 

        l X n o 

        6.
        X can't move anywhere
        char[][] board = {{'a','b','f','d'},{'d', 'f', 'f', 'f'},{'d', 'f', 'f', 'f'},{'i', 'f', 'X', 'f'},{'l'}};
        HW2 h = new HW2();
        HW2.moveXDownLeft('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }
        a b f d 

        d f f f 

        d f f f 

        i f X f 

        l

        7. Test no Xs
        char[][] board = {{'a','b','f','d'},{'d', 'f', 'f', 'f'},{'d', 'f', 'f', 'f'},{'i', 'f', 'f', 'f'},{'l'}};
        HW2 h = new HW2();
        HW2.moveXDownLeft('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }

        a b f d 

        d f f f 

        d f f f 

        i f f f 

        l 

        8. Test many instances of X, only move the first instance.
        char[][] board = {{'a','b','f','d'},{'d', 'X', 'X', 'f'},{'d', 'f', 'f', 'f'},{'i', 'f', 'f', 'f'},{'l'}};
        HW2 h = new HW2();
        HW2.moveXDownLeft('X', board);
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println("\n");
        }

        a b f d 

        d d X f 

        X f f f 

        i f f f 

        l

        */
        BigInteger b = new BigInteger("yay");
        try {
            System.out.println(b.nextProbablePrime());
        } catch (ArithmeticException t){

            System.out.println("2");
    
        } catch (Exception e){
            System.out.println("invalid");
        }
            //          --> REMOVE STRING
    }
    
}