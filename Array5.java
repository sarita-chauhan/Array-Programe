public class Array5 {
    public static void main(String[] args) {
        int a[]={4,7,12,11,20,25};
        int sum=0;
        for (int i=0;i<6;i++){
            if(a[i]%2==0){
                sum=sum+a[i];
            }

        }
        System.out.println(sum);
    }
}
 b