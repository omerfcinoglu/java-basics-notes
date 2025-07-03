public class Owner {
    private String name;
    private Pet pet;
    
    public Owner( String name, Pet pet){
        this.name = name;
        this.pet = pet;
    }
    
    public void interactWithPet(){
        this.pet.play();
    }
    
    public void introduce() {
        System.out.println(
            "Owner Info - Owner name:  "+this.name + "\n" + ((Animal) this.pet).getInfo()
        );
    }
}
