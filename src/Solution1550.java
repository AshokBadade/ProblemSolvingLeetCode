public class Solution1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length ;
        boolean odds[] = new boolean[n] ;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                odds[i]=false ;
            }
            else{
                odds[i]=true ;
            }
        }

        int count=0 ;
        for(int i=0;i<n;i++){
            if(odds[i]){
                count++;
            }
            else{
                count=0 ;
            }

            if(count==3){
                return true ;
            }
        }

        return false ;
    }
}
