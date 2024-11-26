import java.util.HashMap;
import java.util.Scanner;

public class CastellanoTraductor {

    public static void main(String[] args) {

        HashMap<String, String> castellanoMorse = new HashMap<>();
        castellanoMorse.put("A", ".-");
        castellanoMorse.put("B", "-...");
        castellanoMorse.put("C", "-.-.");
        castellanoMorse.put("D", "-..");
        castellanoMorse.put("E", ".");
        castellanoMorse.put("F", "..-.");
        castellanoMorse.put("G", "--.");
        castellanoMorse.put("H", "....");
        castellanoMorse.put("I", "..");
        castellanoMorse.put("J", ".---");
        castellanoMorse.put("K", "-.-");
        castellanoMorse.put("L", ".-..");
        castellanoMorse.put("M", "--");
        castellanoMorse.put("N", "-.");
        castellanoMorse.put("Ñ", "--.--");
        castellanoMorse.put("O", "---");
        castellanoMorse.put("P", ".--.");
        castellanoMorse.put("Q", "--.-");
        castellanoMorse.put("R", ".-.");
        castellanoMorse.put("S", "...");
        castellanoMorse.put("T", "-");
        castellanoMorse.put("U", "..-");
        castellanoMorse.put("V", "...-");
        castellanoMorse.put("W", ".--");
        castellanoMorse.put("X", "-..-");
        castellanoMorse.put("Y", "-.--");
        castellanoMorse.put("Z", "--..");
        castellanoMorse.put("/", " ");

        Scanner scanner = new Scanner(System.in);
        String castellanoInput;


        while (true) {
            System.out.println("Introduce las letras a traducir, usa la / para separar palabras ");
            castellanoInput = scanner.nextLine();
            if (castellanoInput.matches("[a-zA-ZñÑ ]+")) {
                break;
            } else {
                System.out.println("Entrada no valida. Solo se permiten letras.");
            }
        }
        castellanoInput = castellanoInput.toUpperCase();
        String[] Letras = castellanoInput.split(" ");
        StringBuilder traductor = new StringBuilder();


        for (String Letra : Letras) {
            if (castellanoMorse.containsKey(Letra)) {
                traductor.append(castellanoMorse.get(Letra));
            }
        }

        System.out.println("Traducción: " + traductor.toString());
        scanner.close();
    }
}


