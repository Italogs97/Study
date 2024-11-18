// Switch case aprimorado


import java.util.Scanner;
public class PlanoOperadora {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		String plano;

        System.out.println("Por favor, digite seu plano");
		plano = sc.next();

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
                break;
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
                break;
			}
			case "B": {
				System.out.println("100 minutos de ligação");
                break;
			}
		}
	}
}
