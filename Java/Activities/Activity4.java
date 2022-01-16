package Activities;

public class Activity4 {
    public static void main(String[] args) {
        int[] SortCards = {4,3,2,10,12,1,5,6};
        int[] b=new int[SortCards.length];
        int smallest = 0;
        for(int i=0; i<SortCards.length;i++) {
            for (int j = i + 1; j < SortCards.length; j++) {
                if (SortCards[i] > SortCards[j]) {
                    smallest = SortCards[i];
                    SortCards[i] = SortCards[j];
                    SortCards[j] = smallest;
                }
            }
            System.out.print(SortCards[i]);
        }

        }

    }
