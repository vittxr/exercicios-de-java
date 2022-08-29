/**
-> enunciado: Crie uma classe chamada Funcionário que inclui três atributos:
       a. nome (String);
       b. sobrenome (String);
       c. salário mensal (double). 
A classe deve ter um construtor, métodos getters e setters para cada atributo da classe. Escreva uma classe chamada FuncionarioTeste (que contenha o método main) que cria dois objetos da classe Funcionario e exibe o salário de cada objeto. Então dê a cada Funcionario um aumento de 10% e exiba novamente o salário anual de cada um deles. Introduza na classe Funcionario uma variável de classe capaz de 
contabilizar o numero de funcionarios que passaram pela empresa até a data.
*/

public class App {
   public static void main(String[] args) {
       Employees employees = new Employees();

       employees.addEmployee("vitor", 1250f);
       employees.addEmployee("jao", 1050f);

       employees.removeEmployee("jao");
       
       employees.increaseSalary("vitor", 20f);
       employees.decreaseSalary("vitor", 10f);

       System.out.println(employees.getEmployees());
       
   }
}