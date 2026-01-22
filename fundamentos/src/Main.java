
// importar array e scanner => ler dado inserido  pelo usuario
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // criação da variavel usada para a pergunta sc => mais usada eu acho
        Scanner sc = new Scanner(System.in);

        // array com 20 espaços
        int[] nums = new int[20];

        // definimos todos as posições do array nums usando numeros inteiros de 1 + 1 => 1,2,3,4,5,6...20
        Arrays.setAll(nums, i -> i + 1);

        // Saida para o usuario
        System.out.println("Escolha um numero de 1 a 20");

        // criamos uma variavel de inteiro chamada valor onde vai receber o dado do usuario
        // onde esse dado vai ser o proximo int dado pelo usuario
        int valor = sc.nextInt();

        // Duas variaveis necessarias para a escolha por numero binario
        int inicio = 0;
        int fim = 19;

        // Inico do loop para acharmos o numero
        while  (inicio <= fim) {

            // definimos o meio do array, ele está no loop para ter ser valor atualizado continuamente
            int meio = (inicio + fim)/2 ;

            // criamos a condição para sabermos se achamos ou não o valor dado pelo usuario no nosso array
            if (nums[meio] == valor) {
                System.out.println("Achamos seu numero! Hahahaha bem facil");
                // achamos o valor logo não é mais necessario o loop
                break;
            } else if (nums[meio] > valor) {
                // caso o valor digitado pelo usuario for menor que o chute que é o nosso meio, a gente ajusta o meio para encurtarmos o array
                fim = meio - 1 ;
            } else {
                // Assim só sobra se o valor for maior logo ajustamos o inicio para encurtar o array
                inicio = meio + 1;

                // esse loop só irá parar ao achar o numero do usuario
            }
        }
    }
}