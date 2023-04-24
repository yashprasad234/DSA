//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

package strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(pad("", "23"));
    }

    // This function is for a numpad that has alphabets mapped to it from 1-9 and each alphabet has 3 letters mapped to it
    // except for 9 which has only 2 letters mapped to it

//    static void pad(String p, String up) {
//        if(up.length() == 0) {
//            System.out.println(p);
//            return;
//        }
//        int digit = up.charAt(0) - '0';
//        for (int i = (digit - 1)*3; i < digit*3; i++) {
//            char ch = (char) ('a' + i);
//            pad(p + ch, up.substring(1));
//        }
//    }

    static ArrayList<String> pad(String p, String up) {
        if(up.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            if(p.length() != 0){
                list.add(p);
            }
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        if(digit >= 2 && digit <= 6) {
            for (int i = (digit-2)*3; i < (digit-1)*3; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(pad(p + ch, up.substring(1)));
            }
        }
        if(digit == 7) {
            for (int i = 15; i <= 18; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(pad(p + ch, up.substring(1)));
            }
        }
        if(digit == 8) {
            for (int i = 19; i <= 21; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(pad(p + ch, up.substring(1)));
            }
        } if(digit == 9) {
            for (int i = 22; i <= 25; i++) {
                char ch = (char) ('a' + i);
                ans.addAll(pad(p + ch, up.substring(1)));
            }
        }
        return ans;
    }
}
