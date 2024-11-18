// CaixaEletronico.java
//Condicionais Simples
public class CaixaEletronico {
    public static void main(String[] args) {

       double saldo = 25.0;
       double valorSolicitado = 10.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado;

        // melhoria de cod. com condicional composta

        else if(valorSolicitado > saldo)

        System.out.println("Saldo insulficiente");

        System.out.println("Valor Solicitado " + valorSolicitado);
        System.out.println("Saldo Atual " + saldo  );
        

    }
}
