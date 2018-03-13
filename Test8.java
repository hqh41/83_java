import java.util.*;

public class Test8 {
    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        String temp = s1 + s1;
        return temp.contains(s2);
    }

    public static void main(String[] args){
    	Test8 t = new Test8();
    	boolean b = t.checkReverseEqual("Hello world", "worldHello ");
    	if(b == true)
    		System.out.println(true);
    	else
    		System.out.println(false);
    }
}