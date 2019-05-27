package newthreetaskglasses4;

import eu.presniak.ivan.api.IProduct;
import eu.presniak.ivan.api.IProductPart;

public class InstalationProducts implements IProduct {

    @Override
    public void installSecondPart(IProductPart b) {
        ((ProductArms) b).setLength(5);
        ((ProductArms) b).setMaterial("оловянные");

        System.out.println("Дужки установлены");
    }

}
