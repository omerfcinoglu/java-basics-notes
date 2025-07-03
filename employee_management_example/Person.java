public class Person{
  private String name;
  private int age;
  
  public Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  
  public void setName(String value){
    this.name = value;
  }
  
  public String getName(){
    return this.name;
  }
  
  public void setAge(int value){
    this.age = value;
  }
  
  public int getAge(){
    return this.age;
  }
}