//exercise 5.25
import java.util.Scanner;
class Main {
public static void main(String[] args) {
char asteriskSign = '*';

Scanner input = new Scanner(System.in);

System.out.println("Please enter an odd number between 1 and 19? "); //prompt user for input
int number = input.nextInt();

//validate input
if (number>=1 && number<=19 && number%2 != 0){
/*Since I will be running two separate for loops, one for counting up and one for counting down, I will be dividing the input value by 2 and starting the first for loop at one less than the second for loop, so the first loop runs one more time than the second loop. */
 //number /=2;
 //count up
 for(var i = 1; i<= number; i+=2){
for(var j = 1; j<= i; j++){
System.out.print(asteriskSign);
 }System.out.println();
 }


//counting down
 for(var i = number -2 ; i>= 1; i-=2){
for(var j = 1; j<= i; j++){
System.out.print(asteriskSign);
 }System.out.println();
 }
//if no valid input, display this:
 }else{
System.out.println("Please enter an odd number between 1 and 19");
 }
}
}//END PROGRAM