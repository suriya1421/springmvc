import java.io.File;

public class DeleteFile {
	public static void main(String args[]) {
		{
			File file=new File("D:\\File IO programs\\abii\\suriya.txt");
			file.delete();
			boolean present=file.exists();
			System.out.println(present);
			
			}
	}

}
