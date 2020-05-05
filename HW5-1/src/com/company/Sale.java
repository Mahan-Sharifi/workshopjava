package com.company;

public class Sale {
  private String ProductName;
  private String ProductPrice;
  private String ProductWeight;
  
  public String getProductName(){
    return ProductName;
}
  public void setProductName(String productName)throws SaleExeption{
    if(productName.isEmpty){
      throw new SaleExeption("Didn't enter your ProductName");
    }
    else
      ProductName=productName;
  }
  
  public String getProductPrice(){
    return ProductPrice;
  }
  public void setProductPrice(String productPrice)throws SaleExeption{
    if(productPrice.isEmpty){
      throw new SaleExeption("Didn't enter your ProductPrice");
    }
    else
      ProductPrice=productPrice;
  }
    public String getProductWeight(){
      return ProductWeight;
    }
    public void setProductWeight(String productWeight)throws SaleExeption{
      if(productWeight.isEmpty){
        throw new SaleExeption("Didn't enter your ProductWeight");
      }
      else
        ProductWeight=productWeight;
    }
      public void Accepting(){
        System.out.println("The Saling was successful");
        system.out.println("Good Luck");
      }
}
