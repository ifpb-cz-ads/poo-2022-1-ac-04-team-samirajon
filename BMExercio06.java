import java.util.Scanner;

class BMExercicio06 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um numero entre um e sete: ");
        num = sc.nextInt();

        while(num != 0){
        if (num == 1){
            System.out.println("Domingo");
            break;
        }else if (num == 2){
            System.out.println("Segunda");
            break;
        }else if (num == 3){
            System.out.println("Terça");
            break;
        }else if (num == 4){
            System.out.println("Quarta");
            break;
        }else if (num == 5){
            System.out.println("Quinta");
            break;
        }else if (num == 6){
            System.out.println("Sexta");
            break;
        }else if (num == 7){
            System.out.println("Sábado");
            break;
        }else {
            System.out.println("NUMERO INVALIDO");
            break;
        }
    }
    }
}