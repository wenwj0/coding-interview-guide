package chapter01_stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Subject02_DogCatQueue {
    private Queue<PetEnterQueue> catQ;
    private Queue<PetEnterQueue> dogQ;
    private long count;

    public Subject02_DogCatQueue(){
        count = 0;
        catQ = new LinkedList<>();
        dogQ = new LinkedList<>();
    }

    public void add(Pet pet){
        PetEnterQueue p = new PetEnterQueue(pet, count++);
        if("cat".equals(pet.getPetType())){
            catQ.add(p);
        }else if("dog".equals(pet.getPetType())){
            dogQ.add(p);
        }else {
            throw new RuntimeException("err, not dog or cat.");
        }
    }

    public Pet pollAll(){
        if(!isDogEmpty() && !isCatEmpty()){
            if(dogQ.peek().getCount() < catQ.peek().getCount()){
                return this.dogQ.poll().getPet();
            }else {
                return this.catQ.poll().getPet();
            }
        }else if(!isDogEmpty()){
            return this.dogQ.poll().getPet();
        }else if(!isCatEmpty()){
            return this.catQ.poll().getPet();
        }else {
            throw new RuntimeException("err, queue is empty.");
        }
    }
    public Pet pollDog(){
        if(!isDogEmpty()){
            return (Dog)this.dogQ.poll().getPet();
        }else {
            throw new RuntimeException("Dog queue is empty.");
        }
    }
    public Pet pollCat(){
        if(!isDogEmpty()){
            return (Cat)this.catQ.poll().getPet();
        }else {
            throw new RuntimeException("Cat queue is empty.");
        }
    }
    public boolean isEmpty(){
        return dogQ.isEmpty() && catQ.isEmpty();
    }
    public boolean isDogEmpty(){
        return dogQ.isEmpty();
    }
    public boolean isCatEmpty(){
        return catQ.isEmpty();
    }

}
