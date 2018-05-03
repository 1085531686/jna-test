package lean.jna;

import lean.jna.AddInterface.myfriend;

import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;

public class App {

	public  static final AddInterface addInstance;
		
	static {
			//ȡ�ö�̬��·��
			String path = AddInterface.class.getResource("/").getPath()+"dll";
			//���ض�̬��
			System.load(path+"/DllTest.dll");
			
			addInstance= (AddInterface)Native.loadLibrary("DllTest", AddInterface.class);
		
			
	}
	public static void main(String[] args) {
		//��ֵ����
		System.out.println("��ֵ ��"+addInstance.addFunction(1, 5));
		// ���ַ���
		addInstance.print("aaa");
		// ��ָ��
		IntByReference c =new IntByReference();
		addInstance.addfunction2(1, 2, c);
		System.out.println("ָ�룺"+c.getValue());
		// ���ṹ��ָ��
		AddInterface.myfriend myBef = new AddInterface.myfriend();
	
		
		myBef.write();
		myBef.age=10;
		myBef.name="fangfang".getBytes();
		addInstance.findfrend(myBef);
		System.out.println("hersss friends "+new String(myBef.friendname).trim());
	
	}
}
