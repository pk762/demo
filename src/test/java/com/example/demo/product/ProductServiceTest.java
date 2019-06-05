package com.example.demo.product;

import com.example.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Autowired
    ProductRepository productRepository;

    private Product testProduct;

    private void givenTestProduct() {

        testProduct = Product.builder()
                .name("My Fancy Product")
                .price(new BigDecimal(100))
                .uuid(UUID.randomUUID())
                .build();
    }

    @Test
    public void should_create_product() {

        //GIVEN
        givenTestProduct();

        //WHEN
        productService.createProduct(testProduct);

        //THEN
        assertEquals(
            true, productRepository.findById(testProduct.getUuid()).isPresent()
        );
    }

    public void should_delete_product() {

    }

    public void should_get_product() {

    }

    public void should_update_product() {

    }
}
