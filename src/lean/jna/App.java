package lean.jna;

import lean.jna.AddInterface.myfriend;

import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;

public class App {

	public  static final AddInterface addInstance;
		
	static {
			//取得动态库路径
			String path = AddInterface.class.getResource("/").getPath()+"dll";
			//加载动态库
			System.load(path+"/DllTest.dll");
			
			addInstance= (AddInterface)Native.loadLibrary("DllTest", AddInterface.class);
		
			
	}
	public static void main(String[] args) {
		//传值调用
		System.out.println("传值 ："+addInstance.addFunction(1, 5));
		// 传字符串
		addInstance.print("aaa");
		// 传指针
		IntByReference c =new IntByReference();
		addInstance.addfunction2(1, 2, c);
		System.out.println("指针："+c.getValue());
		// 传结构体指针
		AddInterface.myfriend myBef = new AddInterface.myfriend();
	
		
		myBef.write();
		myBef.age=10;
		myBef.name="fangfang".getBytes();
		addInstance.findfrend(myBef);
		System.out.println("hersss friends "+new String(myBef.friendname).trim());
	
	}
}
