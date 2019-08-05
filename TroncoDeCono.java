import java.util.Scanner;
/**
 * Write a description of class TroncoDeCono here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TroncoDeCono
{
    
    public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       //radio superior del tronco de cono
       System.out.println("Ingrese el valor r:");
       double r=Double.parseDouble(input.nextLine());
       
       //Radio base del cono
       System.out.println("Ingrese el valor R:");
       double R=Double.parseDouble(input.nextLine());
       
       //Altura del tronco
       System.out.println("Ingrese el valor h:");
       double h=Double.parseDouble(input.nextLine());
       
       //volumen del tronco
       double volume=(Math.PI/3)*(r*r+r*R+R*R)*h;
       System.out.printf("Volumen del tronco de cono :%.2f",volume);
       
      
    
   }
   }
   

