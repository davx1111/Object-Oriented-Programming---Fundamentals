package org.generation;

 // Clase Employee - Representa un empleado en el sistema de RRHH

public class Employee {
    // Atributos de instancia
    private String firstName;
    private String lastName;
    private int registration;
    private int age;
    private int daysWorked;
    private int vacationDaysTaken;
    private double salary;
    private int yearsWorked;
    
    // Constructor
    public Employee(String firstName, String lastName, int registration, 
                   int age, int daysWorked, int vacationDaysTaken, 
                   double salary, int yearsWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.age = age;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
        this.salary = salary;
        this.yearsWorked = yearsWorked;
    }
    
    //Getters y Setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDaysWorked() {
		return daysWorked;
	}

	public void setDaysWorked(int daysWorked) {
		this.daysWorked = daysWorked;
	}

	public int getVacationDaysTaken() {
		return vacationDaysTaken;
	}

	public void setVacationDaysTaken(int vacationDaysTaken) {
		this.vacationDaysTaken = vacationDaysTaken;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYearsWorked() {
		return yearsWorked;
	}

	public void setYearsWorked(int yearsWorked) {
		this.yearsWorked = yearsWorked;
	}
	
	//Métdodo de negocio
	
	//Calcula tiempo restante a aprtir de edad de retiro
	public int timeToRetirement() {
        int retirementAge = 65;
        return retirementAge - age;
    }//timeToRetirement
	
	public int vacationTimeLeft() {
        int totalVacationDays = yearsWorked * 30;
        return totalVacationDays - vacationDaysTaken;
    }//vacationTimeLeft
	
	//Bono anual del empleado
	public double calculateBonus() {
        return salary * 0.10;
    }//calculateBonus

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
				+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
	}//toString
}//classEmployee
    
    