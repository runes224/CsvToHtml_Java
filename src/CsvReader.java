import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {

	// 戻り値の宣言は修正する
	public void readData(String fileName) {

		DataValidator dataValidator = new DataValidator();
		ErrorResult errorResult = ErrorResult.getInstance();

		try {
			FileReader fr = new FileReader("C:\\Java\\Java初期研修\\Java初期研修_入力ファイル\\" + fileName + ".csv");
			BufferedReader br = new BufferedReader(fr);

			String line;
			// 何行目かを管理する
			int arr = 0;
			// 1行ずつCSVファイルを読み込む
			while ((line = br.readLine()) != null) {
				String data[] = line.split(","); // 行をカンマ区切りで配列に変換
				dataValidator.validate(data, arr);
				arr += 1;

			}
			br.close();

		} catch (IOException e) {
			errorResult.addErrorMessageOfArgument(4);
		}

	}

}