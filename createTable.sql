imnathanfrickinfleck@gmail.com
DeXyismyCaT2


users
user_id
first_name
last_name
middle_name
created_on
modified_on
user_status

create table users (
user_id INT(11) NOT NULL AUTO_INCREMENT, 
first_name VARCHAR(45) DEFAULT NULL FOREIGN KEY, 
last_name VARCHAR(45) DEFAULT NULL, 
middle_name VARCHAR(45) DEFAULT NULL, 
created_on DATETIME DEFAULT NULL, 
modified_on DATETIME DEFAULT NULL, 
user_status ENUM('ACTIVE','SUSPENDED','INACTIVE') NULL,
PRIMARY KEY(user_id));


CREATE TABLE employer_information (
employer_id INT(11) NOT NULL AUTO_INCREMENT,
employee_id INT(11) NOT NULL AUTO_INCREMENT,
employer_name VARCHAR(45) DEFAULT NULL, 
employer_address VARCHAR(45) DEFAULT NULL, 
created_on DATETIME DEFAULT NULL,
modified_on DATETIME DEFAULT NULL ,
PRIMARY KEY(employer_id),
FOREIGN KEY (employee_id) REFERENCES users(user_id)
);


CREATE TABLE professional_information (
profession_id INT(11) NOT NULL AUTO_INCREMENT,
employee_id INT(11) NOT NULL AUTO_INCREMENT,
profession_name VARCHAR(100) DEFAULT NULL,
created_on DATETIME DEFAULT NULL,
modified_on DATETIME DEFAULT NULL,
PRIMARY KEY(profession_id),
FOREIGN KEY (employee_id) REFERENCES employer_information(employee_id));

CREATE TABLE home_information (
user_id
street_address
city
state
zip_code
)

-- BICYCLE DATABASE CREATION
CREATE TABLE cyclist_information (
user_id INT(11) NOT NULL AUTO_INCREMENT,
first_name VARCHAR(100) DEFAULT NULL,
last_name VARCHAR(100) DEFAULT NULL,
middle_name VARCHAR(100) DEFAULT NULL,
created_on DATETIME DEFAULT NULL,
modified_on DATETIME DEFAULT NULL,
PRIMARY KEY(user_id));

CREATE TABLE bicycle_information (
user_id INT(11) NOT NULL AUTO_INCREMENT,
bicycle_id INT(11) NOT NULL AUTO_INCREMENT,
bicycle_make VARCHAR(45),
bicycle_model VARCHAR(45),
bicycle_serial_number VARCHAR(75),
PRIMARY KEY(bicycle_id),
FOREIGN KEY (user_id) REFERENCES cyclist_information(user_id));

CREATE TABLE home_information (
user_id INT(11) NOT NULL AUTO_INCREMENT,
street_address VARCHAR(100) DEFAULT NULL,
city VARCHAR(100) DEFAULT NULL,
state VARCHAR(75) DEFAULT NULL,
zip_code VARCHAR(10) DEFAULT NULL
FOREIGN KEY (user_id) REFERENCES cyclist_information(user_id)
FOREIGN KEY (user_id) REFERENCES bicycle_information(user_id));
