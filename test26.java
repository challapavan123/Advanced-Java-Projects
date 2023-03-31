//use of channel and and buffer to write a file
import java.io.RandomAccessFile;
import java.nio.*;
public class test26 {

	public static void main(String[] args) throws Exception{
		String data="mobile-iphoe 14, price-80k, okia 2600, price-2600";
		RandomAccessFile file = new RandomAccessFile("C:\\pavan\\amazon.store","rw");
		
		ByteBuffer buffer = ByteBuffer.allocate(data.length());
		System.out.println("contents of buffer: "+buffer.getChar(2));
		for (int i = 0; i < data.length(); i++) {
			buffer.put((byte) (data.charAt(i)));
		}
		for (int i = 0; i < data.length(); i++) {
		System.out.println("contents of buffer: "+(char)buffer.get(i));

	}

}}
