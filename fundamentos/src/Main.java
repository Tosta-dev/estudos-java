// importar array e scanner => ler dado inserido  pelo usuario
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner responsável pela leitura da entrada padrão (System.in)
        Scanner sc = new Scanner(System.in);

        // array com 20 espaços
        int[] nums = new int[20];

        // definimos todos as posições do array nums usando numeros inteiros de 1 + 1 => 1,2,3,4,5,6...20
        Arrays.setAll(nums, i -> i + 1);

        // Saida para o usuario
        System.out.println("Olá, Seja Bem vindo! Ao jogo, aqui iremos adivinhar o numero dentro dos parametros! Aproveite ");
        System.out.println("Escolha um numero de 1 a 20");

        // criamos uma variavel de inteiro chamada valor onde vai receber o dado do usuario
        // onde esse dado vai ser o proximo int dado pelo usuario
        int valor = sc.nextInt();

        // Duas variaveis necessarias para a escolha por numero binario
        int inicio = 0;
        int fim = nums.length - 1;

        // validar a entrada do usuario
        if  ( valor >= 1 && valor <= 20){
            System.out.println("Vamos começar ...");
        } else {
            System.out.println("O valor digitado não está na faixa definida");
            return;
        }

        // Inico do loop para acharmos o numero
        while  (inicio <= fim) {

            // definimos o meio do array, ele está no loop para ter ser valor atualizado continuamente
            int meio = (inicio + fim)/2 ;

            // variavel com nome simples para entender o "chute" de acordo com o jogo
            int chute = nums[meio];

            // criamos a condição para sabermos se achamos ou não o valor dado pelo usuario no nosso array
            if (chute == valor) {
                System.out.println("Nosso chute é o " + chute );
                System.out.println("Achamos seu numero! Hahahaha bem facil");
                // achamos o valor logo não é mais necessario o loop
                break;
            } else if (chute > valor) {
                // caso o valor digitado pelo usuario for menor que o chute que é o nosso meio, a gente ajusta o meio para encurtarmos o array
                msg_erro(chute);
                fim = meio - 1 ;
            } else {
                // Assim só sobra se o valor for maior logo ajustamos o inicio para encurtar o array
                msg_erro(chute);
                inicio = meio + 1;

                // esse loop só irá parar ao achar o numero do usuario
            }
        }
    }
    public static void msg_erro(int chute){
        System.out.println("Hmmm... meu chute vai ser : " + chute);
        System.out.println("Nossa! hahahha pelo visto eu errei!");
    }
}
