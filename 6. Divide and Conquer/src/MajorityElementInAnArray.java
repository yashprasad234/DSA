public class MajorityElementInAnArray {
    public static void main(String[] args) {
        int[] arr = {5,2,3,2,4,2};
        System.out.println(majorityElement(arr, 0, arr.length-1));
    }

//    Brute force O(n2) time
//    static int majorityElment(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int count = 0;
//            for (int j = 0; j < arr.length; j++) {
//                if(arr[j] == arr[i])
//                    count++;
//            }
//            if(count > arr.length/2)
//                return arr[i];
//        }
//        return -1;
//    }

//    Improved solution O(nlogn) the sorting function takes O(nlogn) time and the traversal takes O(n) overall time is O(nlogn)

//    static int majorityElment(int[] arr) {
//        Arrays.sort(arr);
//        int count = 1;
//        for (int i = 0; i < arr.length-1; i++) {
//            if(arr[i+1] == arr[i]) {
//                count++;
//                if(count > arr.length/2)
//                    return arr[i];
//            }
//            else
//                count = 1;
//        }
//        return -1;
//    }

//    Improved further - Moore's algorithm

//    static int checkMajority(int[] arr) {
//        int maj = findMajorityElement(arr);
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] == arr[maj])
//                count++;
//        }
//        if(count > arr.length/2)
//            return arr[maj];
//        return -1;
//    }
//
//    static int findMajorityElement(int[] arr) {
//        int res = 0, count = 1;
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] == arr[res])
//                count++;
//            else {
//                count--;
//            }
//            if(count == 0) {
//                res = i;
//                count = 1;
//            }
//        }
//        return res;
//    }


//    recursive solution

    static int countInRange(int[] arr, int num, int st, int end) {
        int count = 0;
        for (int i = st; i <= end; i++) {
            if(arr[i] == num)
                count++;
        }
        return count;
    }

    static int majorityElement(int[] arr, int st, int end) {
        if(st == end) {
            return arr[st];
        }
        int mid = st + (end - st) / 2;
        int left = majorityElement(arr, st, mid);
        int right = majorityElement(arr, mid+1, end);
        if(left == right)
            return right;

        int leftCount = countInRange(arr, left, st, end);
        int rightCount = countInRange(arr, right, st, end);

        return leftCount < rightCount ? right : left;
    }
}
