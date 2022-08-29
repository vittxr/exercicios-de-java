/*
  -> Enunciado: Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses atributos a classes deve conter os seguintes métodos.
       a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo
       b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
       c. alterarValor; //altera o valor do litro do combustível.
       d. alterarCombustivel; //altera o tipo do combustível.
       e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
*/


public class App {
    public static void main(String[] args) {
      BombaCombustivel bombaComb = new BombaCombustivel("alcool", 7.50f, 1250f);

      bombaComb.setTipoCombustivel("etanol");
      bombaComb.setValor(6.50f);
      bombaComb.abastecerPorValor(100);
      bombaComb.abastecerPorLitro(500);

      System.out.println(bombaComb.getBombaCombustivelStatus());
    }
}