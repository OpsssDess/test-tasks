package newthreetaskglasses;

import interfacesAll.IProduct;
import interfacesAll.IProductPart;

public class InstalationProducts implements IProduct {

    IProductPart Lenses;
    IProductPart Arms;
    IProductPart BodyFromGlasses;

    InstalationProducts(ProductBodyFromGlasses body, ProductArms arms, ProductLenses lenses) {
        this.BodyFromGlasses = body;
        this.Arms = arms;
        this.Lenses = lenses;
    }

    @Override
    public void installFirstPart(IProductPart productPart) {
        System.out.println("Оправа установлена");
        System.out.println();
    }

    @Override
    public void installSecondPart(IProductPart productPart) {
        System.out.println("Дужки установлены");
        System.out.println();
    }

    @Override
    public void installThirdPart(IProductPart productPart) {
        System.out.println("Линзы установлены");
        System.out.println();
    }

    InstalationProducts() {
    }
}
