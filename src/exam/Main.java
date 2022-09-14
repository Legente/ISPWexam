package exam;

//sonar-scanner.bat -D"sonar.organization=legente" -D"sonar.projectKey=Legente_ISPWexam" -D"sonar.sources=." -D"sonar.host.url=https://sonarcloud.io"

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        List<String> names = new ArrayList<>();
        do {
            Log.info("Please Enter a name (Write 'sort' to sort the list) : ");
            str = sc.nextLine();
            if (!"sort".equals(str)) {
                names.add(str);
                System.out.println("Names entered: " + names);
            }
        } while (!"sort".equals(str));

        sort(names);

        Log.info("Names sorted: " + names);
    }


    public static void sort(List<String> names) {
        names.sort(Collections.reverseOrder());
    }


}
