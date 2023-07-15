package mooc.vandy.java4android.buildings.logic;

import android.nfc.NfcAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building
{

    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices;
    public Office(int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = parkingSpaces;
    }

    public String getBusinessName()
    {
        return this.mBusinessName;
    }
    public int getParkingSpaces()
    {
        return this.mParkingSpaces;
    }
    public static int getTotalOffices()
    {
        return sTotalOffices;
    }
    public void setBusinessName(String name)
    {
        this.mBusinessName = name;
    }
    public void setParkingSpaces(int spaces)
    {
        this.mParkingSpaces = spaces;
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
