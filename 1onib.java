package Onibus;

class Onibus {
    int local_atual;
    int quantidade_paradas;
    int capacidade_onibus ;
    int pessoas_presentes;

    
    void Ligar()
    {
        System.out.println("Bora para a viagem.");
    }

    public Onibus(int local_atual, int quantidade_paradas, int capacidade_onibus, int pessoas_presentes)
    {
        this.local_atual = local_atual;
        this.quantidade_paradas = quantidade_paradas;
        this.capacidade_onibus = capacidade_onibus;
        this.pessoas_presentes = pessoas_presentes;
    }
    
    void Parar()
    {
        System.out.println("O Onibus completou sua viagem e desligou os motores.");
    }
   
}