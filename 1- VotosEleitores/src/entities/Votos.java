package entities;

public class Votos {
	public int totalEleitores;
	public int votosValidos;
	public int votosNulos;
	public int votosBranco;
	public double perValidos;
	public double perNulos;
	public double perBranco;

	public Votos() {

	}

	public Votos(int totalEleitores, int votosValidos, int votosNulos, int votosBranco) {
		this.totalEleitores = totalEleitores;
		this.votosValidos = votosValidos;
		this.votosNulos = votosNulos;
		this.votosBranco = votosBranco;
	}

	public int getTotalEleitores() {
		return totalEleitores;
	}

	public int getVotosValidos() {
		return votosValidos;
	}

	public int getVotosNulos() {
		return votosNulos;
	}

	public int getVotosBranco() {
		return votosBranco;
	}

	public void percentValidos() {
		perValidos = (((double) votosValidos / (double) totalEleitores) * 100);

	}

	public void percentBrancos() {
		perBranco = (((double) votosBranco / (double) totalEleitores) * 100);

	}

	public void percentNulos() {
		perNulos = (((double) votosNulos / (double) totalEleitores) * 100);
	}

	public String toString() {
		return "Total de eleitores: " + totalEleitores + "\nPercentual de Votos Válidos: " + String.format("%.2f", perValidos) + "%"
				+ "\nPercentual de Votos em Branco: " +String.format("%.2f", perBranco) + "%" + "\nPercentual de Votos Nulos: " + String.format("%.2f", perNulos) + "%";
	}

}
