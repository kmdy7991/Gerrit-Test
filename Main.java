package solve;

import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {
	static Function<String, Integer> stoi = Integer::parseInt;
	static int n, m;
	static Map<Integer, Integer> saveSize;

	public static void main(String[] args) {
		try {
			sol();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void sol() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = stoi.apply(in.readLine());
		int m = stoi.apply(in.readLine());

		if (n > 0 && m > 0) {
			System.out.println(1);
		} else if (n > 0 && m < 0) {
			System.out.println(4);
		} else if (n < 0 && m > 0) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
	}
}