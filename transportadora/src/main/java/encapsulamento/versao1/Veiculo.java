package encapsulamento.versao1;

public class Veiculo {
    public double carga;
    public double cargaMaxima;

    public Veiculo(double cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }

    public double getCarga() {
        return carga;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void adicionando(double carga){
        this.carga = this.carga + carga;
        System.out.println("Adicionando Carga:" + carga);
    }
}
