import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int cont = 0; // conta o numeros de caso

        while (sc.hasNext()) {
            int a = sc.nextInt(); // entrada
            int value = 0; // conta quantos numeros foram inseridos
            cont++;

            for (int i = 0; i <= a; i++) {
                if (i == 0) {
                    sb.append(i);
                    value++;
                } else {
                    for (int k = 0; k < i; k++) {
                        sb.append(" " + i);
                        value++;
                    }
                }

            }
            if (value == 1) {
                System.out.println("Caso " + cont + ": " + value + " numero");
                System.out.println(sb.toString());
                System.out.println();
            } else {
                System.out.println("Caso " + cont + ": " + value + " numeros");
                System.out.println(sb.toString());
                System.out.println();
            }

            sb.setLength(0);
        }

        sc.close();

    }
}
