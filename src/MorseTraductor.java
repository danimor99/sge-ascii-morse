import java.util.HashMap;
import java.util.Scanner;

public class MorseTraductor {

        public static void main(String[] args) {

            HashMap<String, String> morseaEspanol = new HashMap<>();
            morseaEspanol.put(".-", "A");
            morseaEspanol.put("-...", "B");
            morseaEspanol.put("-.-.", "C");
            morseaEspanol.put("-..", "D");
            morseaEspanol.put(".", "E");
            morseaEspanol.put("..-.", "F");
            morseaEspanol.put("--.", "G");
            morseaEspanol.put("....", "H");
            morseaEspanol.put("..", "I");
            morseaEspanol.put(".---", "J");
            morseaEspanol.put("-.-", "K");
            morseaEspanol.put(".-..", "L");
            morseaEspanol.put("--", "M");
            morseaEspanol.put("-.", "N");
            morseaEspanol.put("--.--", "Ñ");
            morseaEspanol.put("---", "O");
            morseaEspanol.put(".--.", "P");
            morseaEspanol.put("--.-", "Q");
            morseaEspanol.put(".-.", "R");
            morseaEspanol.put("...", "S");
            morseaEspanol.put("-", "T");
            morseaEspanol.put("..-", "U");
            morseaEspanol.put("...-", "V");
            morseaEspanol.put(".--", "W");
            morseaEspanol.put("-..-", "X");
            morseaEspanol.put("-.--", "Y");
            morseaEspanol.put("--..", "Z");
            morseaEspanol.put("/", " ");

            Scanner scanner = new Scanner(System.in);
            String morseInput;

            while (true) {
                System.out.println("Introduce el texto en código Morse, usa la / para separar palabras ");
                morseInput = scanner.nextLine();
                if (morseInput.matches("[\\.\\-/ ]+")) {
                    break;
                } else {
                    System.out.println("Entrada no valida. Solo se permiten los caracteres . - / y espacios.");
                }
            }

            String[] morseSimbolo = morseInput.split(" ");
            StringBuilder traductor = new StringBuilder();

            for (String simbolo : morseSimbolo) {
                if (morseaEspanol.containsKey(simbolo)) {
                    traductor.append(morseaEspanol.get(simbolo));
                }
            }

            System.out.println("Traducción: " + traductor.toString());
            scanner.close();
        }
    }


