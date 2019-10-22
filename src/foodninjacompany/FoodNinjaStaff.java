
package foodninjacompany;

/**
 *
 * @SyamimiRazmin-262060
 */
public class FoodNinjaStaff {
    private String staff_id;
    private String staff_name;
    private String staff_salary;
    private String staff_branch;
    
    FoodNinjaStaff(String staff_id, String staff_name, String staff_salary, String staff_branch){
        this.staff_id = staff_id;
        this.staff_name = staff_name;
        this.staff_salary = staff_salary;
        this.staff_branch = staff_branch;
    }

    
    String getstaffID(){
        return this.staff_id;
    }
    String getstaffName(){
        return this.staff_name;
    }
    String getstaffSalary(){
        return this.staff_salary;
    }
    String getstaffBranch(){
        return this.staff_branch;
    }
    
    void setstaffName(String staff_name){
        this.staff_name = staff_name;
    }
    void setstaffSalary(String staff_salary){
        this.staff_salary = staff_salary;
    }  
    void setstaffBranch(String staff_branch){
        this.staff_branch = staff_branch;
    }  
} 



