package org.dixon.demo.account;

import org.joda.time.DateTime;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author dickson
 */
@Entity
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String accType;

  private String accCurCode;

  private String jointAccInd;

  private DateTime createTime;

  private DateTime updateTime;

  private String userId;

  private String accNum;

  private String accName;

  private Boolean visibility;

  private String accStatusCode;

  private String productName;

  private BigDecimal balance;

  /**
   * Default constructor for {@link org.springframework.data.repository.Repository}
   */
  public Account() {
  }

  public Long getId() {
    return id;
  }

  public String getAccType() {
    return accType;
  }

  public void setAccType(String accType) {
    this.accType = accType;
  }

  public String getAccCurCode() {
    return accCurCode;
  }

  public void setAccCurCode(String accCurCode) {
    this.accCurCode = accCurCode;
  }

  public String getJointAccInd() {
    return jointAccInd;
  }

  public void setJointAccInd(String jointAccInd) {
    this.jointAccInd = jointAccInd;
  }

  public DateTime getCreateTime() {
    return createTime;
  }

  public void setCreateTime(DateTime createTime) {
    this.createTime = createTime;
  }

  public DateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(DateTime updateTime) {
    this.updateTime = updateTime;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getAccNum() {
    return accNum;
  }

  public void setAccNum(String accNum) {
    this.accNum = accNum;
  }

  public String getAccName() {
    return accName;
  }

  public void setAccName(String accName) {
    this.accName = accName;
  }

  public Boolean getVisibility() {
    return visibility;
  }

  public void setVisibility(Boolean visibility) {
    this.visibility = visibility;
  }

  public String getAccStatusCode() {
    return accStatusCode;
  }

  public void setAccStatusCode(String accStatusCode) {
    this.accStatusCode = accStatusCode;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public BigDecimal getBalance() {
    return balance;
  }

  public void setBalance(BigDecimal balance) {
    this.balance = balance;
  }
}
