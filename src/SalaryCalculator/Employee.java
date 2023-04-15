package SalaryCalculator;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name,double salary,double workHours,int hireYear){
        this.name=name;
        this.salary = salary;
        this.hireYear=hireYear;
        this.workHours=workHours;
    }

    double tax(){
        if (this.salary>1000) return  this.salary*(0.03);
        else return 0.0;
    }

    double bonus(){
        if (this.workHours>40) return (this.workHours-40)*30;
        else return 0.0;
    }

    double raiseSalary(){
        if (this.hireYear>2011 && this.hireYear<2021) return this.salary + this.salary*0.05;
        else if (this.hireYear<=2012 && this.hireYear>2001) return  this.salary + this.salary*0.1;
        else return this.salary*0.15;
    }

    public String toString(){
        return "Name: "+this.name +"\n"+" Salary: "+this.salary+" \n"+
                " Working Hour: "+this.workHours+"\n"+
                " Hire Year: "+this.hireYear+"\n"+
                " Tax: "+tax()+"\n"+
                " Bonus: "+bonus()+"\n"+
                " Raise Salary: "+ raiseSalary();
    }
}
