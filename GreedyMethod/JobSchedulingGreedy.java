package GreedyMethod;
import java.util.Arrays;
import java.util.Comparator;

public class JobSchedulingGreedy {
    static class Job {
        int deadline;
        int profit;

        public Job(int deadline, int profit) {
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static int jobScheduling(Job[] jobs) {
        // Sort jobs based on profit in descending order
        Arrays.sort(jobs, Comparator.comparingInt((Job j) -> j.profit).reversed());

        // Find the maximum deadline among all jobs
        int maxDeadline = Integer.MIN_VALUE;
        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        // Initialize an array to track the scheduled jobs
        boolean[] slots = new boolean[maxDeadline];

        // Iterate through each job
        int maxProfit = 0;
        for (Job job : jobs) {
            // Find a slot for the current job before its deadline
            for (int i = job.deadline - 1; i >= 0; i--) {
                if (!slots[i]) {
                    // Schedule the job and update the maximum profit
                    slots[i] = true;
                    maxProfit += job.profit;
                    break;
                }
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        Job[] jobs = {new Job(2, 60), new Job(1, 100), new Job(2, 40), new Job(1, 20)};
        int maxProfit = jobScheduling(jobs);
        System.out.println("Maximum profit: " + maxProfit);
    }
}

