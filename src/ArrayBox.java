public class ArrayBox<E> {

    public static final int BOX_CAPACITY=2;
    public Object[] box;
    public int index = 0;

    public ArrayBox() {
        box=new Object[BOX_CAPACITY];
    }

    public ArrayBox(int capacity) {
        box = new Object[capacity];
    }

    //存储元素超过数组容量，进行数组扩容
    private void ensureCapacity(){
        Object[] newBox = new Object[box.length<<2];
        for (int i=0;i<box.length;i++){
            newBox[i]=box[i];
        }
        box=newBox;
    }

    //增：存储元素
    public void add(E val){
        //如果index等于数组长度，就扩容
        if (index==box.length){
            ensureCapacity();
        }
        box[index++]=val;

    }

    //轮询数组
    public void travelsalBox(){
        for (int i=0;i<this.index;i++){
            System.out.print(box[i]+"\t");
        }
    }
    //查：获取位置上的元素
    public E getBox(int index) throws BoxIndexOutOfBoundsException {
        if (index<0 || index>=this.index){
            throw new BoxIndexOutOfBoundsException("error");
        }
        return (E)box[index];
    }

    //删：删除元素，提供位置，返回删除元素
    public E deleteBox(int index) throws BoxIndexOutOfBoundsException {
        E val = null;
        if (index<0 || index>=this.index){
            throw new BoxIndexOutOfBoundsException("error");
        }

        //找到要删除的元素，并把该元素后的元素依次往前移
        val = (E)box[index];
        if (index!=this.index-1){//如果删除的不是最后一个元素，后面元素复制给前一个元素
            for (int j=index;j<this.index-1;j++){
                box[j]=box[j+1];
            }
        }

        box[this.index-1]=0; //最后一个不为空元素值=0
        this.index--;//如果删最后一个元素，index直接减少一个就行
                    //属性与形参同名时，一定注意区分
        return val;
    }
    //返回个数
    public int num(){
        return index;
    }

    public static void main(String[] args) throws BoxIndexOutOfBoundsException {
        ArrayBox arrayBox = new ArrayBox<Double>();
        arrayBox.add(10.8);
        arrayBox.add(99.1);
        arrayBox.add(97.5);

        System.out.println("size: "+arrayBox.num());
        System.out.println(arrayBox.getBox(2));
        double val = (Double) arrayBox.deleteBox(1);
        System.out.println("size: "+arrayBox.num());

        System.out.println("delete: "+val);
                arrayBox.travelsalBox();

    }
}
