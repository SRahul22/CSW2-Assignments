package com.assignment2.partB;

import java.util.*;

class Process {
    int pid;
    int burstTime;
    int remainingTime;

    public Process(int pid, int burstTime) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
    }
}

public class SRTN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take input as burst time of N processes
        System.out.print("Enter the number of processes: ");
        int n = scanner.nextInt();
        Process[] processes = new Process[n];
        for (int i = 0; i < n; i++) {

            System.out.print("Enter burst time for process " + (i + 1) + ": ");
            int burstTime = scanner.nextInt();
            processes[i] = new Process(i + 1, burstTime);
        }
        PriorityQueue<Process> pq = new PriorityQueue<>(Comparator.comparingInt(p -> p.remainingTime));
        int currentTime = 0;
        int completedProcesses = 0;
        System.out.println("\nScheduling Sequence:");
        while (completedProcesses < n) {
            for (Process process : processes) {
                if (process.burstTime == 0) {
                    continue;
                }
                if (process.burstTime == process.remainingTime) {
                    System.out.print("P" + process.pid + " -> ");
                    process.remainingTime--;
                    currentTime++;
                    pq.add(process);
                } else {
                    pq.add(process);
                }
            }
            if (pq.isEmpty()) {
                currentTime++;
                continue;
            }
            Process currentProcess = pq.poll();
            currentProcess.remainingTime--;
            currentTime++;
            if (currentProcess.remainingTime == 0) {
                completedProcesses++;
                System.out.print("P" + currentProcess.pid);
                if (completedProcesses < n) {
                    System.out.print(" -> ");
                }
            } else {
                pq.add(currentProcess);
            }
        }
        System.out.println("\nTotal time taken: " + currentTime);
    }
}