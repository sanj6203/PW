package Arrays;

public class FCFS {
    public static void calculateWaitingTurnaroundTime(int[][] processes) {
        int n = processes.length;

        // Initialize waiting time and turnaround time arrays
        int[] waitingTime = new int[n];
        int[] turnaroundTime = new int[n];

        // Calculate waiting time for each process
        waitingTime[0] = 0;
        for (int i = 1; i < n; i++) {
            waitingTime[i] = waitingTime[i - 1] + processes[i - 1][1];
        }

        // Calculate turnaround time for each process
        for (int i = 0; i < n; i++) {
            turnaroundTime[i] = waitingTime[i] + processes[i][1];
        }

        // Calculate total waiting time and total turnaround time
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        for (int i = 0; i < n; i++) {
            totalWaitingTime += waitingTime[i];
            totalTurnaroundTime += turnaroundTime[i];
        }

        // Calculate average waiting time and average turnaround time
        double averageWaitingTime = (double) totalWaitingTime / n;
        double averageTurnaroundTime = (double) totalTurnaroundTime / n;

        // Print the results
        System.out.println("Total Waiting Time: " + totalWaitingTime);
        System.out.println("Average Waiting Time: " + averageWaitingTime);
        System.out.println("Total Turnaround Time: " + totalTurnaroundTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);
    }

    public static void main(String[] args) {
        // Example usage:
        int[][] processes = {{0, 4}, {2, 5}, {4, 2}, {7, 8}};
        calculateWaitingTurnaroundTime(processes);
    }
}
