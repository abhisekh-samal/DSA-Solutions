public class sum {
	public static int sum(int[] arr) {
		if (arr == null) return 0;
		int s = 0;
		for (int v : arr) s += v;
		return s;
	}

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4};
		System.out.println(sum(a));
	}
}
