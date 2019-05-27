package newthreetaskglasses4;

import eu.presniak.ivan.api.ILineStep;
import eu.presniak.ivan.api.IProductPart;

public class CreatureSecondPart implements ILineStep {

    public IProductPart buildProductPart() {
        IProductPart arms = new ProductArms("дужки");

        System.out.println("Создание шаблона Дужек для очков.");
        System.out.println("Дужки для очков готовы");

        return arms;
    }

}
