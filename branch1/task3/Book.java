package testsvk;

public class Book {
public static void main(String [] args){
    SampleBook book = new SampleBook();
    book.assembleProduct(new InstalationProducts());
    System.out.println();
}
}

interface IAssemblyLine {
    IProduct assembleProduct(IProduct iProduct);
}

interface ILineStep {
    IProductPart buildProductPart();
}

interface IProduct {
    void installFirstPart(IProductPart productPart);
    void installSecondPart(IProductPart productPart);
    void installThirdPart(IProductPart productPart);
}

interface IProductPart {
}


class CreatureFirstPart implements ILineStep{
    @Override
    public IProductPart buildProductPart() {
        System.out.println("Вот Ваши страницы для книги");
        return new ProductPages("страницы");
    }
    }
class ProductPages implements IProductPart{
        String productPages;
        ProductPages(String pagesProduct) {
            this.productPages = pagesProduct;
        }
    }




class CreatureSecondPart implements ILineStep {
        @Override
        public IProductPart buildProductPart() {
            System.out.println("Вот обложка для книги");
            return new ProductCover("обложка");
        }
    }
class ProductCover implements IProductPart{
        String productCover;
        ProductCover(String coverProduct) {
            this.productCover = coverProduct;
        }
    }



class CreatureThirdPart implements ILineStep{
        @Override
        public IProductPart buildProductPart() {
            System.out.println("Ваша закладка для книги");
            return new ProductBookMark("закладка") ;
        }
    }
class ProductBookMark implements IProductPart{
        String productBookMark;
        ProductBookMark(String productMark) {
            this.productBookMark = productMark;}
    }

class InstalationProducts implements IProduct{
    IProductPart pages;
    IProductPart cover;
    IProductPart bookMark;
    
    InstalationProducts(ProductPages pages, ProductCover cover, ProductBookMark bookMark){
            this.pages = pages;
            this.cover = cover;
            this.bookMark = bookMark;
        }
     @Override
        public void installFirstPart(IProductPart productPart) {
            System.out.println("Сраницы приклеены");
            System.out.println();
        }

        @Override
        public void installSecondPart(IProductPart productPart) {
            System.out.println("Обложка приклеена");
            System.out.println();
        }

        @Override
        public void installThirdPart(IProductPart productPart) {
            System.out.println("закладка вложена");
            System.out.println();
        }

        InstalationProducts(){}

}

class SampleBook implements IAssemblyLine{
  @Override
    public IProduct assembleProduct(IProduct iProduct) {

        ProductPages pages = (ProductPages) new CreatureFirstPart().buildProductPart();
        iProduct.installFirstPart(pages);

        ProductCover cover = (ProductCover) new CreatureSecondPart().buildProductPart();
        iProduct.installSecondPart(cover);

        ProductBookMark bookMark = (ProductBookMark) new CreatureThirdPart().buildProductPart();
        iProduct.installThirdPart(bookMark);

        InstalationProducts instalation = new InstalationProducts(pages, cover, bookMark);
        System.out.println("экзмепляр книги готов");

        return instalation;
    }
}