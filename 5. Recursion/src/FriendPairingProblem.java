//Review question
//https://www.geeksforgeeks.org/friends-pairing-problem/

public class FriendPairingProblem {
    public static void main(String[] args) {
        System.out.println(friendPairingProblem(3));
    }

    static int friendPairingProblem (int n) {
        if(n == 1 || n == 2)
            return n;
        return friendPairingProblem(n-1) + (n-1)*friendPairingProblem(n-2);
    }
}
