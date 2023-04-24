import java.util.ArrayList;

public class MyFarm {

    ArrayList<Plot> row;

    public static void main(String[] args) {
        MyFarm myFarm = new MyFarm();
    }
    public MyFarm() {
        System.out.println();

        row = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            row.add(new Plot());
        }

        totalPlants();
        printPlantNames();

    }

    public void totalPlants() {
        int total = 0;
        for(int i=0;i<row.size();i++) {
            total = total + row.get(i).numberOfPlants;
        }
        System.out.println("Total plants in the row: " + total);
    }

    public void printPlantNames() {
        for(int i=0;i<row.size();i++) {
           if(row.get(i).needsWater) {
               System.out.print(i + ": " + row.get(i).plantName + " has " + row.get(i).numberOfPlants +
                       " and needs water" + "\t");
           }
           else {
               System.out.print(i + ": " + row.get(i).plantName + " has " + row.get(i).numberOfPlants +
                       " and doesn't need water" + "\t");
           }
        }
        System.out.println();
    }

    public void printPlantNames2() {
        for(Plot p:row) {
            System.out.print("    ");
        }
        System.out.println();
    }

    public void printRowInfo() {
        for(int i=0;i<row.size();i++) {
            System.out.println();
            row.get(i).printPlotInfo();
        }
        for(Plot e : row) {
            System.out.println();
            e.printPlotInfo();
        }
        }

    public void addLettuce() {
        row.add(new Plot());
        row.get(row.size()-1).numberOfPlants = 42;
        row.get(row.size()-1).plantName = "lettuce";
        row.get(row.size()-1).needsWater = true;
    }

    public void addTulip() {
        row.add(new Plot());
        row.get(row.size()-1).plantName = row.get(3).plantName;
        row.get(row.size()).numberOfPlants = row.get(3).numberOfPlants;
        row.get(row.size()).needsWater = row.get(3). needsWater;
        row.get(3).numberOfPlants = 70;
        row.get(3).plantName = "tulip";
        row.get(3).needsWater = false;
    }

    public void tomatoLocations() {
        System.out.print("Indexes ");
        for(int i=0;i<row.size()-1;i++){
            if(row.get(i).plantName.equals("tomato")) {
                System.out.print(i + ", ");
            }
        }
        if(row.get(row.size()-1).plantName.equals("tomato")) {
            System.out.print("and " + (row.size()-1));
        }
        System.out.print(" have tomatoes");
    }

    public void totalCarrots() {
        int numberOfCarrots = 0;
        for (Plot b : row) {
            if (b.plantName.equals("carrot")) {
                numberOfCarrots = numberOfCarrots + b.numberOfPlants;
            }
        }
        System.out.println("Carrots: " + numberOfCarrots);
    }

    public void averageNumberOfPlants() {
        int average = 0;
        for(int i=0;i<row.size();i++){
                average = average + row.get(i).numberOfPlants;
        }
        System.out.println("Average: " + average/row.size());
    }

    public void numberOfCarrotPlots() {
        int carrotPlots = 0;
        for (Plot plot : row) {
            if (plot.plantName.equals("carrot")) {
                carrotPlots++;
            }
        }
        if(carrotPlots == 1) {
            System.out.println("There is " + carrotPlots + " carrot plot");
        }
        else {
            System.out.println("There are " + carrotPlots + " carrot plots");
        }
    }

    public void numberOfEmptyPlots() {
        int emptyPlots = 0;
        for (Plot plot : row) {
            if (plot.plantName.equals("empty")) {
                emptyPlots = emptyPlots + 1;
            }
        }
        if(emptyPlots == 1) {
            System.out.println("There is " + emptyPlots + " empty plot");
        }
        else {
            System.out.println("There are " + emptyPlots + " empty plots");
        }
    }

    public void everyOtherNeedsWater() {
        for(int i=0;i<row.size();i=i+2){ //doesn't go through every plot
            row.get(i).needsWater = true;
        }
        for(int i=1;i<row.size();i=i+2){
            row.get(i).needsWater = false;
        }
    }

    public void plantWithMaxNumber() {
        int numberOfCarrots = 0;
        int numberOfTulips = 0;
        int numberOfLettuces = 0;
        int numberOfTomatoes = 0;
        for (Plot plot : row) {
            if (plot.plantName.equals("carrot")) {
                numberOfCarrots = numberOfCarrots + plot.numberOfPlants;
            }
            if (plot.plantName.equals("tulip")) {
                numberOfTulips = numberOfTulips + plot.numberOfPlants;
            }
            if (plot.plantName.equals("lettuce")) {
                numberOfLettuces = numberOfLettuces + plot.numberOfPlants;
            }
            if (plot.plantName.equals("tomato")) {
                numberOfTomatoes = numberOfTomatoes + plot.numberOfPlants;
            }
        }
        int maxNumber = numberOfCarrots;
        if(numberOfTulips > maxNumber) {
            maxNumber = numberOfTulips;
        }
        else if (numberOfLettuces > maxNumber) {
            maxNumber = numberOfLettuces;
        }
        else if (numberOfTomatoes > maxNumber) {
            maxNumber = numberOfTomatoes;
        }

        System.out.println(numberOfCarrots);
        System.out.println(numberOfTulips);
        System.out.println(numberOfLettuces);
        System.out.println(numberOfTomatoes);
        if(numberOfCarrots == maxNumber) {
            System.out.println("There are the most carrots with " + maxNumber + " plants");
        }
        if(numberOfTulips == maxNumber) {
            System.out.println("There are the most tulips with " + maxNumber + " plants");
        }
        if(numberOfLettuces == maxNumber) {
            System.out.println("There is the most lettuce with " + maxNumber + " plants");
        }
        if(numberOfTomatoes == maxNumber) {
            System.out.println("There are the most tomatoes with " + maxNumber + " plants");
        }
    }

    public void plantWithMinNumber() {
        int numberOfCarrots = 0;
        int numberOfTulips = 0;
        int numberOfLettuces = 0;
        int numberOfTomatoes = 0;
        for (Plot plot : row) {
            if (plot.plantName.equals("carrot")) {
                numberOfCarrots = numberOfCarrots + plot.numberOfPlants;
            }
            if (plot.plantName.equals("tulip")) {
                numberOfTulips = numberOfTulips + plot.numberOfPlants;
            }
            if (plot.plantName.equals("lettuce")) {
                numberOfLettuces = numberOfLettuces + plot.numberOfPlants;
            }
            if (plot.plantName.equals("tomato")) {
                numberOfTomatoes = numberOfTomatoes + plot.numberOfPlants;
            }
        }
        int minNumber = numberOfCarrots;
        if(numberOfTulips < minNumber) {
            minNumber = numberOfTulips;
        }
        else if (numberOfLettuces < minNumber) {
            minNumber = numberOfLettuces;
        }
        else if (numberOfTomatoes < minNumber) {
            minNumber = numberOfTomatoes;
        }

        System.out.println(numberOfCarrots);
        System.out.println(numberOfTulips);
        System.out.println(numberOfLettuces);
        System.out.println(numberOfTomatoes);
        if(numberOfCarrots == minNumber) {
            System.out.println("There are the fewest carrots with " + minNumber + " plants");
        }
        if(numberOfTulips == minNumber) {
            System.out.println("There are the fewest tulips with " + minNumber + " plants");
        }
        if(numberOfLettuces == minNumber) {
            System.out.println("There is the least lettuce with " + minNumber + " plants");
        }
        if(numberOfTomatoes == minNumber) {
            System.out.println("There are the fewest tomatoes with " + minNumber + " plants");
        }
    }

    public void greaterThan50() {
        int plotsWith50 = 0;
        for (Plot plot : row) {
            if (plot.numberOfPlants > 50) {
                plotsWith50 = plotsWith50 + 1;
            }
        }
        System.out.println("There are " + plotsWith50 + " plots with more than 50 plants");
    }

    public void plantWithMaxNumberNeedsWater() {
        int numberOfCarrots = 0;
        int numberOfTulips = 0;
        int numberOfLettuces = 0;
        int numberOfTomatoes = 0;
        for (Plot plot : row) {
            if (plot.plantName.equals("carrot") && plot.needsWater) {
                numberOfCarrots = numberOfCarrots + plot.numberOfPlants;
            }
            if (plot.plantName.equals("tulip") && plot.needsWater) {
                numberOfTulips = numberOfTulips + plot.numberOfPlants;
            }
            if (plot.plantName.equals("lettuce") && plot.needsWater) {
                numberOfLettuces = numberOfLettuces + plot.numberOfPlants;
            }
            if (plot.plantName.equals("tomato") && plot.needsWater) {
                numberOfTomatoes = numberOfTomatoes + plot.numberOfPlants;
            }
        }
        int maxNumber = numberOfCarrots;
        if(numberOfTulips > maxNumber) {
            maxNumber = numberOfTulips;
        }
        else if (numberOfLettuces > maxNumber) {
            maxNumber = numberOfLettuces;
        }
        else if (numberOfTomatoes > maxNumber) {
            maxNumber = numberOfTomatoes;
        }

        System.out.println(numberOfCarrots);
        System.out.println(numberOfTulips);
        System.out.println(numberOfLettuces);
        System.out.println(numberOfTomatoes);
        if(numberOfCarrots == maxNumber) {
            System.out.println("There are the most carrots with " + maxNumber + " plants");
        }
        if(numberOfTulips == maxNumber) {
            System.out.println("There are the most tulips with " + maxNumber + " plants");
        }
        if(numberOfLettuces == maxNumber) {
            System.out.println("There is the most lettuce with " + maxNumber + " plants");
        }
        if(numberOfTomatoes == maxNumber) {
            System.out.println("There are the most tomatoes with " + maxNumber + " plants");
        }
    }

    public void greatestDifferenceNumberBetweenAnyPlants() {
        int difference = 0;
        int index1 = 0;
        int index2 = 0;
        for(int i=1;i<row.size();i++){
            if(Math.abs(row.get(i).numberOfPlants - row.get(i-1).numberOfPlants) > difference) {
                difference = Math.abs(row.get(i).numberOfPlants - row.get(i-1).numberOfPlants);
                index1 = i-1;
                index2 = i;
            }
        }
        System.out.println("The greatest difference is " + difference +  " between indexes " + index1 + " and " + index2);
    }

    public void numberOfCarrotPlotsNextToLettuce() {
        int CarrotNextToLettuce = 0;
        for(int i=0; i<row.size(); i++) {
            if(row.get(i).plantName.equals("carrot") && (row.get(i-1).plantName.equals("lettuce") || row.get(i+1).plantName.equals("lettuce"))) {
                CarrotNextToLettuce = CarrotNextToLettuce + 1;
            }
        }
        System.out.println("There are " + CarrotNextToLettuce + " carrot plots bordering lettuce plots");
    }

    public void removeFirstCarrot() {
        boolean stop = false;
        for(int i=0; i<row.size(); i++) {
            if(row.get(i).plantName.equals("carrot") && !stop) {
                row.remove(i);
                stop = true;
            }
        }
    }

    public void removeAllEmpty() {
        for(int i=0; i<row.size(); i++) {
            if(row.get(i).plantName.equals("empty")) {
                row.remove(i);
            }
        }
    }

    public void greatestDifferenceOfPlantNumbers() {
        int diffCarrot = 0;
        int carrotPlots = 0;
        int diffTulip = 0;
        int tulipPlots = 0;
        int diffLettuce = 0;
        int lettucePlots = 0;
        int diffTomato = 0;
        int tomatoPlots = 0;
        int greatestDiff = 0;

        for(Plot plot : row) {
            if(plot.plantName.equals("carrot")) {

            }
        }



    }



}