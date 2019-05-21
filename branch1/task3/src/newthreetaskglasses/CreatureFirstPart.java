package newthreetaskglasses;

import interfacesAll.ILineStep;
import interfacesAll.IProductPart;

public class CreatureFirstPart implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        
        return new ProductBodyFromGlasses("оправа!1!!!");
    }
}
