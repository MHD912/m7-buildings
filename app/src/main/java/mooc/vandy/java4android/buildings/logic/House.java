package mooc.vandy.java4android.buildings.logic;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building
{

    // TODO - Put your code here.
    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);

    }

    House(int length, int width, int lotLength, int lotWidth, String owner)
    {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;

    }

    House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool)
    {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }

    public String getOwner()
    {
        return mOwner;
    }

    public void setPool(boolean pool)
    {
        this.mPool = pool;
    }

    public void setOwner(String owner)
    {
        this.mOwner = owner;
    }

    public boolean hasPool()
    {
        return mPool;
    }

    @NonNull
    @Override
    public String toString()
    {
        return super.toString();
    }

    @Override
    public boolean equals(@Nullable Object obj)
    {
        return super.equals(obj);
    }
}
