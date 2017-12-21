public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells){
            System.out.println(cell);
            if (guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
         //   System.out.println("numOfHits:"+numOfHits);
        }
       // System.out.println("numOfHits:"+numOfHits);
        if (numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
            return result;
    }
}
