import java.util.Scanner;

public class n10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int alphabetLength = alphabet.length();


        System.out.println("Введите текст для шифрования:");
        String inputText = scanner.nextLine().toUpperCase();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();

        String encryptedText = encrypt(inputText, key, alphabet);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        char choice = scanner.next().charAt(0);

        if (choice == 'y') {
            String decryptedText = encrypt(encryptedText, -key, alphabet);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (choice == 'n') {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }

        scanner.close();
    }

    private static String encrypt(String text, int key, String alphabet) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            int index = alphabet.indexOf(character);
            if (index != -1) {

                int newIndex = (index + key) % alphabet.length();
                if (newIndex < 0) {
                    newIndex += alphabet.length();
                }
                result.append(alphabet.charAt(newIndex));
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }
}