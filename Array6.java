public class Array6 {
    public static void main(String[] args) {
        int a[]={3,5,6,8,10,11};
        int sum=0;
        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=1;j<=a[i];j++){
                if(a[i]%j==0){
                    count++;
                }
            }
            if(count==2){
                sum=sum+a[i];
            }
        }
        System.out.println(sum);
    }
}
