package br.com.s2it.exercicio8;

public class ImprimeC {

	public static Integer retornarC(int a, int b) {

		StringBuilder builder = new StringBuilder();

		char[] arrayA = Integer.valueOf(a).toString().toCharArray();
		char[] arrayB = Integer.valueOf(b).toString().toCharArray();

		int max = arrayA.length >= arrayB.length ? arrayA.length : arrayB.length;

		for (int i = 0; i < max; i++) {

			if (arrayA.length > i) {
				builder.append(arrayA[i]);
			}

			if (arrayB.length > i) {
				builder.append(arrayB[i]);
			}
		}

		Integer c = Integer.valueOf(builder.toString());

		if (c > 1000000) {
			return -1;
		}

		return c;
	}

	public static void main(String[] args) {

		Integer teste = retornarC(10256, 512);
		
		System.out.println(teste);
	}


}
