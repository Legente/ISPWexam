package exam;

import java.util.logging.Logger;

//sonar-scanner.bat -D"sonar.organization=legente" -D"sonar.projectKey=Legente_ISPWexam" -D"sonar.sources=." -D"sonar.host.url=https://sonarcloud.io"

public class Main {
    public static void main(String[] args) {
        print();
    }

    public static void print(){
        Log.info("ciao");
    }
}
