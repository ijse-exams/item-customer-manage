/*
 * ---------------------------------------------------------------------------------------------
 *  *  Copyright (c) IJSE-exams. All rights reserved.
 *  *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  *--------------------------------------------------------------------------------------------
 */

DROP DATABASE IF EXISTS ijse_exams;
CREATE DATABASE IF NOT EXISTS ijse_exams;
USE ijse_exams;

CREATE TABLE customer
(
    CustomerID      int PRIMARY KEY AUTO_INCREMENT,
    CusName         VARCHAR(200) NOT NULL,
    CusAddress      VARCHAR(200) NOT NULL,
    TelephoneNumber VARCHAR(17)  NOT NULL,
    Email           VARCHAR(320)
);

insert into customer(CusName, CusAddress, TelephoneNumber, Email)
VALUES ("thilina", "thuduwawa", "56846546844", "thilina@gamail.com")

select *
from customer;
