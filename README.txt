## To Run the Project 

cd HospitalApp
./mvnw spring-boot:run

# the application will start


### End Point created 
# I was using swagger for documentaion but was getting error but in absence of that 
# i am writting the end poins 
# I have loade the joson file in the H2 database at the starting of the spring boot
#  
n used postman or browser or own httpclient
# to get all the Hospital Info hit below URL
  1)   localhost:8080/getAllHospital
# To get Hospital by id use below api 
  3)   localhost:8080/getHospital/id
# To get hospital by name and state
      localhost:8080/getHospitalByNameAndState?hospitalName=REGIONAL HOSPITAL KOTMA COLLIERY&stateName=MADHYA PRADESH
  4) To get hospitable by Hospitable Type and Name
     localhost:8080/getHospitalByTypeAndName?hospitalName=REGIONAL HOSPITAL KOTMA COLLIERY&hospitalType=Public 
