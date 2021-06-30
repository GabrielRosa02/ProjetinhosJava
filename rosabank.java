import java.util.Scanner;
public class rosabank {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nometit;
        String agen;
        int numero;
        double saldo = 1079.0;
        int sacar;
        double deposit;
        double consult;
        String abertura;
        //Começo

        System.out.println("Seja bem vindo ao banco gabsito");

        //Intro

        System.out.println("Informe seu nome");
        String nome = sc.nextLine();

        //Utilizando
        System.out.println("Olá "+nome+",o que deseja fazer? \n Consultar saldo.\n Sacar.\n Depositar.\n Calcular Rendimento.");
        System.out.println("\n1.Consultar saldo\n2.Sacar\n3.Depositar\n.4Calcular Rendimento");
        int opcao = sc.nextInt();
        while((opcao != 1) && (opcao != 2) && (opcao != 3) && (opcao !=4)){
            System.out.println("Informaçao invalida, por favor insira o dado correto\n1.Consultar\n2.Sacar\n3.Depositar\n4.Calcular Rendimento");
            opcao = sc.nextInt();
            }

        //Consultar saldo
        if (opcao == 1){
            System.out.println("Seu saldo: "+saldo+" ");


        }
        //Sacar
        if (opcao == 2){
            System.out.println("Insira quanto deseja sacar,você tem "+saldo+" restante");
             sacar = sc.nextInt();
             while (sacar > 1079.0){
                System.out.println("Você não possui saldo suficiente para realizar esta operação");
                System.exit(0);
                }

             if (sacar < 1079.0){
                System.out.println(+saldo+ "-" +sacar+ "=" + (saldo - sacar));
             
             
            }
             }
            //Depositar 
            if (opcao == 3){
            System.out.println("Insira quanto deseja depositar,você tem "+saldo+" restante");
            deposit = sc.nextDouble();
             
            System.out.println(+saldo+ "+" +deposit+ "=" + (saldo + deposit));
            System.out.println("Depósito feito com sucesso");


            }
            //rendimento mensal
            if (opcao == 4){
                if (saldo > 0);
                  consult = (1.0024 * saldo);
                  saldo = consult;
                
                System.out.println("Seu rendimento mensal é de: "+saldo+"");
            }
            }


            }

            



        
            

            



        
    



    

