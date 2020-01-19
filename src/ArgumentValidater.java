
public class ArgumentValidater {

	ErrorResult errorResult = ErrorResult.getInstance();

	public void validate(String fileName, int targetColumn, int sortType) {
		if (fileName.length() > 200) {
			errorResult.addErrorMessageOfArgument(1);
		}
		if (targetColumn < 1 || 5 < targetColumn) {
			errorResult.addErrorMessageOfArgument(2);
		}
		if (sortType != 1 || sortType != 2 ) {
			errorResult.addErrorMessageOfArgument(3);
		}
	}

}
