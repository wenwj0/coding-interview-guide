package chapter01_stackAndQueue;

public class PetEnterQueue {
    private Pet pet;
    private long count;

    public PetEnterQueue(Pet pet, long count){
        this.pet = pet;
        this.count = count;
    }
    public Pet getPet(){
        return this.pet;
    }
    public String getEnterPetType(){
        return this.pet.getPetType();
    }
    public long getCount(){
        return this.count;
    }

}
