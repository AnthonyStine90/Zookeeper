public class Gorilla extends Mammal {
  
  //throw banana -5 energy
  public void throwSomething(){
    System.out.printf("%nKong threw poop at Jane");
    this.setEnergy(getEnergy() - 5 );
  }

  //eat banana is +10 energy
  public void eatBanana(){
    System.out.printf("%nKong eats a banana then poops");
    this.setEnergy(getEnergy() + 10 );
    
  }

  //climb is -10 energy
  public void climb(){
    System.out.printf("%nKong climbs a skyscraper while pooping");
    this.setEnergy(getEnergy() - 10 );
    
  }
}
