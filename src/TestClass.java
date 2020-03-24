public class TestClass {

    public  void changeArray(int[] a, int[] b){
        int[] tmp=a;
        a=b;
        b=tmp;
    }

    //对数组进行冒泡排序，flag==true升序排序 flag==false降序排序
    public void bubbleSort(int[] array,boolean flag){
        for (int index=1;index<array.length;index++){
            for (int x=array.length-1;x>=index;x--){
                if ((flag==true&&(array[x]<array[x-1]))||(flag==false&&(array[x]>array[x-1]))){
//                  if(array[x]<array[x-1]){
                    int tmp=array[x];
                    array[x]=array[x-1];
                    array[x-1]=tmp;
                }
            }
        }
        for (int val:array){
            System.out.println(val);
        }
    }
}
