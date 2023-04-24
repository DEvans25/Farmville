public class Plot {

    public String plantName;
    public int numberOfPlants;
    public boolean needsWater;

    public Plot() {
        int plantID = (int)(Math.random()*5);
        if(plantID == 0) {plantName = "carrot";}
        else if(plantID == 1) {plantName = "tulip";}
        else if(plantID == 2) {plantName = "lettuce";}
        else if(plantID == 3) {plantName = "tomato";}
        else if(plantID == 4) {plantName = "empty";}

        numberOfPlants = (int)(Math.random()*90+10);

        int waterID = (int)(Math.random()*2);
        if(waterID == 0) {needsWater = false;}
        else if(waterID == 1) {needsWater = true;}
    }

    public void printPlotInfo() {
        System.out.println("type of plot: " + plantName);
        System.out.println("number of plants: " + numberOfPlants);
        System.out.println("needsWater: " + needsWater);
    }

}
