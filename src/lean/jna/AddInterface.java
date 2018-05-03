package lean.jna;

import java.util.ArrayList;
import java.util.List;

import com.sun.jna.Library;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;

public interface AddInterface extends Library {

	public static class myfriend extends Structure{
		public static class ByRef extends myfriend implements Structure.ByReference{
			
		}
		public int age;
		public byte[] name=new byte[60];
		public byte[] friendname = new byte[60];
		@Override
		protected List getFieldOrder() {
			List<String> field = new ArrayList<String>();
			field.add("age");
			field.add("name");
			field.add("friendname");
			return field;
		}
		
	}
	/**
	 *  
	 * @param a
	 * @param b
	 * @return a+b
	 */
	int addFunction(int a,int b);
	
	void print(String a);
	
	void addfunction2(int a ,int b, IntByReference c);
	
	void findfrend(myfriend mf);
   
}
