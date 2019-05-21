package newthreetaskglasses;

import interfacesAll.ILineStep;
import interfacesAll.IProductPart;

public class CreatureSecondPart implements ILineStep {

    @Override
    public IProductPart buildProductPart() {

        return new ProductArms("дужки!");
    }
}
