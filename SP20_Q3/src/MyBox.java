
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class MyBox implements IBox {

//    Tăng giá 10% nếu Code start with "K"
    @Override
    public void f1(List<Box> list) {
        for (Box box : list) {
            if (box.getCode().startsWith("K")) {
                double newPrice = box.getPrice() + box.getPrice() * 0.1;
                box.setPrice(newPrice);
            }
        }
    }

//    Count price > d
    @Override
    public int f2(List<Box> list, double d) {
        int count = 0;
        for (Box box : list) {
            if (box.getPrice() > d) {
                count++;
            }
        }
        return count;
    }

//    Remove box sau minPrice (nếu min là phần tử cuối cùng thì không remove)
    @Override
    public void f3(List<Box> list) {
        // Tìm min price và indexmin
        double minPrice = Double.MAX_VALUE;
//        double minPrice = Double.POSITIVE_INFINITY;
        int minIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < minPrice) {
                minPrice = list.get(i).getPrice();
                minIndex = i;
            }
        }
        // Remove phần tử sau min thư i+1
        if (minIndex >= 0 && minIndex < list.size() - 1) {
            list.remove(minIndex + 1);
        }

    }

}
