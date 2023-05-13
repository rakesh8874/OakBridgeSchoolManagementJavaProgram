import java.util.Arrays;

public class OakBridgeSchool {
    int[] calculateTotalMarks(int[] math, int[] science, int[] english) {
        int[] totalMarks = new int[10];
        int i;
        for (i = 0; i < math.length; i++) {
            totalMarks[i] = math[i] + science[i] + english[i];
        }
        return totalMarks;
    }
    int findTopScore(int[] totalMarks, int len) {
        if (len == 1)
            return totalMarks[0];
        else
            return Math.max(totalMarks[len-1], findTopScore(totalMarks, len-1));
    }
    double calculateAverageScienceMarks(int []science, int len) {

        if(len == 1){
            return science[len-1];
        }
        else
           return (calculateAverageScienceMarks(science, len-1)*(len-1)+science[len-1])/len;
    }
    double calculateAverageMathMarks(int []math, int len) {

        if(len == 1){
            return math[len-1];
        }
        else
            return (calculateAverageMathMarks(math, len-1)*(len-1)+math[len-1])/len;
    }
    double calculateAverageEnglishMarks(int []english, int len) {

        if(len == 1){
            return english[len-1];
        }
        else
            return (calculateAverageEnglishMarks(english, len-1)*(len-1)+english[len-1])/len;
    }


    public static void main(String[] args) {
        OakBridgeSchool oakbridgeschool = new OakBridgeSchool();
         int []math = {88, 89, 76, 70, 60, 80, 35, 3, 25, 95};
         int []science = {80, 83, 75, 67, 56, 84, 38, 9, 32, 92};
         int []english = {90, 98, 67, 65, 54, 82, 40, 13, 45, 93};
         int []totalMarks = oakbridgeschool.calculateTotalMarks(math, science, english);
         int len = totalMarks.length;
         long topScoreObtained = oakbridgeschool.findTopScore(totalMarks, len);
         System.out.println("\nTop Score Which is Obtained By A Student is : "+topScoreObtained);
         double scienceAvgMarks =  oakbridgeschool.calculateAverageScienceMarks(science,len);
         System.out.println("Calculated Average Marks in Science Obtained by Student : "+scienceAvgMarks);
         double mathAvgMarks = oakbridgeschool.calculateAverageMathMarks(math, len);
         System.out.println("Calculated Average Marks in Science Obtained by Student : "+mathAvgMarks);
         double englishAvgMarks = oakbridgeschool.calculateAverageEnglishMarks(english, len);
         System.out.println("Calculated Average Marks in English is : "+englishAvgMarks);

    }
}
