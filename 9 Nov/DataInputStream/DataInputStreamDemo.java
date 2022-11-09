import java.io.*;

public class DataInputStreamDemo {
	
	 void writeFileData() throws IOException  {
		// This method input all datatypes using DataOutputStream
		try {
			FileOutputStream fio = new FileOutputStream("E:\\Datatypes.txt");  
	        DataOutputStream dis = new DataOutputStream(fio); 
	        dis.writeInt(1551);
	        dis.writeUTF("Kaustubh");
	        dis.writeBoolean(false);
	        dis.writeDouble(4223.23);
	        dis.writeFloat(123.3F);
	        dis.writeLong(7506573355L);
	        dis.writeByte(79);
	        dis.writeShort(123);
	        dis.flush();
	        dis.close();
	        fio.close();
	}
         catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}
	 void readFileData() throws Exception {
		FileInputStream fin = new FileInputStream("E:\\Datatypes.txt");
		DataInputStream data = new DataInputStream(fin);
		System.out.println("Integer data: " + data.readInt());
		System.out.println("String data: " + data.readUTF());
		System.out.println("Boolean data: " + data.readBoolean());
		System.out.println("Double data: " + data.readDouble());
		System.out.println("Float value: " + data.readFloat());
		System.out.println("Long value: " + data.readLong());
		System.out.println("Byte value: " + data.readByte());
		System.out.println("Short Value: " + data.readShort());
		fin.close();
		data.close();
	}

	public static void main(String[] args) throws Exception {
        DataInputStreamDemo Dis = new DataInputStreamDemo();
		Dis.writeFileData();
		System.out.println("Primitive Data Types are:  ");
		Dis.readFileData();
	}

}