/*
 -> enunciado: Construa uma classe para representar um carro. O tanque de combustível do carro armazena no máximo 50 litros de gasolina. O carro consome 15 km/litro. Deve ser possível:

   a. Abastecer o carro com certa quantidade de gasolina;
   b. Mover o carro em uma determinada distância (medida em km);
   c. Retornar a quantidade de combustível e a distância total percorrida.

 No programa principal, crie 2 carros.Abasteça 20 litros no primeiro e 30 litros no segundo. Desloque o primeiro em 200 km e o segundo em 400 km. Exiba na tela a distância percorrida e o total de combustível restante para cada um.
*/

public class App {
    public static void main(String[] args) {
        Car car = new Car();

        car.fillUp(30f);
        car.move(400f);
    }
}