package newthreetaskglasses4;

import eu.presniak.ivan.api.IAssembleLine;
import eu.presniak.ivan.api.IProduct;
import eu.presniak.ivan.api.IProductPart;

public class Glasses implements IAssembleLine {

    CreatureSecondPart secondPart = new CreatureSecondPart();
    IProductPart arms = (ProductArms) secondPart.buildProductPart();

    @Override
    public IProduct assembleProduct(IProduct iProduct) {
        InstalationProducts insProduct = new InstalationProducts();
        insProduct.installSecondPart(arms);
        System.out.println("Дужки установлены " + ((ProductArms) arms).getMaterial() + " длинной в " + ((ProductArms) arms).getlength());
        System.out.println("Дужки установлены в оочки");
        return insProduct;
    }

}
