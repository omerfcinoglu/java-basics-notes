public abstract class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public abstract void makeSound();
    
    public String getInfo(){
        return "Animal Info - Age: "+this.age+" Name: "+this.name;
    }
}
