package mooc.vandy.java4android.buildings.logic;

import androidx.annotation.NonNull;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage extends House {

    // TODO - Put your code here.
    private final boolean mSecondFloor;

    public Cottage(int dimension, int lotLength, int lotWidth) {
        super(dimension, dimension, lotLength, lotWidth);
        this.mSecondFloor = false;
    }

    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) {
        super(dimension, dimension, lotLength, lotWidth, owner);
        this.mSecondFloor = secondFloor;
    }

    public boolean hasSecondFloor() {
        return mSecondFloor;
    }

    @NonNull
    @Override
    public String toString() {
        if (this.hasSecondFloor())
            return super.toString() + "; is a two story cottage";
        else
            return super.toString() + "; is a cottage";
    }
}

