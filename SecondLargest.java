import javax.sound.sampled.SourceDataLine;

public class SecondLargest {
    public static void main(String[] args) {
        
        int[] a={6,8,2,4,3,1,5,7};
        

        int temp;
        for(int i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){

                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
    
    }
    System.out.println("second largest element is " +a[1]);

}  
}
