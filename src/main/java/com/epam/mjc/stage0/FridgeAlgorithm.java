package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;

public class FridgeAlgorithm {

    /**
     * This is a first task in this module. You need to get milk from a fridge =)
     * <p>
     * Call the methods of the Fridge object inside the fridgeAlgorithm method in the required logical order.
     * P.S All methods of interaction with the fridge can be found inside the {@see Fridge} class.
     */
    public void fridgeAlgorithm(Fridge fridge) {
        fridge.open();
        System.out.println("I think we should use 3 actions to get 1 bottle of milk =) ");

        fridge.getMilk();
        System.out.println("I think that the order is wrong...");

        fridge.close();
        System.out.println("Did you forget to close the fridge? =)");
    }
}
