package javaApp;

public class EvenSum {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int even[] = new int[num];
        int sum = 0,j = 0;
        String evennums = "";
        //Insert your code here

        for (j = 0; j < num; j++) {
if(num%2==0) {
even[j]=num;
sum=sum+num;
args[j]= Integer.toString(num);
}
evennums=String.join(",", args);
}

        System.out.println(evennums);
        System.out.println(sum);
    }
}  
