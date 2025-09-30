package samplearrays;

public class DogShelter {
    private static int[] dogCounts = new int[3];

    public static void main(String[] args) {

        dogCounts[0] = 15;
        dogCounts[1] = 30;
        dogCounts[2] = 20;

        System.out.println("Initial Dog Counts:");
        displayDogs();

        addBreed(1, 5);

        deleteBreed(2);

        System.out.println("\nUpdated Dog Counts:");
        displayDogs();
    }

    // Add count to a given index
    public static void addBreed(int index, int count) {
        dogCounts[index] += count;
    }

    // Remove a breed by setting its count to 0
    public static void deleteBreed(int index) {
        dogCounts[index] = 0;
    }

    // Display all dog counts
    public static void displayDogs() {
        for (int i = 0; i < dogCounts.length; i++) {
            System.out.println("Breed " + i + " has " + dogCounts[i] + " dogs.");
        }
    }
}

