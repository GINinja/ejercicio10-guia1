import java.util.Scanner;
/**
 * Write a description of class VolumenCono here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VolumenCono
{  public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       
       //radio 
       System.out.println("Enter radius-value of bottom of cone:");      
       double r=Double.parseDouble(input.nextLine());
       
       //altura
       System.out.println("Enter height,h of the cone:");
       double h=Double.parseDouble(input.nextLine());

       //calculo del volumen del cono
       double volume=(Math.PI/3)*(r*r)*h;
       System.out.printf("Volumen del cono:%.2f",volume);
   }
    
}
