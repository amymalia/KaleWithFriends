package models;

/**
 * Model for Ingredients.
 * <p/>
 * Created by Jack on 4/4/2015.
 */
public class Ingredient {

  protected String name;
  protected int quantity;

  /**
   * Creates an ingredient object.
   *
   * @param name     The name of the ingreident.
   * @param quantity The quantity of the ingredient.
   */
  public Ingredient(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  /**
   * Gets the name of the ingreident.
   *
   * @return The name.
   */
  public String getName() {
    return name;
  }

  /**
   * Gets the quantity of the ingredient.
   *
   * @return The quantity.
   */
  public int getQuantity() {
    return quantity;
  }
}
