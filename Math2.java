public class Math2 
{
    public static void main(String[] args){
        int nValue = 50;
        outercolumn : for(int i = 2;i <= nValue;i++){
            for(int j= 2;j<=Math.sqrt(i);j++){
                if(i % j == 0)
                
                    continue outercolumn;
                
            }
            System.out.println(i);
        }
    }

}
