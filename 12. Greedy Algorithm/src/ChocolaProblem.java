import java.util.*;

public class ChocolaProblem {
    public static void main(String[] args) {
        //n = no. of rows, m = no. of cols
        int n = 4, m = 6;
        Integer[] costVer = {2,1,3,1,4}; //m-1
        Integer[] costHor = {4,1,2}; //n-1

        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        //h to traverse costHor and v to traverse costVer; hp & vp are horizontal pieces and vertical pieces respectively
        int h = 0, v = 0, hp = 1, vp = 1;

        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            //vertical cost <= horizontal cost then horizontal cut
            if(costVer[v] <= costHor[h]) {
                cost += (vp * costHor[h]);
                h++;
                hp++;
            }
            //horizontal cost < vertical cost
            else {
                cost += (hp * costVer[v]);
                v++;
                vp++;
            }
        }
        while (h < costHor.length) {
            cost += (vp * costHor[h]);
            h++;
            hp++;
        }
        while (v < costVer.length) {
            cost += (hp * costVer[v]);
            v++;
            vp++;
        }
        System.out.println("Min cost of cutting the chocolate of size " + m + "x" + n + " into single squares is : " + cost);
    }
}
