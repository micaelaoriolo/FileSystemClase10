package fs;

public interface FileSystem {
	
	 int syncReadFile(int fd, byte[] bufferBytes, int bufferStart, int bufferEnd);

}
