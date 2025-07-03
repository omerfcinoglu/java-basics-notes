public class Dog extends Animal implements Pet {
    public Dog(String name, int age){
        super(name, age);
    }
    
    @Override
    public void makeSound() {
        System.out.println(this.name + " says: Woof!");
    }
    
    @Override
    public String getInfo(){
        String base_info = super.getInfo();
        return base_info + " type is Dog";
    }
    
    @Override
    public void play(){
        System.out.println("Doggy plays with bla bla");
    }
}
