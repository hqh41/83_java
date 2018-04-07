import java.util.*;

public class Test3 {
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        int i = 0;
        String[] aa = stringA.split(" ");
        String[] bb = stringB.split(" ");
        if(aa.length != bb.length)
        	return false;
        else{
        	for(String ele : aa){
        		for(String e : bb){
        			if(ele.equals(e)){
        				i += 1;
        				break;
        			}
        		}
        	}
        	if(i == aa.length)
        		return true;
        }
        return false;
    }

    public static void main(String[] args){
    	Test3 a = new Test3();
    	boolean result = a.checkSam("this is is is Nowcoder", "is this is is Nowcoder");
    	if(result)
    		System.out.println("true");
    	else
    		System.out.println("false");
    }
}
