import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Counter counter = new Counter();
        Scanner sc = new Scanner(System.in);
        System.out.println("Pls input num1:");
        int num1 = Integer.parseInt(sc.nextLine());
        int sum=0;
        while (true){
            System.out.println("pls input mark(+ - * /):");
            String mark = sc.nextLine();
            System.out.println("pls input num2:");
            int num2=Integer.parseInt(sc.nextLine());
            num1 = counter.count(num1,mark,num2);
        }








//        Scanner sc = new Scanner(System.in);
//        int finalString;
//        System.out.print("please input first number: ");
//        finalString = Integer.parseInt(sc.next());
//        while (true){
//            System.out.println("please input your fuction {+,-,/,*}: ");
//            String function = sc.next();
//            System.out.println("please input your next number: ");
//            int sencod = Integer.parseInt(sc.next());
//            if(function.equals("+")){
//                System.out.println(finalString+sencod);
//                finalString += sencod;
//            }else if(function.equals("-")){
//                System.out.println(finalString-sencod);
//                finalString -= sencod;
//            }else if(function.equals("*")){
//                System.out.println(finalString*sencod);
//                finalString*=sencod;
//            }else if(function.equals("/")){
//                System.out.println(finalString/sencod);
//                finalString/=sencod;
//            }else {
//                System.out.println("input fource, please retry input your fuction {+,-,/,*}: ");
//                function = sc.next();
//            }
//        }

    }
}
