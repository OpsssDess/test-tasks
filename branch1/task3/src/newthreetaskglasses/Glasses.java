package newthreetaskglasses;

import interfacesAll.IAssemblyLine;
import interfacesAll.IProduct;

public class Glasses implements IAssemblyLine {

    @Override
    public IProduct assembleProduct(IProduct iProduct) {

        ProductBodyFromGlasses body = (ProductBodyFromGlasses) new CreatureFirstPart().buildProductPart();
        iProduct.installFirstPart(body);

        ProductArms arms = (ProductArms) new CreatureSecondPart().buildProductPart();
        iProduct.installSecondPart(arms);

        ProductLenses lenses = (ProductLenses) new CreatureThirdPart().buildProductPart();
        iProduct.installThirdPart(lenses);

        InstalationProducts instalation = new InstalationProducts(body, arms, lenses);
        System.out.println("Очки готовы");

        return instalation;
    }
}
