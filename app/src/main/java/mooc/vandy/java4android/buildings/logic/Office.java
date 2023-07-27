package mooc.vandy.java4android.buildings.logic;

import android.nfc.NfcAdapter;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Locale;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building
{

    // TODO - Put your code here.
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;
    public Office(int length, int width, int lotLength, int lotWidth)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = null;
        this.mParkingSpaces = 0;
        sTotalOffices++;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = 0;
        sTotalOffices++;
    }
    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces)
    {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = parkingSpaces;
        sTotalOffices++;
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
        String output = "Business: ";
        if (mBusinessName == null)
            output += "unoccupied";
        else
            output += this.getBusinessName();

        if (this.mParkingSpaces != 0)
            output += String.format(Locale.getDefault(), "; has %d parking spaces", this.getParkingSpaces());

        output += String.format(Locale.getDefault(), " (total offices: %d)", sTotalOffices);
        return output;
    }

    @Override
    public boolean equals(@Nullable Object obj)
    {
        if (obj instanceof Office)
        {
            return this.calcBuildingArea() == ((Office) obj).calcBuildingArea() && this.calcLotArea() == ((Office) obj).calcLotArea();
        }
        return false;
    }
}
