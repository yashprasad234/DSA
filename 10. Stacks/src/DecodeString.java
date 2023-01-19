import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String str = "3[cv]";
        System.out.println(decode(str));
    }

//    static String decode(String str) {
//        //To store the integer part of the string
//        Stack<Integer> integerStack = new Stack<>();
//
//        //To store the characters part of the string
//        Stack<Character> stringStack = new Stack<>();
//
//        //temp will store the strings between the brackets and result will be the final string after decoding
//        String temp = "", result = "";
//
//        //iterating over the string
//        for (int i = 0; i < str.length(); i++) {
//            //this will help in converting the digit from character to integer
//            int count = 0;
//
//            //when we encounter a number in the string
//            if(Character.isDigit(str.charAt(i))) {
//                while (Character.isDigit(str.charAt(i))) {
//                    //converting digit character into integer
//                    count = count * 10 + str.charAt(i) - '0';
//                    i++;
//                }
//                i--;
//                //adding the number in the integer stack
//                integerStack.push(count);
//            }
//
//            //when we encounter the ']' i.e, closing bracket in the string
//            else if(str.charAt(i) == ']') {
//                temp = "";
//                count = 0;
//
//                if(!integerStack.isEmpty()) {
//                    //storing peek in count to find how many times to run the loop
//                    count = integerStack.pop();
//                }
//
//                while (!stringStack.isEmpty() && stringStack.peek() != '[') {
//                    //storing the string between the brackets into temp and deleting the string from the stack
//                    temp = stringStack.pop() + temp;
//                }
//
//                if(!stringStack.isEmpty() && stringStack.peek() == '[') {
//                    //removing the open bracket i.e, '['
//                    stringStack.pop();
//                }
//
//                for (int j = 0; j < count; j++) {
//                    //making result into decoded string for that bracket by adding it to itself count times
//                    result = result + temp;
//                }
//
//                for (int j = 0; j < result.length(); j++) {
//                    //storing updated result in the stack;
//                    stringStack.push(result.charAt(j));
//                }
//                //reinitialising result for next part to be decoded
//                result = "";
//            }
//
//            //If open bracket is encountered in string
//            else if(str.charAt(i) == '[') {
//                //ensuring if there is no digit before the opening bracket it means the string inside the bracket only needs to
//                //once in the final string
//                if(Character.isDigit(str.charAt(i-1)))
//                    stringStack.push(str.charAt(i));
//                else {
//                    stringStack.push(str.charAt(i));
//                    integerStack.push(1);
//                }
//            }
//            //adding the string inside the bracket in the character stack
//            else {
//                stringStack.push(str.charAt(i));
//            }
//        }
//
//        //after the above loop is done running we will have the final string stored in the string stack
//
//        //storing string into result from string stack in reverse order;;
//        while (!stringStack.isEmpty()) {
//            result = stringStack.pop() + result;
//        }
//        return result;
//    }

    static String decode(String str) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<Character> characterStack = new Stack<>();
        String temp = "", res = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            //encountering number
            if(Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
                i--;
                integerStack.push(count);
            }

            //encountering ']'
            else if(str.charAt(i) == ']') {
                temp = "";
                count = 0;
                if(!integerStack.isEmpty())
                    count = integerStack.pop();
                while (!characterStack.isEmpty() && characterStack.peek() != '[') {
                    temp = characterStack.pop() + temp;
                }
                if(!characterStack.isEmpty() && characterStack.peek() == '[')
                    characterStack.pop();
                for (int j = 0; j < count; j++) {
                    res = res + temp;
                }
                for (int j = 0; j < res.length(); j++) {
                    characterStack.push(res.charAt(j));
                }
                res = "";
            }

            //encountering '['
            else if(str.charAt(i) == '[') {
                if(Character.isDigit(str.charAt(i-1)))
                    characterStack.push(str.charAt(i));
                else {
                    characterStack.push(str.charAt(i));
                    integerStack.push(1);
                }
            }

            //encountering characters
            else {
                characterStack.push(str.charAt(i));
            }
        }
        while (!characterStack.isEmpty()) {
            res = characterStack.pop() + res;
        }
        return res;
    }
}
