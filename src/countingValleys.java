
public class countingValleys {
    public static int countingValleys(int steps, String path) {

        char[] array = path.toCharArray();
        int valleys = 0;
        int currentLvl = 0;
        
        int i = 0;
        for(i = 0; i < array.length; i++) {
            if(array[i] == 'U') ++currentLvl;
            if(array[i] == 'D') --currentLvl;
            
            if(currentLvl == 0 && array[i] == 'U') ++valleys;
        }
        
        return valleys;
    }
}
