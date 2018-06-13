public abstract class Employee {

    private String name;
    private double baseSalary;
    private static int employeeId;
    private String manager;

    public Employee(String name,double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName(){
        return name;
    }

//    public String getManager(){
//
//    }

    public boolean equals(Employee other){
        return other.getEmployeeId() == this.getEmployeeId();
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getEmployeeId(){
        return employeeId+1;
    }

    public abstract String employeeStatus();


    public String toString(){
        return String.valueOf(getEmployeeId())+getName();
    }


}

class TechnicalEmployee extends Employee{

    private String name;
    private double baseSalary;
    private int checkIn;

    public TechnicalEmployee(String name){
        super(name,7500);
        this.name = name;
        baseSalary = 75000;
        checkIn = 0;
        }

    public void setCheckIn(){
        checkIn += 1;
    }

    public int getCheckIn(){
        return checkIn;
    }

    public String employeeStatus(){
        return String.valueOf(getEmployeeId()) + getName() + " has "+getCheckIn()+" successful check ins";
    }

}

class TechnicalLead extends TechnicalEmployee{

    private String name;
    private double baseSalary;

    public TechnicalLead(String name){
        super(name);

    }

}

class SoftwareEngineer extends TechnicalEmployee{

    private boolean access;
    private boolean approve;

    public SoftwareEngineer(String name){
        super(name);
    }

    public boolean getCodeAccess(){
        return access;
    }

    public void setAccessCode(boolean access){
        this.access = access;
    }

    public int getSuccessfulCheckIns(){
        return getCheckIn();
    }

    public boolean checkInCode(){
        if(approve){
            setCheckIn();
            return true;
        }
        else{
            access = false;
            return false;
        }
    }

}


class BusinessEmployee extends Employee{

    private String name;
    private double baseSalary;
    private double bonusBudget;


    public BusinessEmployee(String name){
        super(name,50000);
        this.name = name;
        this.baseSalary = 50000;
        bonusBudget = 0;
    }

    public double getBonusBudget(){
        return bonusBudget;
    }

    public String employeeStatus(){
        return String.valueOf(getEmployeeId())+" "+getName()+" with a budget of "+getBonusBudget();
    }

}



class Accountant extends BusinessEmployee{

    public Accountant(String name){
        super(name);

    }


}






















