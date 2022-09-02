package application;

import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.Votos;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Votos votos = new Votos();

		votos.totalEleitores = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de eleitores"));
		votos.votosValidos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de votos válidos"));
		votos.votosBranco = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de votos brancos"));
		votos.votosNulos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de votos nulos"));

		if (votos.totalEleitores > votos.votosValidos || votos.totalEleitores > votos.votosBranco
				|| votos.totalEleitores > votos.votosNulos) {

			votos.percentValidos();

			votos.percentBrancos();

			votos.percentNulos();

			JOptionPane.showMessageDialog(null, votos);

		} else {
			JOptionPane.showMessageDialog(null, "Quantidade de votos não pode ser maior que a quantidade de eleitores",
					"Erro", 0, null);

		}

		sc.close();

	}

}
