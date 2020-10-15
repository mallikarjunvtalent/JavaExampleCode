package strings;

public class UniqueValues {

	public static void main(String[] args) {

		String str = "my name is mallikarjun";
		StringBuilder builder = new StringBuilder(str);

		for (int i = 0; i < builder.length(); i++) {

			int count = 0;

			for (int j = i + 1; j < builder.length(); j++) {
				if (builder.charAt(i) == builder.charAt(j)) {
					builder.deleteCharAt(j);
					j--;
					count++;
				}
			}
			if (count >=1) {
				builder.deleteCharAt(i);
				i--;
			}
		}
		System.out.println(builder);

		System.out.println(builder.charAt(0));
System.out.println(builder.charAt(0));

	}

}
