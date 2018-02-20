package starbuzz.hfad.com.starbuzz;

import android.util.EventLogTags;

/**
 * Created by julioargueta on 2/20/18.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceID;

    //drinks is an array of Drinks
    static final Drink[] drinks = {
            new Drink("Latte", "A couple of espersso shots with steamed milk",
                    R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed milk Foam",
                    R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh",
                    R.drawable.filter)

    };
    //Each Drink has a name, description and an image resource
    private Drink(String name, String description, int imageResourceID){
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public String toString() {
        return this.name;
    }

}
