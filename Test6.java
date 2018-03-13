import java.util.*;
import java.lang.reflect.Field;

public class Test6 {
	public void swap(Integer a, Integer b){
		Class<Integer> integerClass = (Class<Integer>)a.getClass();
		try{
			Field value = integerClass.getDeclaredField("value");
			value.setAccessible(true);
			int tmp = a;
			value.setInt(a, b);
			value.setInt(b, tmp);
		}
		catch(NoSuchFieldException e){
			e.printStackTrace();
		}
		catch(IllegalAccessException e){
			e.printStackTrace();
		}
	}

    public Integer[][] transformImage(Integer[][] mat, int n) {

        // write code here
        for(int i = 0; i < n/2; i++){
        	for(int j = 0; j < n; j++){
        		swap(mat[i][j], mat[n-1-i][j]);
        	}
        }
        for(int i = 0; i < n ; i++){
        	for(int j = i+1; j < n; j++){
        		swap(mat[i][j], mat[j][i]);
        	}
        }
        return mat;
    }

    public static void main(String[] args){
    	Integer[][] mat = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
    	Test6 t = new Test6();
    	t.transformImage(mat, 3);
    	for(int i = 0; i < 3; i++){
    		for(int j = 0; j < 3; j++){
    			System.out.print(mat[i][j]);
    		}
    		System.out.println("\n");
    	}
    }
}
//对象的传递是引用传递（和C++中的引用不同），也是一个副本，在函数中修改值也达不到交换目的。
//传进去的参数必须是Integer，不能靠int转换 