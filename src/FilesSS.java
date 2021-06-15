
import java.util.*;
import java.io.*;



public class FilesSS {
	static Scanner s = new Scanner(System.in);
	
	 static void MainOptions() {
		 
		 System.out.println("[list]  show the files that you have.\n[sch]  search for a file name in the folder.\n[adf]  add a file to the folder.\n[del]  delete a file from the folder.\n");
		 String in;
		 in = s.nextLine();
		 switch(in) {
		 
		 case "list":
		 ListFiles();break;
		 
		 case "sch":
		 SearchFile();break;
		 
		 case "adf":
		 AddFile();break;
		 
		 case "del":
		 DeleteFile();break;
		 
		 //========
		 
		 default:  System.out.println("Invaild input try again\n"); MainOptions();break;
		 
		 }
		 
	 }
	 
	 static void AddFile() {
		 System.out.println("Enter the file name you want to create: ");
		 
		 try {
		 String fileName = s.nextLine();
		 File file = new File(fileName+".txt");
		 
		 
		 if(file.exists()) { 
			 System.out.println("File name already exist! try another\n");
			 AddFile();
		 }
		 else {
			 file.createNewFile();
			 Main.Folder.add(file);
			 System.out.println("File has been added.\n");
			 AddAgain();
		 }}
		 catch(IOException e){
			e.printStackTrace();
		 }
		 
		 

		 
	 }
	 static void ListFiles() {
		 
		 Collections.sort(Main.Folder);
		 for(int i=0;i< Main.Folder.size();i++) {
			 System.out.println(Main.Folder.get(i));
			 }
		 
		 MainOptions();
	 }
	 static void SearchFile() {
		 String an; 
		 System.out.println("what is the file name you want to search for? :");
		 an = s.nextLine();
		 for(int i=0;i<Main.Folder.size();i++) {
			 if(an.equals(Main.Folder.get(i).getName())) {
				 System.out.println("This is your searched file:" + Main.Folder.get(i));
				 SearchAgain();
			 }
			 
		 }
		 System.out.println("File not found!\n");
		 SearchAgain();
	 }
	 static void DeleteFile() {
		
		 System.out.println("Enter the name you want to delete: ");
		 String an = s.nextLine();
		 for(int i = 0;i<Main.Folder.size();i++) {
			 if(an.equals(Main.Folder.get(i).getName()) ) {
				 
				 Main.Folder.get(i).delete();
				 Main.Folder.remove(i);
				 System.out.println("File has been deleted\n");
				 DelAgain();
				
				 
			 }
			 } System.out.println("File not found!\n"); 
		 	DelAgain();
			 
			 
			 
		 
		 
		 
	 }
	 
	 static void DelAgain() {
		 System.out.println("do you stll want to delete a file?   (y/n)");
		 String an = s.nextLine();
		 
		 switch(an) {
		 case "y":
			 DeleteFile();break;
		 case "n":
			 MainOptions();break;
		 default : System.out.println("wrong input returning to the main options!\n");MainOptions();break;}
	 }
	 
	 static void AddAgain() {

		 System.out.println("do you still want to add a file?   (y/n)");
		 String an = s.nextLine();
		 
		 switch(an) {
		 case "y":
			 AddFile();break;
		 case "n":
			 MainOptions();break;
		 default : System.out.println("wrong input returning to the main options\n");MainOptions();break;
			 
		 }
		 
	 }
	 
	 static void SearchAgain() {
		 String an;
		 System.out.println("do you want to search again?: ");
		 an = s.nextLine();
		 switch(an) {
		 case "y":SearchFile();
		 break;
		 case "n":MainOptions();
		 break;
		 default: System.out.println("wrong input returning to the main options\n");MainOptions();break;
		 }
	 }

}

