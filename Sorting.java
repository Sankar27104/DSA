public class Sorting {
    public static void main(String[] args){
        int arr[] = {5,6,2,4,1,3,76,3};
        System.out.print("Unsorted array: ");
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("\nSorted array: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
