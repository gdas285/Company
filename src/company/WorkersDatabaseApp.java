package company;

import java.util.Scanner;

public class WorkersDatabaseApp {

    public static void main(String[] args) {
        System.out.println("Enter how many workers to add");
        Scanner in = new Scanner(System.in);
        int numOfWorkers = in.nextInt();
        Workers[] workers = new Workers[numOfWorkers];

        for (int n = 0; n < numOfWorkers; n++) {
            workers[n] = new Workers();
        }
        for (int n = 0; n < numOfWorkers; n++) {
            System.out.println(workers[n].info());
        }
    }

}
