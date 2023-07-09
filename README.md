<div align = "center">
  <h1> ECommerce Application</h1>
 </div>



## Framework and Language
* Java 
* SpringBoot

## Dependencies
  * SpringWeb
  * Lombok
  * Swagger
  * JPA
  * My SQL Server
    
## Database Used 
  * Sql

## Data Structure
  * ArrayList
    
## Data flow
  **The project has four main packages which are following** 
  
* Controller - Controller package has all the api and Crud operations.
* Services - Service class has all the business logic and it will return the result of that method which is called by controller class . 
* Repository - Respository has all the datasource in it i uses SQL Database
* Model - Model class has four model User , Address , Product and Order
> The flow of data is from controller has all the api and logics of that api has in service class and
service class is using the repository class which has all the data it keeps data source.The api called by user call the controller method
return the logic which is written in service class so service class object is called and service class use data source of repo class.

## Project Summary 
This is ECommerce Project to place orders of products by a user which to be deleivered on user address i have used mappings in this projects. 
In Model Address I have used @Many to one mapping which means a user have many addresses . In Model Order Ihave used @Many to one mapping with user , product 
and address so for user a single user can place many order that's why i uses many to one mapping of order with user , for product a single product orders 
can be many that's why i uses many to one mapping of order with product and for address many to one as many orders can be placed for a single address .Using this Project
We can perfom following operation 
* Create User
* Create Address
* Create Address
* Place an order (Create Order) using userId, productId, addressId
* Get order by order id
* Get user by userid
* Get all products
* Get products based on category (query params)
* delete products based on product id
