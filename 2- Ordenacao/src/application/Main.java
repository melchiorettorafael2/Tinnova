package application;

public class Main {

	public static void main(String[] args) {

		int v[] = { 5, 3, 2, 4, 7, 1, 0, 6 };
		int aux;
		boolean controle = true;

		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < (v.length - 1); j++) {
				if (v[j] > v[j + 1]) {
					aux = v[j];
					v[j] = v[j + 1];
					v[j + 1] = aux;
					controle = false;
				}
			}

			if (controle) {
				break;
			}
		}

		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}

	}

}
