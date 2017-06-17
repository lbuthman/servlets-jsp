package localhost.model;

import java.util.*;

/**
 * Created by lbuthman on 6/15/17.
 * localhost.model class
 */

public class BeerExpert {

    public List getBrands(String color) {
        List brands = new ArrayList();

        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }

        return brands;
    }
}
