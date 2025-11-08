/*   Кальмин Глеб 24-ИС-8
      ЗАДАНИЕ ИЗ Л.4 */
import java.util.Scanner;
public class Main { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
System.out.println("Число для перевода в дюймы:"); 
if (sc.hasNextInt()) { 
double number = sc.nextInt(); 
double meters = number * 0.0254;
System.out.println(number + " дюйма это - " + meters +" метра");
} else { 
System.out.println("Это не число. Перезапустите программу и попробуйте снова!"); 
sc.close();
} 
}}  