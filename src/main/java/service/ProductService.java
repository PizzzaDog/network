package service;

import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private UserService userService;

    @Autowired
    private ProductRepository productRepository;

    public List<Product> listAll() {
        return productRepository.findAll();
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public List<Product> getProductsByPrice(float price) {
        List<Product> result = productRepository.findAllByPrice(price);
        if (result == null || result.isEmpty()) {
            return new ArrayList<>();
        }
        return result;
    }

    public Product get(long id) {
        return productRepository.findById(id).get();
    }

    public void delete(long id) {
        productRepository.deleteById(id);
    }
}
