/** Simple program that asks the user for gender and age and outputs the current stage of life**/
import java.util.Scanner;
public class Age
{

   public static void main(String[] args)
   {
      Scanner read = new Scanner(System.in);
      int age;
      char gender;
      boolean ok; //used for the case when the gender input is incorrect
      do
      {
         ok = true; //we assume that the input is good
         System.out.println("Insert the gender(M or F): ");
         String line = read.nextLine();
         line = line.toLowerCase();//lowering the input string just in case
         gender = line.charAt(0);//taking out the first letter representing the gender assuming that the user set a good input, not just a String that starts with m/M/f/F 
         switch (gender)
         {
            case 'm':
            {
               boolean ok2; //used for the case when the age input is incorrect
               do
               {
                  ok2 = true;//we assume that the input is good
                  System.out.print("Insert the age: ");
                  age = read.nextInt();
                  int ageIndex = 0;
                  //dividing age periods
                  if (age >= 0 && age <= 12)
                     ageIndex = 1;
                  else if (age > 12 && age <= 18)
                     ageIndex = 2;
                  else if (age > 18 && age <= 65)
                     ageIndex = 3;
                  else if (age > 65)
                     ageIndex = 4;
                  switch (ageIndex)
                  {
                     case 1:
                     {
                        System.out.println("You are a boy of age: " + age);
                        break;
                     }
                     case 2:
                     {
                        System.out.println(
                              "You are a male teenager of age: " + age);
                        break;
                     }
                     case 3:
                     {
                        System.out.println("You are a man of age: " + age);
                        break;
                     }
                     case 4:
                     {
                        System.out
                              .println("You are a male senior of age: " + age);
                        break;
                     }
                     default:
                     {
                        System.out.println("Wrong input!");
                        ok2 = false;//if the age input is illegal we change the flag
                        break;
                     }
                  }
               }
               while (!ok2);//staying in loop while the age input is wrong
               break;
            }
            case 'f':
            {
               boolean ok2;
               do
               {
                  ok2 = true;//used for the case when the age input is incorrect
                  System.out.print("Insert the age: ");
                  age = read.nextInt();
                  //dividing age periods
                  int ageIndex = 0;
                  if (age >= 0 && age <= 12)
                     ageIndex = 1;
                  else if (age > 12 && age <= 18)
                     ageIndex = 2;
                  else if (age > 18 && age <= 65)
                     ageIndex = 3;
                  else if (age > 65)
                     ageIndex = 4;
                  switch (ageIndex)
                  {
                     case 1:
                     {
                        System.out.println("You are a girl of age: " + age);
                        break;
                     }
                     case 2:
                     {
                        System.out.println(
                              "You are a female teenager of age: " + age);
                        break;
                     }
                     case 3:
                     {
                        System.out.println("You are a woman of age: " + age);
                        break;
                     }
                     case 4:
                     {
                        System.out.println(
                              "You are a female senior of age: " + age);
                        break;
                     }
                     default:
                     {
                        System.out.println("Wrong input!");
                        ok2 = false;//if the age input is illegal we change the flag
                        break;
                     }
                  }
               }
               while (!ok2);//staying in loop while the age input is wrong
               break;
            }
            default:
            {
               System.out.println("Wrong input!");
               ok = false;//if the gender input is illegal we change the flag
               break;
            }
         }

      }
      while (!ok);//staying in loop while the gender input is wrong
      read.close();
   }

}
