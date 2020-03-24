public class Counter {
    private int sum;

    public int add(int num1,int num2){
        sum = num1+num2;
        return sum;
    }
    public int sub(int num1,int num2){
        sum=num1-num2;
        return sum;
    }
    public int multi(int num1,int num2){
        sum=num1*num2;
        return sum;
    }
    public int division(int num1,int num2){
        sum=num1/num2;
        return sum;
    }

    public int count(int num1,String mark,int num2){
        if (mark.equals("+")) {
            sum = add(num1, num2);
        } else if (mark.equals("-")) {
            sum = sub(num1,num2 );
        } else if (mark.equals("*")) {
            sum = multi(num1, num2);
        } else if (mark.equals("/")) {
            sum = division(num1, num2);
        }

        System.out.println(sum);
        return sum;
    }

    public int count1(String... num) {
        int num1 = Integer.parseInt(num[0]);
        for (int index = 1; index < num.length; index++) {
            if (index % 2 != 0) {
                if (num[index].equals("+")) {
                    sum = add(num1, Integer.parseInt(num[index + 1]));
                } else if (num[index].equals("-")) {
                    sum = sub(num1, Integer.parseInt(num[index + 1]));
                } else if (num[index].equals("*")) {
                    sum = multi(num1, Integer.parseInt(num[index + 1]));
                } else if (num[index].equals("/")) {
                    sum = division(num1, Integer.parseInt(num[index + 1]));
                }
                num1 = sum;
            }
        }
        return sum;
    }
}
