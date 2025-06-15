
import java.util.Scanner;

public class ContaTerminal {

   public void PedidoUsuario(){
    Scanner sc = new  Scanner(System.in);


    System.out.println("Ola! Para entrar na conta digite: 1\nPara sair da conta digite: 2");
    int login = sc.nextInt();

    switch(login){
        case 1:
            System.out.println("Log na sua conta, digite 1: ");
        break;
        case 2:
            System.out.println("Sair, digite 2: "); 
        break;

        default:
            System.out.println("Escolha uma das alternativas");
    }

    if (login == 1){
        double saldo = 240.90;

        System.out.println("informe seu numero do seu  Banco: ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Informe agencia do seu banco: ");
        String agencia = sc.nextLine();

        System.out.println("Informe seu nome completo, por gentileza: ");
        String nomeCliente = sc.nextLine();



        System.out.println("Olá " + nomeCliente +" obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + " , conta "+ numero + " e seu saldo"+ saldo +  "já está disponível para saque\"");
    }else{
        System.out.println("ops! Numero de banco não encontrado");
    }
   }

   public static void main(String[] args) {
    ContaTerminal MyUser = new  ContaTerminal();
    MyUser.PedidoUsuario();

   }
}
