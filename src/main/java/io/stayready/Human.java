package io.stayready;

public class Human {
    private String firstName;
    private String lastName;
    private int energy;
    static int maxEnergy = 100;

    public Human(String firstName, String lastName, int energy){
        this.firstName = firstName;
        this.lastName = lastName;
        this.energy = 50;
    }

    public void eat(Fruit fruit){
        if(this.energy + fruit.getEnergy() <= maxEnergy){
            this.energy += fruit.getEnergy(); 
        }
        else{
            this.energy = maxEnergy;
        }
        
    }

    public void work(int hours){
        int energySpent = hours*10;

        if(this.energy - energySpent < 0){
            System.out.println("Can't do the work, energy too low");
        }
        else{
            this.energy -= energySpent;
        }
        
    }

    public int getEnergy(){
        return this.energy;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
}