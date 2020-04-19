package curso;

import java.util.Scanner;

import banco.Conta;
import modeloDeExcecao.DominioExcecao;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Inserir dados da conta");
		System.out.print("Número: ");
		int numero = Integer.parseInt(sc.nextLine());
		System.out.print("Proprietário: ");
		String proprietario = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = Double.parseDouble(sc.nextLine());
		System.out.print("Limite de retirada: ");
		double limiteDeRetirada = Double.parseDouble(sc.nextLine());

		Conta conta = new Conta(numero, proprietario, saldo, limiteDeRetirada);

		System.out.println();
		System.out.print("Insira o valor para a retirada: ");
		double montante = Double.parseDouble(sc.nextLine());
		try {
			conta.retirada(montante);
			System.out.println("Novo saldo: " + String.format("%.2f", conta.getSaldo()));
		} catch (DominioExcecao e) {
			System.out.println("Retirar erro: " + e.getMessage());
		}

		sc.close();

	}

}
