import java.util.*;
class Main1{
    public static void main (String args[]){
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();
            if(num>0){
                System.out.println("Positive");
            }
            else if(num<0){
                System.out.println("Negative");
            }
            else{
                System.out.println("Zero");

            }
            int val =num%7;
            switch(val){
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Give correct input");
                    break;
                    
            }
            for(int i=1;i<=num;i++){
                System.out.print(i+" ");
            }
            System.out.println();
            val=num;
            while(val>0){
                System.out.print(val+" ");
                val--;
            }
            System.out.println();
            do{
                val++;
                System.out.print(val+" ");
            }while(val<=2);
      }
}