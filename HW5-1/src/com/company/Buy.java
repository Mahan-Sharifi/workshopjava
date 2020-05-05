package com.company;

public class Buy {
  private String ProductName;
  private String ProductInformation;
  private String ProductPrice;
  private String ProductWeight;
  
  public String getProductName(){
    return ProductName;
}
  public void setProductName(String productName)throws BuyExeption{
    if(productName.isEmpty){
      throw new BuyExeption("Didn't enter your ProductName");
    }
    else
      ProductName=productName;
  }
  public String getProductInformation(){
    return ProductInformation;
  }
  public void setProductInformation(String productInformation)throws BuyExeption{
    if(productInformation.isEmpty){
      throw new BuyExeption("Didn't enter your ProductInformation");
    }
    else
      ProductName=productname;
  }
  public String getProductPrice(){
    return ProductPrice;
  public void setProductPrice(String productPrice)throws BuyExeption{
    if(productPrice.isEmpty){
      throw new BuyExeption("Didn't enter your ProductPrice");
    }
    else
      ProductPrice=productPrice;
  }
    public String getProductWeight(){
      return ProductWeight;
    public void setProductWeight(String productWeight)throws BuyExeption{
      if(productWeight.isEmpty){
        throw new BuyExeption("Didn't enter your ProductWeight");
      }
      else
        ProductPrice=productprice;
    }
      public void Accepting(){
        System.out.println("The buying was successful");
        system.out.println("Good Luck");
    
    
    
    
    
