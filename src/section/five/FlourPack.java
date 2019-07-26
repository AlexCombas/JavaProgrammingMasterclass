package section.five;

public class FlourPack {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        // Store the values elsewhere in case we want access to the original values later
        int bigStore = bigCount;
        int smallStore = smallCount;

        while (bigStore + smallStore > 0) {
            // both bigStore and smallStore greater than zero
            if (bigStore > 0 && smallStore > 0) {

                if (goal % (bigStore * 5) == goal) {
                    bigStore--;
                } else if (goal % (bigStore * 5 + smallStore) == goal) {
                    smallStore--;
                } else if (goal % (bigStore * 5 + smallStore) < goal) {
                    if (goal % (bigStore * 5 + smallStore) == 0) {
                        return true;
                    } else {
                        smallStore--;
                    }
                } else {
                    return false;
                }

                // only smallStore greater than zero
            } else if (bigStore == 0 && smallStore > 0) {

                if (goal % smallStore == goal) {
                    smallStore--;
                } else if (goal % smallStore == 0) {
                    return true;
                }


                // only  bigStore greater than zero
            } else if (bigStore > 0 && smallStore == 0) {
                if (goal % (bigStore * 5) == goal) {
                    bigStore--;
                } else if (goal % (bigStore * 5) == 0) {
                    return true;
                }

            } else {
                return false;
            }
        }
        return false;
    }
}
