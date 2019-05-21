package newthreetaskglasses;

import interfacesAll.IProductPart;

public class ProductArms implements IProductPart {

    String productArms;

    ProductArms(String ArmsProduct) {
        this.productArms = ArmsProduct;
        System.out.println("Создание дужек для очков.");
        System.out.println("мы часть очков - дужки!");
    }

}
