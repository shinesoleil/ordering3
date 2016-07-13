package com.thoughtworks.api.web;

import com.thoughtworks.api.domain.core.ProductRepository;
import com.thoughtworks.api.infrastructure.records.Product;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("products")
public class ProductsApi {

  @Inject
  ProductRepository productRepository;

  @POST
  public Response createProduct() {
    Product product = productRepository.create();

    return Response.status(201).build();
  }
}
