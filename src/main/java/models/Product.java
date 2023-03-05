package models;

public final class Product {

  private int id;
  private String name;
  private  String description;
  private double price;
  private int category_id;

  public Product() {}

  //Used for POST requests
  public Product(String name, String description, double price, int category_id) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.category_id = category_id;
  }

  //Used for PUT requests
  public Product(int id, String name, String description, double price, int category_id) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.category_id = category_id;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getCategory_id() {
    return category_id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setCategory_id(int category_id) {
    this.category_id = category_id;
  }
}
