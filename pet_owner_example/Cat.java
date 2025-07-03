public class Cat extends Animal implements Pet {
    public Cat(String name, int age){
        super(name, age);
    }
    
    @Override
    public void makeSound() {
        System.out.println(this.name + " says: Meow!");
    }
    
    @Override 
    public String getInfo(){
        String base_info = super.getInfo();
        return base_info + " type is Cat";
    }
    
    @Override
    public void play(){
        System.out.println("Kitty plays with bla bla");
    }
}
