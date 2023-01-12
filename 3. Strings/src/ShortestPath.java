public class ShortestPath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("The shortest path to reach the destination is : " + displacement(str));
    }

    //Time Complexity : O(str.length())
    //Space Complexity : O(1)

    static int displacement(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'N')
                y++;
            else if(str.charAt(i) == 'S')
                y--;
            else if(str.charAt(i) == 'E')
                x++;
            else
                x--;
        }
        return (int) Math.sqrt((x*x)+(y*y));
    }
}
