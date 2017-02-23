package org.dixon.demo.account;

import com.querydsl.core.types.dsl.StringPath;

import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author dickson
 */
public interface AccountRepository extends PagingAndSortingRepository<Account, Long>, QueryDslPredicateExecutor<Account> {

  default void customize(QuerydslBindings bindings, org.dixon.demo.account.QAccount account) {

    bindings.bind(account.accName).first(
        (path, value) -> path.equalsIgnoreCase(value));
    bindings.bind(String.class).first(
        (StringPath path, String value) -> path.containsIgnoreCase(value));
  }

}
