public class FindSingeRep {
    public static void main(String[] args) {
        
        int[] a={5,3,4, 5,2,3,4};

        int res=a[0];//      res=result
        for(int i=1; i<a.length;i++){

                   res=res^a[i];
        
        }
        System.out.println("single repeated element is"+res);
          
    }
}
