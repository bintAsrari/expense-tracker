# expense-tracker
This is a personal project. A personal expense tracker dashboard

# Tools used :
IntelliJ IDEA
avien cloud

# To Run the Program:
Run this program in your console or terminal
1. Connect to your own database first ,e.g. MySQL Workbench
2. Edit details in application.properties, edit these 3 values:
   ```
   spring.datasource.url=jdbc:mysql://mysql-1c63a36a-bintasrari-0403.i.aivencloud.com:17118/expensetrackerdb
   spring.datasource.username=avnadmin
   spring.datasource.password=AVNS_CYfhtlsOQiuDmg94amB
   ```
3. cd directory of your project
4. Type this command and run:
  ```
    .\mvnw.cmd spring-boot:run
   ```
5. Go to browser and open : https://localhost:8080/expenses
6. Then you can see the dashboard

# Technical breakdown :
1. Frontend : Thymeleaf (HTML + CSS)
2. Backend : Spring , Java SDK 21 , avien cloud (browser) for mysql


