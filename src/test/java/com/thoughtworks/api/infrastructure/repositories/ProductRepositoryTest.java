package com.thoughtworks.api.infrastructure.repositories;

import com.thoughtworks.api.domain.core.ProductRepository;
import com.thoughtworks.api.infrastructure.records.Product;
import com.thoughtworks.api.support.DatabaseTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(DatabaseTestRunner.class)
public class ProductRepositoryTest {
  @Inject
  ProductRepository productRepository;

  @Test
  public void should_create_product_with_name_and_find_by_productId() {
    String productId = productRepository.generateId();

    Product product = new Product(productId, "desk");

    productRepository.create(product);

    Product createdProduct = productRepository.findById(productId);

    assertThat(createdProduct.getName(), is("desk"));
  }


}
