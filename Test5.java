/*import java.util.*;

public class Test5 {
    public String zipString(String iniString) {
        // write code here
        HashMap<Character, Integer> m = new HashMap<Character, Integer>();
        for(int i = 0; i < iniString.length(); i++){
        	m.put(iniString.charAt(i), 0);
        }
        for(int i = 0; i < iniString.length(); i++){
        	int count = m.get(iniString.charAt(i));
        	m.put(iniString.charAt(i), count+=1);
        }
        String r = new String("");
        for(Map.Entry<Character, Integer> me : m.entrySet()){
        	r += me.getKey();
        	r += me.getValue();
        }
        return r;
    }

    public static void main(String[] args){
    	Test5 t = new Test5();
    	String result = t.zipString("aabcccccaaa");
    	System.out.println(result);
    }
}
/*HashMap两种遍历方式
1.
for(Map.Entry me : m.entrySet()) {
    t.append(me.getKey() + ": " + me.getValue() + "/n");
}
2.
Set keys = m.keySet( );
if(keys != null)
  for(String s : keys)
    t.append(s + ": " + m.get(s) + "/n");
*/

import java.util.*;

public class Test5 {
    public String zipString(String iniString) {
    	iniString += " ";
    	String a = new String("");
        // write code here
        int num = 0;
        int count = 1;

    	while(num < iniString.length() - 1){
    		if(iniString.charAt(num) == iniString.charAt(num+1)){
    			count += 1;
    			num += 1;
    			System.out.println(num);
    		}
    		else{
    			a += (new Character(iniString.charAt(num))).toString();
    			//System.out.println(count);
    			a += count;  			
    			num = num + 1;
    			count = 1;
    		}
    	}
    	return a;
    }

    public static void main(String[] args){
    	Test5 t = new Test5();
    	String result = t.zipString("qwertyuioplkjhgfdsAzxcvbNM");
    	System.out.println(result);
    }
}