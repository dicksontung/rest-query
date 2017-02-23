package org.dixon.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * Sample app for using ELK stack for storage and presentation of REST API audit
 *
 * @author dickson
 */
@SpringBootApplication
@EntityScan("org.dixon.demo")
@ComponentScan("org.dixon.demo")
public class DemoApplication {

  public static void main(String[] args) throws Exception {
    SpringApplication.run(DemoApplication.class, args);
  }

}
