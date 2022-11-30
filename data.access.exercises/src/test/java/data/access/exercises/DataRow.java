package data.access.exercises;

public interface DataRow {
	String[] GetColumns();
	
	String getCellValue(String columnName);
}
