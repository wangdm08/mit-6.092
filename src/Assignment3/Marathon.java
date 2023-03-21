package Assignment3;

class Marathon {
    public static int fastest (String[] name, int[] time) {
        int first = 0;
        for (int i = 1; i < name.length; i++) {
            if (time[i]<time[first]) {
                first=i;
            }
        }
        return first;
    }
    public static int secondFastest (String[] secondName, int[] secondTime) {
        int second = -1;
        int first = fastest(secondName, secondTime);
        for (int j = 0; j < secondName.length; j++) {
            if (j == first) {
                continue;
            }
            if (second == -1 || secondTime[j] < secondTime[second]) {
                second = j;
            }
        }
        return second;
    }
    public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };
        int firstNum = fastest(names, times);
        int secondNum = secondFastest(names,times);
        System.out.println("Fastest runner is " + names[firstNum] + ": " + times[firstNum]);
        System.out.println("Second fastest runner is " + names[secondNum] + ": " + times[secondNum]);
    }
}