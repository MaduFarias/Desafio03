import java.util.Random;
import java.util.Scanner;

public class CacaNumero {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random ();

    private static Integer Dificuldade() {
        while (true) {
            System.out.println("""
                    Dificuldade:
                    
                    [1]Fácil (número de 1 a 50)
                    [2]Médio (número de 1 a 100)
                    [3]Difícil (número de 1 a 500)
                    """);

            System.out.println("Informe o número da dificuldade: ");
            int dificuldade = scanner.nextInt();

            if (dificuldade < 1 || dificuldade > 3) {
                System.out.println("Dificuldade inexistente, digite um número válido");
            } else {
                return dificuldade;
            }
        }
    }

    private static Integer NumSistema() {
        int difmin = 1;
        int diffacil = 50;
        int difmedio = 100;
        int difdificil = 500;

        switch (Dificuldade()) {
            case 1:
                int numfacil = random.nextInt((diffacil - difmin) + 1 ) + difmin;
                return numfacil;
            case 2:
                int nummedio = random.nextInt((difmedio - difmin) + 1) + difmin;
                return nummedio;
            case 3:
                int numdificil = random.nextInt((difdificil - difmin) + 1) + difmin;
                return numdificil;
            default:
                System.out.println("Erro na operação, tente um número válido");
                return Dificuldade();
        }
    }

    static void Jogo(){
        int numsecreto = NumSistema();
        //regras do jogo
        int chute = scanner.nextInt();


    }

    public static void main(String[] args) {
        NumSistema();
    }
}