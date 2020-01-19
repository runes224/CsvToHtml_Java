
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String fileName = args[0];
		int targetColumn = Integer.parseInt(args[1]);
		int sortType = Integer.parseInt(args[2]);

		System.out.println(fileName);
		System.out.println(targetColumn);
		System.out.println(sortType);

		ErrorResult errorResult = ErrorResult.getInstance();
//		errorResult.addErrorMessageOfArgument(1);
//		errorResult.addErrorMessageOfHeader();
//		errorResult.addErrorMessageOfData("id",2);
//		errorResult.addErrorMessageOfData("title",3);
//		errorResult.addErrorMessageOfData("rating",1);
//		errorResult.addErrorMessageOfData("rental_rate",4);

		ArgumentValidater argumentValidater = new ArgumentValidater();
		argumentValidater.validate(fileName, targetColumn, sortType);

		CsvReader csvReader = new CsvReader();
		csvReader.readData(fileName);

		System.out.println(errorResult.getErrorResult());

	}

}
