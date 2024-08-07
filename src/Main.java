
public class Main {
    public static void main(String[] args) {


        for(int i = 1;i<=100;i++){
            if( i > 1){
                boolean asalMi = true;
                for(int j = 2;j<= i / 2;j++){
                    if(i % j == 0){
                        asalMi = false;
                        break;
                    }
                }
                if(asalMi){
                    System.out.println(i);
                }
            }
        }
    }
}