package section.seven;

public class Kitchen {
    private int numberOfKitchens;
    private int numberOfAppliances;

    public Kitchen(int numberOfKitchens, int numberOfAppliances) {
        this.numberOfKitchens = numberOfKitchens;
        this.numberOfAppliances = numberOfAppliances;
    }

    public int getNumberOfKitchens() {
        return numberOfKitchens;
    }

    public void setNumberOfKitchens(int numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }

    public int getNumberOfAppliances() {
        return numberOfAppliances;
    }

    public void setNumberOfAppliances(int numberOfAppliances) {
        this.numberOfAppliances = numberOfAppliances;
    }
}
