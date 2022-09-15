package exam;

//sonar-scanner.bat -D"sonar.organization=legente" -D"sonar.projectKey=Legente_ISPWexam" -D"sonar.sources=." -D"sonar.host.url=https://sonarcloud.io"

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            Log.info("Please Enter a number (not 0): ");
            n = sc.nextInt();
        } while (n == 0);


        if (checkNumber(n)) {
            Log.info("Il numero " + n + " è multiplo di 2");
        } else {
            Log.info("Il numero " + n + " NON è multiplo di 2");
        }
    }


    public static boolean checkNumber(int n) {
        return n % 2 == 0;
    }


}
