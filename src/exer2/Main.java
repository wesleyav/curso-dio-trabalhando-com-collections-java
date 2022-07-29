package exer2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Gato> meusGatos = new ArrayList<>() {
			{
				add(new Gato("Jon", 18, "preto"));
				add(new Gato("Simba", 6, "tigrado"));
				add(new Gato("Jon", 12, "amarelo"));
			}
		};

		System.out.println(meusGatos);

		System.out.println("--\tOrdem de Inserção\t---");
		System.out.println(meusGatos);

		System.out.println("--\tOrdem Aleatória\t---");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);

		System.out.println("--\tOrdem Natural (Nome)\t---");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);

	}

}
