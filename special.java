import java.util.Scanner;  
public class special { 
public static void main(String args[])  
{  
int num, number, last_digit, sum_Of_Fact = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number: ");  
//reads an integer from the user  
number = sc.nextInt();  
num = number;  
//executes until the condition becomes false  
while (number > 0)  
{  
//finds the alst digit from the given number      
last_digit = number % 10;  
//variable stores factorial   
int fact=1;  
//factorial logic  
for(int i=1; i<=last_digit; i++)  
{  
//calculates factorial       
fact=fact*i;  
}  
//calculates the sum of all factorials  
sum_Of_Fact = sum_Of_Fact + fact;  
//divides the number by 10 and removes the last digit from the number  
number = number / 10;  
}  
//compares the sum with the given number  
if(num==sum_Of_Fact)  
{  
System.out.println(num+ " is a special number.");  
}  
else  
{  
System.out.println(num+ " is not a special number.");  
}  
}  
}  