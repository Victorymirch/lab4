package Lab4;

import java.util.Scanner;

public class n8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String inputText = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();

        String encryptedText = encrypt(inputText, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        char choice = scanner.next().charAt(0);

        if (choice == 'y' || choice == 'Y') {
            String decryptedText = encrypt(encryptedText, -key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else if (choice == 'n' || choice == 'N') {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ.");
        }

        scanner.close();
    }

    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isUpperCase(character)) {
                char encryptedChar = (char) (((character + key - 'A' + 26) % 26) + 'A');
                result.append(encryptedChar);
            }
            else if (Character.isLowerCase(character)) {
                char encryptedChar = (char) (((character + key - 'a' + 26) % 26) + 'a');
                result.append(encryptedChar);
            } else {
                result.append(character);
            }
        }

        return result.toString();
    }
}