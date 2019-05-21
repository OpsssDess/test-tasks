package newthreetaskglasses;

import interfacesAll.IProductPart;

public class ProductBodyFromGlasses implements IProductPart {

    String productBody;

    ProductBodyFromGlasses(String bodyProduct) {
        this.productBody = bodyProduct;
        System.out.println("Создание оправы для очков.");
        System.out.println("я часть очков - оправа!");
        
    }

}
