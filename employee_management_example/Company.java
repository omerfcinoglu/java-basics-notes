public class Company {
  public Employee[] employees;
  public Company(){
    this.employees = new Employee[5];
  }
  
  public void addEmployee(int index, Employee emp){
    this.employees[index] = emp;
  }
  
  public int calculateTotalSalary(){
    int total = 0;
    for(Employee e : this.employees){
      total += e.getSalary();
    }
    return total;
  }
  
  public Employee getOldestEmployee(){
    Employee oldest = this.employees[0];
    for(Employee e : this.employees){
      if(e.getAge() >  oldest.getAge()){
        oldest = e;
      }
    }
    return oldest;
  }
}