
package foodninjacompany;

import java.util.Scanner;

/**
 *
 * @SyamimiRazmin-262060
 */
public class FoodNinjaCompany {

    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Scanner scanstr = new Scanner(System.in);

        FoodNinjaStaff staff[] = new FoodNinjaStaff[10];
        
        

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Staff ID:");
            String staff_id = scanstr.nextLine();
            System.out.print("Enter Staff Name:");
            String staff_name = scanstr.nextLine();
            System.out.print("Enter Staff Salary:");
            String staff_salary = scanstr.nextLine();
            System.out.print("Enter Staff Branch:");
            String staff_branch = scanstr.nextLine();
            
            staff[i] = new FoodNinjaStaff(staff_id, staff_name, staff_salary, staff_branch);
        }
        System.out.println("\n******************** YOUR DATA SUCCESSFULLY INSERT********************");
        System.out.println("******************************Your Data*******************************");
        System.out.println("\nID \t     NAME \t SALARY(RM)\tBRANCH");
        for (int i = 0; i < 10; i++) {
            System.out.print(staff[i].getstaffID() + "\t     |");
            System.out.print(staff[i].getstaffName() + "\t |");
            System.out.print(staff[i].getstaffSalary() + "\t   |");
            System.out.println(staff[i].getstaffBranch());
        }

    }

}
    
    
    

