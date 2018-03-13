import java.util.*;

public class Test7 {
    public int[][] clearZero(int[][] mat, int n) {
        // write code here
        Vector<Vector<Integer>> v = new Vector<Vector<Integer>>(n*n);
        for(int i = 0; i < n; i++){
        	for(int j = 0; j < n; j++){
        		if(mat[i][j] == 0){
                    Vector p = new Vector();
                    p.addElement(i);
                    p.addElement(j);
        			v.addElement(p);
        		}
        	}
        }
        for(Vector ele : v){
            int i = Integer.parseInt(String.valueOf(ele.elementAt(0)));
            for(int p = 0; p < n; p++){
                mat[i][p] = 0;
            }
            int j = Integer.parseInt(String.valueOf(ele.elementAt(1)));
            for(int q = 0; q < n; q++){
                mat[q][j] = 0;
            }
        }
        return mat;
    }

    public static void main(String[] args){
    	int[][] mat = {{1, 2, 3},{0,1,2},{0,0,1}};
    	Test7 t = new Test7();
    	int[][] result = t.clearZero(mat, 3);
    	for(int i = 0; i < 3; i++){
    		for(int j = 0; j < 3; j++){
    			System.out.print(mat[i][j]);
    		}
    		System.out.println();
    	}
    }
}
//在Java中，要将Object类型转换成int类型，需要先将Object转换为String，再由String再转换为int
//String.valueOf(Object obj)是将Object类型转化为String类型
//Integer.parseInt(String s)是将String类型转化为int类型
//vector中add,addElement区别:
//add是实现List接口重写的方法，返回值为boolean。
//addElement是Vector类中的特有方法，返回值是void。