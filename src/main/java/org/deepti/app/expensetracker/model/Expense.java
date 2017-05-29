package org.deepti.app.expensetracker.model;

import org.springframework.data.annotation.Id;
import lombok.Data;

@Data
public class Expense {
  @Id
  private String expenseID;
  private String category;
  private int money;

  public Expense() {

  }
  public Expense(String category, int money) {
    this.category = category;
    this.money = money;
  }

   @Override
  public String toString() {
    return "Category : " + this.category + " money: " + this.money;
   }
}
