package newthreetaskglasses;

import interfacesAll.ILineStep;
import interfacesAll.IProductPart;

public class CreatureThirdPart implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        return new ProductLenses("линзы!");
    }
}
