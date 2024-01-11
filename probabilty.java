package Javaday2;
 class DiceCombinations {

    public static void main(String[] args) {
        int numberOfDice = 1;
        int desiredOutcome = 1;

        int result = countCombinationsHelper(numberOfDice, desiredOutcome);
        System.out.println("Output: " + result);
    }

    static int countCombinationsHelper(int numberOfDice, int desiredOutcome) {
        if (numberOfDice == 0) {
            return (desiredOutcome == 0) ? 1 : 0;
        }

        int combinations = 0;
        for (int i = 1; i <= 6; i++) {
            if (desiredOutcome - i >= 0) {
                combinations += countCombinationsHelper(numberOfDice - 1, desiredOutcome - i);
            }
        }

        return combinations;
    }
}

