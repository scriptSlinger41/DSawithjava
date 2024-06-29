// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Selectionsort {
    public static void main(String[] args) {
        int arr[]={4,6,8,3,1};
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            int mini=i;
            
            for(int j=i+1;j<arr.length;j++){
                if(arr[mini]>arr[j]){
                    mini=j;
                    
                }
                temp=arr[i];
                arr[i]=arr[mini];
                arr[mini]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
