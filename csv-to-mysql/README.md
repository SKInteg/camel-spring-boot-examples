# README #

### How do I get set up? ###

To build this project use

    mvn install
	  
	  
	  
	  
To run

    mvn:spring-boot:run

### For the beginners ###

1. Download Mysql community server zip
2. Unzip
3. Run : mysqld --initialize-insecure under bin directory
4. Start Mysql server using : mysqld
5. Login using : mysql -u root
6. Set password for root : ALTER USER 'root'@'localhost' IDENTIFIED BY 'root';
7. Exit and login using : mysql -u root -proot
8. Copy paste the contents from src/main/docs/employee_schema.sql
9. Run under csv-to-mysql : mvn clean install spring-boot:run
10. Copy paste the file src/main/docs/employee_data.csv into C:\\input folder
