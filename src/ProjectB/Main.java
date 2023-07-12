package ProjectB;

class Date {
    private int month;
    private int day;
    private int year;
    
    public Date(int month, int day, int year) {
        if (dateOK(month, day, year)) {
            this.month = month;
            this.day = day;
            this.year = year;
        } else {
            this.month = 1;
            this.day = 1;
            this.year = 1900;
        }
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        if (dateOK(month, day, year)) {
            this.month = month;
        }
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        if (dateOK(month, day, year)) {
            this.day = day;
        }
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        if (dateOK(month, day, year)) {
            this.year = year;
        }
    }
    
    private boolean dateOK(int month, int day, int year) {
        return (year >= 1000 && year <= 9999) &&
               (day >= 1 && day <= 31) &&
               (month >= 1 && month <= 12);
    }
    
    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}

class Employee {
    private String name;
    private int id;
    private Date hiredDate;
    private String position;
    
    public Employee(String name, int id, Date hiredDate, String position) {
        this.name = name;
        this.id = id;
        this.hiredDate = hiredDate;
        this.position = position;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public Date getHiredDate() {
        return hiredDate;
    }
    
    public void setHiredDate(Date hiredDate) {
        this.hiredDate = hiredDate;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Hired Date: " + hiredDate + ", Position: " + position;
    }
}

class Company {
    private Employee[] employees;
    private int numEmployees;
    
    public Company() {
        employees = new Employee[100];
        numEmployees = 0;
    }
    
    public void addEmployee(Employee employee) {
        if (numEmployees < employees.length) {
            employees[numEmployees] = employee;
            numEmployees++;
        } else {
            System.out.println("Maximum capacity reached. Cannot add more employees.");
        }
    }
    
    public Employee[] getEmployeesHiredAfterDate(Date date) {
        int count = 0;
        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].getHiredDate().getYear() > date.getYear() ||
                (employees[i].getHiredDate().getYear() == date.getYear() &&
                 employees[i].getHiredDate().getMonth() > date.getMonth()) ||
                (employees[i].getHiredDate().getYear() == date.getYear() &&
                 employees[i].getHiredDate().getMonth() == date.getMonth() &&
                 employees[i].getHiredDate().getDay() > date.getDay())) {
                count++;
            }
        }
        
        Employee[] hiredAfterDate = new Employee[count];
        int index = 0;
        for (int i = 0; i < numEmployees; i++) {
            if (employees[i].getHiredDate().getYear() > date.getYear() ||
                (employees[i].getHiredDate().getYear() == date.getYear() &&
                 employees[i].getHiredDate().getMonth() > date.getMonth()) ||
                (employees[i].getHiredDate().getYear() == date.getYear() &&
                 employees[i].getHiredDate().getMonth() == date.getMonth() &&
                 employees[i].getHiredDate().getDay() > date.getDay())) {
                hiredAfterDate[index] = employees[i];
                index++;
            }
        }
        
        return hiredAfterDate;
    }
}

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(6, 1, 2022);
        Date date2 = new Date(3, 15, 2023);
        Date date3 = new Date(10, 21, 2023);
        
        Employee employee1 = new Employee("John Doe", 1001, date1, "Manager");
        Employee employee2 = new Employee("Jane Smith", 1002, date2, "Developer");
        Employee employee3 = new Employee("Robert Johnson", 1003, date3, "Analyst");
        
        Company company = new Company();
        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);
        
        Date referenceDate = new Date(1, 1, 2023);
        Employee[] employeesHiredAfterDate = company.getEmployeesHiredAfterDate(referenceDate);
        
        System.out.println("Employees hired after " + referenceDate + ":");
        for (Employee employee : employeesHiredAfterDate) {
            System.out.println(employee);
        }
    }
}