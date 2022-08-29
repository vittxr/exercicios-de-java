import java.util.Arrays;
import java.util.List;

public class BombaCombustivel {
    private String tipo_combustivel; 
    private float valorPorLitro; 
    private float qtd_combustivel;

    public BombaCombustivel(String tipo_combustivel, float valorPorLitro, float qtd_combustivel) {
          this.tipo_combustivel = tipo_combustivel;
          this.valorPorLitro = valorPorLitro;
          this.qtd_combustivel = qtd_combustivel;
    }
      
    public void abastecerPorValor(float valor) {
        float qtdAbastecido = valor / valorPorLitro;
        qtd_combustivel = qtd_combustivel - qtdAbastecido;
        System.out.println("A quantidade abastecida foi de: " + qtdAbastecido + " litros");
    }

    public void abastecerPorLitro(float qtd) {
        float qtdAbastecido = qtd;
        qtd_combustivel = qtd_combustivel - qtdAbastecido;
        System.out.println("O total a pagar é de: " + qtdAbastecido * valorPorLitro + " reais");
    }

    public void setValor(float novoValor) {
        valorPorLitro = novoValor;
    }
    
    public void setTipoCombustivel(String novo_tipo_combustivel) {
        tipo_combustivel = novo_tipo_combustivel;
    }

    public void setQuantidadeCombustivel(float nova_qtd_combustivel) {
        qtd_combustivel = nova_qtd_combustivel;
    } 

    public List<String> getBombaCombustivelStatus() {
        String[] bombaCombustivelStatus = {
            "Tipo Combustivel: "+tipo_combustivel,
            "Valor por litro atual: "+Float.toString(valorPorLitro), 
            "quantidade de combustivel restante na bomba: " + Float.toString(qtd_combustivel)};
        return Arrays.asList(bombaCombustivelStatus);
    }
}