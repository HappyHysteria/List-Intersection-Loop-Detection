public class Intersection {
    public static void main(String[] args) {

        int[] firstList = {1, 2, 3, 4, 5};
        int[] secondList = {5, 6, 7, 8, 9};

        int i =0, j = 0; //variables to iterate through both lists

        while (i < firstList.length && j < secondList.length){
            if (firstList[i] == secondList[j]){
                System.out.println("Lists intersect at: " + firstList[i]);
                return;
            } else if (firstList[i] < secondList[j]){
                i++;
            } else {
                j++;
            }
        }
    }
}
