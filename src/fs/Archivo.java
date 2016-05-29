package fs;

public class Archivo {
	private String path;
	private String contenido;
	private int fd;
	private FileSystem fileSystem;
	
	public Integer leerSincArchivo(Buffer buffer){
		return Integer.valueOf(fileSystem.syncReadFile(this.fd, buffer.getBuffer(), 
				buffer.getBufferStart(), buffer.getBufferEnd()));
	}

	
	
}
