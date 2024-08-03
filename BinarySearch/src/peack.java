public class peack {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        int t=3;
        int ans=peakElement(arr,t);
        System.out.println(ans);
    }
    public static int peakElement(int[] arr,int n)
    {
        //add code here.
        //add code here.
        int s=0;
        int e=n-1;

        while(s< e){
            int mid=s + (e-s)/2;
            if(arr[mid]>arr[mid+1]){
                e=mid;
            }
            else{
                s=mid+1;
            }

        }
        return s;
    }
}