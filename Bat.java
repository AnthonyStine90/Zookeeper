public class Bat extends Mammal {
  
  public void batEnergy() {
    this.setEnergy(getEnergy() + 200);
  }

  //fly -50, eat +25, attack town -100

  public void fly() {
    System.out.println("Flap, Flap");
    this.setEnergy(getEnergy() -50);
  }

  public void suckBlood(){
    System.out.println("I vill suck vyour vlood");
    this.setEnergy(getEnergy() +25);

  }

  public void attackRomania(){
    System.out.println("crackling wood, screaming");
    this.setEnergy(getEnergy() -100);

  }
  
}


// Create a Bat class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.