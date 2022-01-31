package controller;

import entity.Product;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.ProductService;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/new")
    public String showNewProductPage(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);

        return "new_product";
    }

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Product> listProducts = productService.listAll();
        model.addAttribute("listProducts", listProducts);

        return "index";
    }

    @RequestMapping(value = "/hello")
    public String getHello(Model model) {
        Product product = new Product();
        product.setName("NAME");
        model.addAttribute("product", product);
        return "hello";
    }

    @GetMapping("/product")
    public List<Product> getProductsByPrice(@RequestParam float price) {
        return productService.getProductsByPrice(price);
    }
}
