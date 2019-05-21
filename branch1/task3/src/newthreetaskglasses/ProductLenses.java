package newthreetaskglasses;

import interfacesAll.IProductPart;

public class ProductLenses implements IProductPart {

    String productLenses;

    ProductLenses(String lensesProduct) {
        this.productLenses = lensesProduct;
        System.out.println("Создание линз для очков.");
        System.out.println("мы часть очков - линзы!");
    }

}
