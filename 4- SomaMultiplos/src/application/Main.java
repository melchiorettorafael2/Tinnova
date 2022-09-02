package application;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0;

		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));

		for (int i = 0; i < num; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				soma += i;
			}
		}

		JOptionPane.showMessageDialog(null, "Soma dos multiplos de 3 e 5 (Range de 0 a " + num + ") = " + soma);
		sc.close();
	}

}
