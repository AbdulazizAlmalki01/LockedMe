import java.io.File;
import java.util.ArrayList;

public class Main {
	 static String devName = "Abulaziz Almalki";
	 static ArrayList<File> Folder = new <File>ArrayList();
	 //static File Folderf[] ;
	public static void main(String[] args) {
		
		File a = new File("notes.txt") ;
		File b = new File("info.txt") ;
		File c = new File("table.txt") ;
		//Folderf[0] = a;
		
		Folder.add(a);
		Folder.add(b);
		Folder.add(c);
		
		System.out.println("Welcome to LockedMe!");
		System.out.println("Devopled by "+ devName);
		FilesSS.MainOptions();
		//System.out.println(Main.Folder.get(0));

	}

}
