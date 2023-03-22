public class MaxMini {
    public static void main(String[] args) {
        int a[]={1,3,6,9,7,2};
        int maxi =a[0];
        int mini=a[0];
        for(int i=0; i<a.length; i++){
            if (maxi<a[i]){
                maxi=a[i];
            }
        if(mini>a[i]){
            mini=a[i];
        }
    }
        System.out.println(mini);
        System.out.println(maxi);
    }
}
