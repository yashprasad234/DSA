import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class JobSequencingProblem {
    public static class Job {
        int id;
        int deadline;
        int profit;

        Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int[][] jobsInfo  = {{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (a,b) -> b.profit - a.profit); //descending order sort

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0, maxProfit = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if(curr.deadline > time) {
                maxProfit += curr.profit;
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println(("Max jobs that can be done = " + seq.size()));
        System.out.println("Max profit = " + maxProfit);
        System.out.println(seq);
    }
}
