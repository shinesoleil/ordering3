package com.thoughtworks.api.web;

import com.thoughtworks.api.support.ApiSupport;
import com.thoughtworks.api.support.ApiTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ws.rs.core.Response;
import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(ApiTestRunner.class)
public class ProductsApiTest extends ApiSupport{

  @Test
  public void should_return_201_when_post_success() {
    Response post = post("products", new HashMap<String, Object>());

    assertThat(post.getStatus(), is(201));
  }
}
