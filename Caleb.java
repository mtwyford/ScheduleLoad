/* borrowing from party planner work - take a simple xls file, and run a few loops to 
* clean up data, transpose long rows to multiple rows, 
* then load into a new csv file
*/

import java.io.*;

public class Caleb {

public static void main (String[] args) throws IOException {

FileWriter csvWriter = new FileWriter("new.csv");
csvWriter.append("Course Name");
csvWriter.append(",");
csvWriter.append("Requestee");
csvWriter.append(",");
csvWriter.append("Requestee Type");
csvWriter.append("\n");	

String row;  //declare string outside while loop to read in each line
BufferedReader csvReader = new BufferedReader(new FileReader("Schedulogic.csv"));
	while ((row = csvReader.readLine()) != null) {
		String[] data = row.split(",");  //splits each excel row or line of text into a String array
		// do something with the data
		//studentID: within each 'row' of excel data, print the first cell
		//System.out.print(data[0] + ":(studentID), ");  
		for (int c = 7; c<data.length; c++) {
			//prints last, then first name
			System.out.println(data[c] + ", " + data[1]+ ", " + data[2] + ", Student"); 
			csvWriter.append(data[c] + ", " + data[1]+ ", " + data[2] + ", Student \n");
		}
		System.out.print("\n");  //for each student - print name and classes each time, then print new line
}
csvReader.close();  //close reader

csvWriter.flush();  //flush buffer
csvWriter.close();  //close filewriter
}

}


