import java.util.Arrays;
import java.util.regex.Pattern;

public class DataValidator {
	ErrorResult errorResult = ErrorResult.getInstance();

	public void validate(String data[], int arr) {
		System.out.println(arr);
		if (arr == 0) {

//			System.out.println(data);
//			for (int i = 0; i < data.length ; i++) {
//				System.out.println(data[i]);
//				}


			String[] header = new String[5];
			header[0] = "id";
			header[1] = "title";
			header[2] = "rating";
			header[3] = "rental_rate";
			header[4] = "release_date";

			System.out.println(data[0]);
			System.out.println(data[1]);
			System.out.println(data[2]);
			System.out.println(data[3]);
			System.out.println(data[4]);
			System.out.println(arr);

//			for (int i = 0; i < header.length ; i++) {
//				System.out.println(header[i]);
//			}
//			System.out.println(Arrays.equals(data, header));
			System.out.println(data[0].equals(header[0]));
			System.out.println(data[1].equals(header[1]));
			System.out.println(data[2].equals(header[2]));
			System.out.println(data[3].equals(header[3]));
			System.out.println(data[4].equals(header[4]));
			System.out.println(data.length);
			System.out.println(header.length);

			if (Arrays.equals(data, header)) {
				errorResult.addErrorMessageOfHeader();

			}
		}else {
			// id列のバリデーション
			if (data[0].isEmpty()) {
				errorResult.addErrorMessageOfData("id", 1);
			}
			if (!(isHalfNumeric(data[0]))) {
				errorResult.addErrorMessageOfData("id", 2);
			}

		}
	}

	public static boolean isHalfNumeric(String str) {
        return Pattern.matches("^[0-9]*$", str);
    }

}

// Headerのバリデーション
// Headerでエラーが出たらデータのバリデーションは行わない
// csvデータのバリデーション
// equalsを使用する際にNULLチェックを行う
