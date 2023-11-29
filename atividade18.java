package exJ2;
import java.util.*;
public class atividade18 {
    public static void main(String[] args) {
        try {
            Scanner scnIdade = new Scanner(System.in);
            System.out.println("Digite sua idade");
            short idade = scnIdade.nextShort();

            System.out.println("Você nasceu no ano de: " + (2023 - idade));
        } catch (InputMismatchException e) {
            System.out.println("Ops! Ocorreu o erro: " + e);
        }
    }
}
