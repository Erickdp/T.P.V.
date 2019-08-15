
import com.storage.control.ProductTrs;
import com.storage.model.Product;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author erick
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProductTrs p = new ProductTrs();
        List<Product> ptrs = p.read();
        System.out.println(ptrs.size());
        int num = (int) Math.floor(Math.random() * ptrs.size());
    }
    
}
