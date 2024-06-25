import encapsulamento.versao1.Veiculo;

public class TesteVeiculo1 {

    public static void main(String[] args){
       Veiculo veiculo = new Veiculo(10000);

       System.out.println("Criando um veículo com carga máxima de 10.000Kg: ");

       veiculo.adicionando(500);
    }
}