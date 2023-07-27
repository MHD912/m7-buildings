package mooc.vandy.java4android.buildings.logic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Locale;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {

    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = "n/a";
        this.mPool = false;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = false;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }

    public String getOwner() {
        return mOwner;
    }

    public void setPool(boolean pool) {
        this.mPool = pool;
    }

    public void setOwner(String owner) {
        this.mOwner = owner;
    }

    public boolean hasPool() {
        return mPool;
    }

    @NonNull
    @Override
    public String toString() {
        String output = String.format(Locale.getDefault(), "Owner: %s", this.getOwner());
        if (hasPool()) {
            output += "; has a pool";
        }
        if (calcLotArea() > calcBuildingArea()) {
            output += "; has a big open space";
        }
        return output;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof House) {
            return this.calcBuildingArea() == ((House) obj).calcBuildingArea() && this.hasPool() == ((House) obj).hasPool();
        }
        return false;
    }
}
