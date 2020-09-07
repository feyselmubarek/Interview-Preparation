public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length; i++){
            if(n == 0){
                return true;
            }
            
            int curr = flowerbed[i];
            
            if(curr == 0){
                if((i - 1 < 0 || flowerbed[i - 1] == 0) && 
                   (i + 1 >= flowerbed.length || flowerbed[i + 1] == 0)){
                    flowerbed[i]++;
                    n--;
                }
                
            }
            
        }
        
        return n == 0;
    }
}
