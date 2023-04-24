public class Bird {

   public boolean canItFly;
   public int size;
   public String color;
   public String species;
   public String name;

   public Bird(String pName, boolean pCanItFly, int pSize, String pColor, String pSpecies) {
      name = pName;
      canItFly = pCanItFly;
      size = pSize;
      color = pColor;
      species = pSpecies;
   }
   public Bird(int size){
      this.size = size;
      canItFly = true;
      color = "red";
      species = "duck";
      name = "Duck";
   }

   public void printInfo(){
      System.out.println("My bird's name is " + name + ".");
      if(canItFly) { System.out.println(name + " can fly."); } //same as if(canItFly == true)
      else { System.out.println(name + " cannot fly."); }
      System.out.println("Size: " + size);
      System.out.println("Color: " + color);
      System.out.println("Species: " + species);
   }

}