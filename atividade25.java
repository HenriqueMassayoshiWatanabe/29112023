package exJ2;
import java.util.*;
import java.time.*;
import java.time.format.*;

public class atividade25 {
    public static void main(String[] args) {
        String[] entradas = {"porta","janela","ventarola","portinhola","alçapão","portão"};

        // objeto date horário atual
        LocalDateTime horarioAtual = LocalDateTime.now();

        // objeto date horário atual formatado
        DateTimeFormatter horarioAtualFormatado = DateTimeFormatter.ofPattern("HH");

        // string horário atual formatado
        String strHorarioAtualFormatado = horarioAtual.format(horarioAtualFormatado);

        boolean sair = false;

        while (sair == false) {
            // try {
            //     Runtime.getRuntime().exec("clear");
            // } catch (Exception e) {
            //     System.out.println("'exec' falhou. Erro: " + e);
            // }
            switch (Integer.valueOf(strHorarioAtualFormatado)) {
                case 0:
                    System.out.println("Não liberado, pois ainda é 0h.");
                    break;
                case 1:
                    System.out.println("Não liberado, pois ainda é 1h.");
                    break;
                case 2:
                    System.out.println("Não liberado, pois ainda é 2h.");
                    break;
                case 3:
                    System.out.println("Não liberado, pois ainda é 3h.");
                    break;
                case 4:
                    System.out.println("Não liberado, pois ainda é 4h.");
                    break;
                case 5:
                    System.out.println("Não liberado, pois ainda é 5h.");
                    break;
                case 6:
                    System.out.println("Não liberado, pois ainda é 6h.");
                    break;
                case 7:
                    System.out.println("Não liberado, pois ainda é 7h.");
                    break;
                case 8:
                    System.out.println("Não liberado, pois ainda é 8h.");
                    break;
                case 9:
                    System.out.println("Não liberado, pois ainda é 9h.");
                    break;
                case 10:
                    System.out.println("Não liberado, pois ainda é 10h.");
                    break;
                case 11:
                    System.out.println("Não liberado, pois ainda é 11h.");
                    break;
                case 12:
                    System.out.println("Não liberado, pois ainda é 12h.");
                    break;
                case 13:
                    System.out.println("Não liberado, pois ainda é 13h.");
                    break;
                case 14:
                    System.out.println("Não liberado, pois ainda é 14h.");
                    break;
                case 15:
                    System.out.println("Não liberado, pois ainda é 15h.");
                    break;
                case 16:
                    System.out.println("Liberado, pode abrir a " + entradas[0]);
                    sair = true;
                    break;
                case 17:
                    System.out.println("Não liberado, pois ainda é 17h.");
                    break;
                case 18:
                    System.out.println("Não liberado, pois ainda é 18h.");
                    break;
                case 19:
                    System.out.println("Não liberado, pois ainda é 19h.");
                    break;
                case 20:
                    System.out.println("Não liberado, pois ainda é 20h.");
                    break;
                case 21:
                    System.out.println("Não liberado, pois ainda é 21h.");
                    break;
                case 22:
                    System.out.println("Não liberado, pois ainda é 22h.");
                    break;
                case 23:
                    System.out.println("Não liberado, pois ainda é 23h.");
                    break;
                default:
                    System.out.println("Horário inexistente.");
                    break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Contador falhou. Erro: " + e);
            }
        }
    }
}
