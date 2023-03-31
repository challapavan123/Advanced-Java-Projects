//use of channel and and buffer to write a file
import java.io.RandomAccessFile;
import java.nio.*;
import java.nio.channels.FileChannel;
public class test26 {

	public static void main(String[] args) throws Exception{
		String data="mobile-iphone 14, price-80k,  nokia 2600, price-2600";
		RandomAccessFile file = new RandomAccessFile("C:\\pavan\\amazon.store","rw");
		
		ByteBuffer buffer = ByteBuffer.allocate(data.length());
		
		for (int i = 0; i < data.length(); i++) {
			buffer.put((byte) (data.charAt(i)));
		}

	
        FileChannel channel=file.getChannel(); 
        buffer.rewind();
		channel.write(buffer);
		System.out.println("Data written to file");
		channel.close();
		file.close();

}}
