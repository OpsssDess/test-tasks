package newthreetaskglasses4;

import eu.presniak.ivan.api.IProductPart;

public class ProductArms implements IProductPart {

    String productArms;
    private int length;
    private String material;

    ProductArms(String ArmsProduct) {
        this.productArms = ArmsProduct;

    }

    ProductArms(String ArmsProduct, int length, String material) {
        this.productArms = ArmsProduct;
        this.material = material;
        this.length = length;

    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;

    }

    public int getlength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;

    }
}
