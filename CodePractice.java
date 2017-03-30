import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class CodePractice {

	public static void main(String[] args) {
		FastReader fastReader = new FastReader();
		PrintWriter printWriter = new PrintWriter(System.out, true);
		int N = fastReader.nextInt();
		int M = fastReader.nextInt();
		int k = fastReader.nextInt();
		int val[] = new int[N];
		for (int i = 0; i < N; i++) {
			val[i] = fastReader.nextInt();
		}
		ArrayList<Integer> adjArr[] = new ArrayList[N];
		for(int i=0; i<N; i++) {
			adjArr[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			int X = fastReader.nextInt();
			int Y = fastReader.nextInt();
			adjArr[X-1].add(val[Y-1]);
			adjArr[Y-1].add(val[X-1]);
		}
		for(int i=0; i<N; i++) {
			Collections.sort(adjArr[i]);
			Collections.reverse(adjArr[i]);
		}
		for(int i=0; i<N; i++) {
			printWriter.println(adjArr[i].get(k-1));
		}
	}

	static class FastReader
	{
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException  e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

}
