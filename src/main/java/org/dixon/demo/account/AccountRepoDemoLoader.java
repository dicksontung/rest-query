package org.dixon.demo.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @author dickson
 */
@Component
public class AccountRepoDemoLoader implements CommandLineRunner {

  private final AccountRepository repository;

  @Autowired
  public AccountRepoDemoLoader(AccountRepository repository) {this.repository = repository;}

  @Override
  public void run(String... args) throws Exception {
    BigDecimal balance = new BigDecimal("100");
    for (int i = 0; i <=5; i++){
      Account dummyAcc = new Account();
      dummyAcc.setAccName("dummy"+i);
      dummyAcc.setAccType("current");
      dummyAcc.setBalance(balance);
      balance = balance.add(new BigDecimal("5"));
      this.repository.save(dummyAcc);
    }
    for (int i = 6; i <=10; i++){
      Account dummyAcc = new Account();
      dummyAcc.setAccName("dummy"+i);
      dummyAcc.setAccType("saving");
      balance = balance.multiply(new BigDecimal("5"));
      this.repository.save(dummyAcc);
    }

  }

}
