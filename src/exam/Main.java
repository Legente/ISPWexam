package exam;

//sonar-scanner.bat -D"sonar.organization=legente" -D"sonar.projectKey=Legente_ISPWexam" -D"sonar.sources=." -D"sonar.host.url=https://sonarcloud.io"

public class Main {
    public static void main(String[] args) {
        int a = 100;
        int b = 500;
        print(a, b);
    }

    public static void print(int a, int b){
        Log.info("Sommo i due numeri");
        int c = a + b;
        Log.info("Il risultato è " + c);

        Log.info("Eseguo la sottrazione dei numeri ");
        int d = a - b;
        if (d<0){
            Log.info("La somma è negativa " + d);
        } else {
            Log.info("La somma è positiva " + d);
        }

    }
}
