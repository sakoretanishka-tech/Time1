public class Time{
    static void Array(){
        int[]arr=new int[10];
        for(int i=0 ; i<10; i++){
            arr[i]=i+1;
        }
    }
    public static void main(String[]args){
        long startTime = System.nanoTime();
        Array();
        long endTime = System.nanoTime();
        long timetaken =  endTime-startTime;

        System.out.println("Time taken:" +timetaken + "nanoseconds");
    }
}