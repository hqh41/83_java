import java.util.*;

public class Test {
    public boolean checkDifferent(String iniString) {
        // write code here
        Set<String> ch = new HashSet<>();
        for(int i = 0; i < iniString.length(); i++){
            if(ch.add(new Character(iniString.charAt(i)).toString()))
                ;
            else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Test n = new Test();
        boolean result = n.checkDifferent("azertyuu");
        if (result == true)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

//对象才具有toString()方法
//Set中元素不能重复，add时元素不重复才返回true
//String没有迭代器
//容器才有迭代器.
