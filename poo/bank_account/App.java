/*
 -> enunciado: Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
*/
package poo.bank_account;

public class App {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("590", "vitor", 500);
        myAccount.setAccNumber("210");
        myAccount.setBalance(200, "deposito");
        myAccount.setBalance(300, "transferencia");
        
        System.out.println(myAccount.getBankAccountData());    
    }
}