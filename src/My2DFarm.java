public class My2DFarm {

    public Plot[][] grid;

    public static void main(String[] args) {
        My2DFarm my2DFarm = new My2DFarm();
    }

    public My2DFarm() {
        grid = new Plot[3][4];

        for(int x=0;x<grid.length;x++) {
            for(int y=0;y<grid[x].length;y++) {
                grid[x][y] = new Plot();
            }
        }

        printPlantNames();
        System.out.println();

        plantWithMaxNumber();

    }

    public void printPlantNames() {
        System.out.println("\t\tcol 0\t\tcol 1\t\tcol 2\t\tcol 3");
        for(int x=0;x<grid.length;x++) {
            System.out.print("row " + x + ": ");
            for(int y=0;y<grid[x].length;y++) {
                if(grid[x][y].plantName.equals("empty")) {
                    System.out.print("\t" + grid[x][y].plantName + "\t");
                }
                else if(grid[x][y].plantName.equals("tomato")) {
                    System.out.print("\t" + grid[x][y].numberOfPlants + " " + grid[x][y].plantName + "es");
                }
                else {
                    System.out.print("\t" + grid[x][y].numberOfPlants + " " + grid[x][y].plantName + "s");
                }
            }
            System.out.println();
        }
    }

    public void totalPlants() {
        int total = 0;
        for(int x=0;x<grid.length;x++) {
            for(int y=0;y<grid[x].length;y++) {
                total = total + grid[x][y].numberOfPlants;
            }
            System.out.println("There are " + total + "total plants");
        }
    }

    public void totalCarrots() {
        int total = 0;
        for(int x=0;x<3;x++) {
            for(int y=0;y<4;y++) {
                if(grid[x][y].plantName.equals("carrot")) {
                    total = total + grid[x][y].numberOfPlants;
                }
            }
        }
        System.out.println("There are " + total + " carrot plants");
    }

    public void averageNumberOfPlants() {
        int average = 0;
        int totalPlots = 0;
        for(int x=0;x<grid.length;x++) {
            for(int y=0;y<grid[x].length;y++) {
                average = average + grid[x][y].numberOfPlants;
                totalPlots = totalPlots + 1;
            }
        }
        System.out.println("Average: " + (average/totalPlots));
    }

    public void numberOfTomatoPlots() {
        int tomatoPlots = 0;
        for(int x=0;x<3;x++) {
            for(int y=0;y<4;y++) {
               if(grid[x][y].plantName.equals("tomato")) {
                   tomatoPlots = tomatoPlots + 1;
               }
            }
        }
        System.out.println("There are " + tomatoPlots + " tomato plots");
    }

    public void numberOfEmptyPlots() {
        int emptyPlots = 0;
        for(int x=0;x<3;x++) {
            for(int y=0;y<4;y++) {
                if(grid[x][y].plantName.equals("empty")) {
                    emptyPlots = emptyPlots + 1;
                }
            }
        }
        if(emptyPlots == 1) {
            System.out.println("There is " + emptyPlots + " empty plot");
        }
        else {
            System.out.println("There are " + emptyPlots + " empty plots");
        }
    }

    public void everyOtherNeedsWater(){
        for(int x=0;x<grid.length;x++) {
            for(int y=0;y<grid[x].length;y=y+2) {
                grid[x][y].needsWater = true;
            }
        }
        for(int x=0;x<grid.length;x++) {
            for(int y=1;y<grid[x].length;y=y+2) {
                grid[x][y].needsWater = false;
            }
        }
    }

    public void plantWithMaxNumber() {
        int numberOfCarrots = 0;
        int numberOfTulips = 0;
        int numberOfLettuces = 0;
        int numberOfTomatoes = 0;
        for(int x=0;x<grid.length;x++) {
            for(int y=0;y<grid[x].length;y++) {
                if (grid[x][y].plantName.equals("carrot")) {
                    numberOfCarrots = numberOfCarrots + grid[x][y].numberOfPlants;
                }
                if (grid[x][y].plantName.equals("tulip")) {
                    numberOfTulips = numberOfTulips + grid[x][y].numberOfPlants;
                }
                if (grid[x][y].plantName.equals("lettuce")) {
                    numberOfLettuces = numberOfLettuces + grid[x][y].numberOfPlants;
                }
                if (grid[x][y].plantName.equals("tomato")) {
                    numberOfTomatoes = numberOfTomatoes + grid[x][y].numberOfPlants;
                }
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

}
