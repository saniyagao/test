public class TestRecursion {
    //递归 n!
    public static int recursionCount(int num){
        //递归头：递归结束
        if (num == 1){
            return 1;
        }
        //递归体
        return num*recursionCount(num-1);
    }

    //for循环 n!
    public static int forRecursion(int num){
        int sum=1;
        for (int i=1;i<=num;i++){
            sum*=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        System.out.println(recursionCount(10));
        long l2=System.currentTimeMillis();
        System.out.println(l2-l1);

        long l3=System.currentTimeMillis();
        System.out.println(forRecursion(10));
        long l4=System.currentTimeMillis();
        System.out.println(l4-l3);

        System.out.println();
        System.out.println("hello");
    }
}
