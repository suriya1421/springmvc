import java.io.File;

public class ListOfFilesAndFolders {
	public static void main(String args[]) {
		File file = new File("C:\\Users\\suri3122\\Desktop");
		String[] list=file.list();
		for(int i=0;i<list.length;i++) {
			System.out.println(list[i]);
		}

}
}