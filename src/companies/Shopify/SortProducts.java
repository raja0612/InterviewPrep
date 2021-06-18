package src.companies.Shopify;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    String product;
    int popularity;
    int price;

    public Product(String product, int popularity, int price) {
        this.product = product;
        this.popularity = popularity;
        this.price = price;
    }
    public String toString() {
        return this.product + "\t"+ this.popularity + "\t" + this.price + "\n";
    }
}

class SortByPopularityAndPrice implements Comparator<Product> {


    @Override
    public int compare(Product p1, Product p2) {
        if(p1.popularity == p2.popularity) {
            return p1.price - p2.price;
        }
        return p2.popularity - p1.popularity;
    }
}

class SortByProuductName implements  Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        return o1.product.compareTo(o2.product);
    }
}

public class SortProducts {

    public static  void main(String args[]) {

        ArrayList<Product> ar = new ArrayList<>();
        ar.add(new Product("ab", 98, 89));
        ar.add(new Product("abc", 98, 78));
        ar.add(new Product("abb", 100,67));

       Collections.sort(ar, new SortByPopularityAndPrice());



      for(Product pr: ar) {
          System.out.println(pr.product+ " " +pr.popularity + " "+ pr.price);
      }

      Collections.sort(ar, new SortByProuductName());

        for(Product pr: ar) {
            System.out.println(pr.product+ " " +pr.popularity + " "+ pr.price);

        }

        Collections.sort(ar, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.price - o2.price;
            }
        });

        for(Product pr: ar) {
            System.out.println(pr.product+ " " +pr.popularity + " "+ pr.price);
        }

    }
}
