import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++){
            List<Integer> innerList = new ArrayList<>();
            
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    innerList.add(1);
                }else{
                    innerList.add(result.get(i - 1).get(j) + result.get(i -1).get(j - 1));
                }
            }
            
            result.add(innerList);
        }
        
        return result;
    }
}
