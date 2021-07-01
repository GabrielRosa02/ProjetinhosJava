package Onibus;
import java.util.*;

public class programadin
{
    public static void main(String[] args)
    {
        //informações:
        Onibus onibus1 = new Onibus(1 , 35 , 45 , 0);
        Onibus onibus2 = new Onibus(1 , 25 , 35 , 0);
        Onibus onibus3 = new Onibus(1 , 15 , 55 , 0);


        //Input:
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int mover =  1;
        int passageiros = 0;
        int subir = 0;

        //Programa:
        System.out.println("Olá, seja muito bem vindo a compania de Onibus do Rosa\nSelecione uma das opções que temos hoje:\n1.)Onibus 1\n2.)Onibus 2\n3.)Onibus 3");
        opcao = sc.nextInt();
        switch (opcao)
        {
            
            //Onibus 1:
            case 1:
                onibus1.Ligar();
                while((onibus1.pessoas_presentes <= onibus1.capacidade_onibus) && (onibus1.local_atual <= onibus1.quantidade_paradas))
                {
                    System.out.println("O onibus 1 está localizado na ponto " + onibus1.local_atual + " e tem o total de " + onibus1.pessoas_presentes + " pessoas presentes.");
                    System.out.println("Vai subir ou descer?\n1.)Subir\n2.)Descer");
                    subir = sc.nextInt();

                    switch (subir) 
                    {
                    case 1:
                        System.out.println("Quantas Pessoas?");
                        passageiros = sc.nextInt();
                        onibus1.pessoas_presentes = onibus1.pessoas_presentes + passageiros;
                        if (onibus1.pessoas_presentes > onibus1.capacidade_onibus )
                        {
                            System.out.println(" O onibus ja está lotado :(");
                            onibus1.pessoas_presentes = onibus1.capacidade_onibus;
                        }
                        break;
                    case 2:
                        System.out.println("Quantas Pessoas?");
                        passageiros = sc.nextInt();
                        onibus1.pessoas_presentes = onibus1.pessoas_presentes - passageiros;
                        break;
                    }
                    onibus1.local_atual = onibus1.local_atual + mover;  
                }
                System.out.println("O onibus Completou a sua viagem.");
                break;

            //Onibus2
            case 2:
            onibus2.Ligar();
            while((onibus2.pessoas_presentes <= onibus2.capacidade_onibus) && (onibus2.local_atual <= onibus2.quantidade_paradas))
            {
                System.out.println("O onibus 2 está localizado no ponto " + onibus2.local_atual + " e tem o total de " + onibus2.pessoas_presentes + " pessoas presentes.");
                System.out.println("Vai subir ou descer?\n1.)Subir\n2.)Descer");
                subir = sc.nextInt();

                switch (subir) 
                {
                case 1:
                    System.out.println("Quantas Pessoas?");
                    passageiros = sc.nextInt();
                    onibus2.pessoas_presentes = onibus2.pessoas_presentes + passageiros;
                    if (onibus2.pessoas_presentes > onibus2.capacidade_onibus )
                    {
                        System.out.println("O onibus ja está lotado :(");
                        onibus2.pessoas_presentes = onibus2.capacidade_onibus;
                    }
                    break;
                case 2:
                    System.out.println("Quantas Pessoas?");
                    passageiros = sc.nextInt();
                    onibus2.pessoas_presentes = onibus2.pessoas_presentes - passageiros;
                    break;
                }  

            onibus2.local_atual = onibus2.local_atual + mover;
            }
            System.out.println("O onibus Completou a sua viagem.");
            break;


            //Onibus 3: 
            case 3:
            onibus3.Ligar();
            while((onibus3.pessoas_presentes <= onibus3.capacidade_onibus) && (onibus3.local_atual <= onibus3.quantidade_paradas))
            {
                System.out.println("O onibus 3 está localizado no ponto " + onibus3.local_atual + " e tem o total de " + onibus3.pessoas_presentes + " pessoas presentes.");
                System.out.println("Vai subir ou descer?\n1.)Subir\n2.)Descer");
                subir = sc.nextInt();

                switch (subir) 
                {
                case 1:
                    System.out.println("Quantas Pessoas?");
                    passageiros = sc.nextInt();
                    onibus3.pessoas_presentes = onibus3.pessoas_presentes + passageiros;
                    if (onibus3.pessoas_presentes > onibus3.capacidade_onibus )
                    {
                        System.out.println(" O onibus ja está lotado :(");
                        onibus3.pessoas_presentes = onibus3.capacidade_onibus;
                    }
                    break;
                case 2:
                    System.out.println("Quantas Pessoas?");
                    passageiros = sc.nextInt();
                    onibus3.pessoas_presentes = onibus3.pessoas_presentes - passageiros;
                    break;
                }  

            onibus3.local_atual = onibus3.local_atual + mover;
            }
            System.out.println("O onibus Completou a sua viagem.");
            break;    
          
        }
        sc.close();
    }
}