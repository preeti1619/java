public class duplicate {
   public static void main(String[] args) {
    int a[]={3,4,5,6,7,7,8,8};
    int temp[]=new int[a.length];
    int j=0;
    for(int i=0;i<a.length-1;i++){
        if(a[i]!=a[i+1]){
            temp[j]=a[i];
            j++;
        }
    }
        temp[j]=a[a.length-1];
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
    
   } 
}
