public class gabonibus {
    int onibus;
    int paradas;
    int capon;
    int pessoni;
    String SaoP;
    String turismo;
    

    public  gabonibus(int onibus, String SaoP, String turismo, int paradas, int capon, int pessoni) {
        this.onibus = onibus;
        this.SaoP = SaoP;
        this.capon = capon;
        this.pessoni = pessoni;
        this.paradas = paradas;
        this.turismo = turismo;


}
public int getparadas(){
    return paradas;
}
public void pessoni(int pessoni){
    if (this.pessoni <= capon){
        this.pessoni = pessoni;
    }
}
public void sai(int pessoni) {
    if (pessoni <= this.pessoni) {
        this.pessoni = pessoni - this.pessoni;
}
}
public String stop(){
    return"Stop the count and the bus";
}
public class Class {
    public void main(String[] args) {
        Class b1 = new onibus(1, "Partida", "Friburgo", 1, 70, 65);
        Class b2 = new onibus(2, "Partida", "Ilha do governador", 2, 65, 60);
        Class b3 = new onibus(3, "Partida", "Rocinha", 0, 55, 28);
        System.out.println(b1.getParadas());
        System.out.println(b2.getParadas());
        System.out.println(b3.getParadas());

    

    }

    private char[] getParadas() {
        return null;
    }


}

    
    


