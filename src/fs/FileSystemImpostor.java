package fs;

public class FileSystemImpostor implements FileSystem{
 

	public Archivo abrirArchivo(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int syncReadFile(int fd, byte[] bufferBytes, int bufferStart, int bufferEnd){
		 return 1;
	}


}
