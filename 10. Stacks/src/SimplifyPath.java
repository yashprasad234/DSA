import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String str = new String("/a/./b/../../c/Users/USER/Desktop/../Program Files");
        System.out.println(simplify(str));
    }

//    static String simplify(String str) {
//        //This stack is used to store the folder name in each repository and whenever ".." is used to go to the parent
//        //directory we delete the top folder from the directory
//        Stack<String> s = new Stack<>();
//        String res = "";
//        res += "/";
//
//        for(int i = 0; i < str.length(); i++) {
//            String dir = "";
//            while (i < str.length() && str.charAt(i) == '/') {
//                i++;
//            }
//            while(i < str.length() && str.charAt(i) != '/') {
//                dir += str.charAt(i);
//                i++;
//            }
//            if(dir.equals("..")) {
//                if(!s.empty())
//                    s.pop();
//            }
//            else if(dir.equals(".")) {
//                continue;
//            }
//            else if(dir.length() != 0)
//                s.push(dir);
//        }
//
//        //This stack is used to store the folder names in reverse order and then add them to the final string to print it;
//        Stack<String> s1 = new Stack<>();
//        while (!s.empty()) {
//            s1.push(s.pop());
//        }
//        while (!s1.empty()) {
//            if(s1.size() != 1)
//                res += (s1.pop() + "/");
//            else
//                res += s1.pop();
//        }
//        return res;
//    }

    static String simplify(String str) {
        Stack<String> s = new Stack<>();
        String res = "/";
        for (int i = 0; i < str.length(); i++) {
            String dir = "";
            //ignore all the '/' leading to a folder name in a directory
            while (i < str.length() && str.charAt(i) == '/') {
                i++;
            }
            //add the folder name to the string "dir";
            while (i < str.length() && str.charAt(i) != '/') {
                dir += str.charAt(i);
                i++;
            }
            //if dir == ".." go back a directory so remove top directory from stack
            if(dir.equals("..")) {
                if(!s.isEmpty())
                    s.pop();
            }
            //if dir == "." continue this means current directory
            else if(dir.equals(".")) {
                continue;
            }
            //add the dir name in the stack
            else if(dir.length() != 0) {
                s.push(dir);
            }
        }
        Stack<String> s1 = new Stack<>();
        //add the items in stack "s" to stack "s1" in reverse order
        while (!s.isEmpty()) {
            s1.push(s.pop());
        }
        //add all the folder names into res and making a simplified path
        while (!s1.isEmpty()) {
            if(s1.size() == 1)
                res += s1.pop();
            else
                res += s1.pop()+ "/";
        }
        return res;
    }

}
