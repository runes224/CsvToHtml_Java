import java.util.HashMap;
import java.util.Map;

public class ErrorResult {

	private static final ErrorResult errorResultInstance = new ErrorResult();

	private ErrorResult() {}

	public static ErrorResult getInstance() {
		return errorResultInstance;
	}

	private String errorResult = "";

	public String getErrorResult() {
		return errorResult;
	};

//    // Mapの宣言
//    Map<String, String> map = new HashMap<String, String>();
//
//    // Mapにキーと値を格納
//    map.put("1", "id");
//    map.put("2", "title");
//    map.put("3", "rating");
//    map.put("4", "rental_rate");
//    map.put("5", "release_date");

	public void addErrorMessageOfArgument(int header, int num) {
		switch (num) {
		case 1:
			errorResult += "エラー：ファイル名は200文字以内で設定してください。" + "\r\n";
			break;
		case 2:
			errorResult += "エラー：ソート対象の列指定が正しくありません（指定可能な範囲＝1～5）。" + "\r\n";
			break;
		case 3:
			errorResult += "エラー：ソート方法の指定が正しくありません（指定可能な範囲＝1～2）。" + "\r\n";
			break;
		case 4:
			errorResult += "エラー：ファイルが見つかりませんでした。" + "\r\n";
		}

	}

	public void addErrorMessageOfArgument(int num) {
		switch (num) {
		case 1:
			errorResult += "エラー：ファイル名は200文字以内で設定してください。" + "\r\n";
			break;
		case 2:
			errorResult += "エラー：ソート対象の列指定が正しくありません（指定可能な範囲＝1～5）。" + "\r\n";
			break;
		case 3:
			errorResult += "エラー：ソート方法の指定が正しくありません（指定可能な範囲＝1～2）。" + "\r\n";
			break;
		case 4:
			errorResult += "エラー：ファイルが見つかりませんでした。" + "\r\n";
		}

	}

	public void addErrorMessageOfHeader() {
		errorResult += "エラー：ヘッダーの値もしくは列の順序が正しくありません。" + "\r\n";
	}

	public void addErrorMessageOfData(String column, int num) {
		switch (column) {
		case "id":
			switch (num) {
			case 1:
				errorResult += "エラー：id列に空欄の行があります。" + "\r\n";
				break;
			case 2:
				errorResult += "エラー：id列は半角で入力してください。" + "\r\n";
				break;
			case 3:
				errorResult += "エラー：id列は数字で入力してください。" + "\r\n";
				break;
			case 4:
				errorResult += "エラー：id列のデータが重複しています。" + "\r\n";
				break;
			case 5:
				errorResult += "エラー：id列は1~999の範囲で入力してください。" + "\r\n";
			}
			break;
		case "title":
			switch (num) {
			case 1:
				errorResult += "エラー：title列に空欄の行があります。" + "\r\n";
				break;
			case 2:
				errorResult += "エラー：title列は文字列で入力してください。" + "\r\n";
				break;
			case 3:
				errorResult += "エラー：title列は128文字以内で入力してください。" + "\r\n";
			}
			break;
		case "rating":
			switch (num) {
			case 1:
				errorResult += "エラー：rating列は半角で入力してください。" + "\r\n";
				break;
			case 2:
				errorResult += "エラー：rating列は「G」「PG」「PG-12」「R」「R-15」を指定してください。" + "\r\n";
			}
			break;
		case "rental_rate":
			switch (num) {
			case 1:
				errorResult += "エラー：rental_rate列に空欄の行があります。" + "\r\n";
				break;
			case 2:
				errorResult += "エラー：rental_rate列は半角で入力してください。" + "\r\n";
				break;
			case 3:
				errorResult += "エラー：rental_rate列は数字で入力してください。" + "\r\n";
				break;
			case 4:
				errorResult += "エラー：rental_rate列は0.00～9.99の範囲で入力してください。" + "\r\n";
			}
			break;
		case "release_date":
			switch (num) {
			case 1:
				errorResult += "エラー：release_date列に空欄の行があります。" + "\r\n";
				break;
			case 2:
				errorResult += "エラー：release_date列は半角で入力してください。" + "\r\n";
				break;
			case 3:
				errorResult += "エラー：release_date列はyyyy/mm/ddの形式で入力してください。" + "\r\n";
			}
		}
	}

}
