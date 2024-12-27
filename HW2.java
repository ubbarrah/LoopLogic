
public class HW2 {
    //Returns a boolean value stating whether the lettered characters in the testString are in alphabetical order.
    public static boolean isAlphabeticalOrder(String testString){

        StringBuilder testStringBuilder = new StringBuilder(testString);
        int count = 0;
        for (int i=0; i< testString.length(); i++){
            
            if (Character.isLetter(Character.toLowerCase(testStringBuilder.charAt(i))) && count > Character.toLowerCase((int)testStringBuilder.charAt(i))){
                return false;
            }
            count = (int)Character.toLowerCase(testStringBuilder.charAt(i));
        }
        return true;
    
    }

    //Returns a String value that is the testString with a desired amount of a certain character removed.
    public static String removeNchars(String testString, int occurrences, char removedChar){
        StringBuilder testStringBuilder = new StringBuilder(testString);
        StringBuilder newStringBuilder = new StringBuilder();
        int count = occurrences;
        for (int i = 0; i < testString.length(); i++){
            if (count != 0){
                if (testStringBuilder.charAt(i) == removedChar){
                    count --;
                } else {
                    newStringBuilder.append(testStringBuilder.charAt(i));
                }
            } else {
                newStringBuilder.append(testStringBuilder.charAt(i));
            }
        }
        return newStringBuilder.toString();
    }

    //Returns a String value that is the testString with every occurence of the smaller "removeString" removed.
    public static String removeString(String testString, String removeString){
        if (removeString.length() > 0){
            
        }
        StringBuilder newStringBuilder = new StringBuilder();

        int count = 0;
        boolean sameWordFound = false;
        for (int i=0; i < testString.length()-(removeString.length()-1); i++){
            for (int j=i; j < removeString.length()+i; j++){
                if (testString.charAt(j) == removeString.charAt(j-i) && !sameWordFound){
                    count ++;
                }
            }
            
            if (count == removeString.length()){
                sameWordFound = true;
            }
            if (!sameWordFound) {
                count = 0;
            }
            if (!sameWordFound){
                newStringBuilder.append(testString.charAt(i));
            } else {
                count-=1;
                if (count == 0){
                    sameWordFound = false;
                }
            }
        }

        for (int i=testString.length()-(removeString.length()-1); i < testString.length(); i++){
            if (!sameWordFound){
                newStringBuilder.append(testString.charAt(i));
            } else {
                count -=1;
                if (count == 0){
                    sameWordFound = false;
                }
            }
        }
        return newStringBuilder.toString();
    }

    //Returns a String in which all of the X values in the testString are moved one index right.
    public static String moveAllXsRight(char movedChar, String testString){

        StringBuilder newStringBuilder = new StringBuilder();
        StringBuilder movedCharStore = new StringBuilder();
        for (int i=0; i < testString.length(); i++){
            if (testString.charAt(i) != movedChar){
                newStringBuilder.append(testString.charAt(i));
                if (movedCharStore.length()>0){
                    newStringBuilder.append(movedCharStore);
                    movedCharStore.delete(0, movedCharStore.length());
                }
            } else {
                movedCharStore.append(movedChar);


            }
        }
        
        return newStringBuilder.append(movedCharStore).toString();
    }
       
    //Changes the input matrix such that all of a desired character are moved one index down. 
    public static void moveAllXsDown(char movedChar, char[][] matrix){
        char storedChar;
        for (int i= matrix.length-2; i > -1; i--){
            for (int j = 0; j < Math.min(matrix[i].length, matrix[i+1].length); j++){
                if (matrix[i+1][j] != movedChar && matrix[i][j] == movedChar){
                    storedChar = matrix[i+1][j];
                    matrix[i+1][j] = movedChar;
                    matrix[i][j] = storedChar;
                }
            }
        }
    }

    //Changes the input matrix such that the first occurance of a desired movedChar is moved as far down left as possible.
    public static void moveXDownLeft(char movedChar, char[][] matrix){
        boolean valueFound = false;
        int locationX = 0;
        int locationY = 0;
        char storedValue;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == movedChar && !valueFound){
                    valueFound = true;
                    locationX = j;
                    locationY = i;
                }
            }
        }
        int count = 1;
        if (valueFound){
            while ((locationX > 0 && locationY < matrix.length-1) && (locationY + count) <= matrix.length-1){
                if (matrix[locationY+count].length-1 < locationX-count){
                    count ++;
                } else {
                    storedValue = matrix[locationY+count][locationX-count];
                    matrix[locationY+count][locationX-count] = movedChar;
                    matrix[locationY][locationX] = storedValue;
                    locationY += count;
                    locationX -= count;
                    count = 1;
                }
            }

        }

    }
    public double sum (double[][][] array){

        double sum = 0;
        for (int i=0; i < array.length; i++){
        
        for (int j=0; j < array[i].length; j++){
        
        for (int k =0; k < array[i][j].length; k++){
        
        sum+= array[i][j][k];
        
        }
        
        }
        
        }
        
        return sum;
        
    }

    // for (int first = 0, last = s.length() - 1; ???; first = first + 1, last =
    //     last - 1)
    //     if (s.charAt(first) != s.charAt(last))
    //     frontMatchesEnd = false; // it can't be a palindrome
    //     }
    //     return frontMatchesEnd;
    // }

    public String shout (String s, int ex){
        StringBuilder sb=new StringBuilder (s);
        array1 = new int[100];
        for (int i=0; i < ex; i++){
            sb.append("!");
        }
        return sb.toString();
        
    }
        
}
