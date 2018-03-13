import java.util.*;

public class Test2 {
    public String reverseString(String iniString) {
        // write code here
        String s = new String("");
        for(int i = iniString.length() - 1; i >=0 ; i--){
        	s += (new Character(iniString.charAt(i))).toString();
        }
        return s;
    }
    

    public static void main(String[] args){
    	Test2 t = new Test2();
    	String result = t.reverseString("This is nowcoder");
    	System.out.println(result);
    }
}