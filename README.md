
# Novem
public static int BinarySearch(String[] inputArray, String key) {
		int min = 0, mid, max = inputArray.length;

		for (int i = 0; i < inputArray.length; i++) {
			mid = (min + max) / 2;
			if ((inputArray[mid].compareTo(key)) == 0) {
				return mid;
			} else if ((inputArray[mid].compareTo(key)) > 0) {
				max = max - 1;
			} else {
				min = min + 1;
			}
		}

		return 0;
	}






