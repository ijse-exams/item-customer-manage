/*
 * ---------------------------------------------------------------------------------------------
 *  *  Copyright (c) IJSE-exams. All rights reserved.
 *  *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  *--------------------------------------------------------------------------------------------
 */

package dao.custom.impl;
/*
 * @author Yohan Samitha
 * @since 10/9/2021
 */

import dao.CrudUtil;
import dao.custom.CustomerDAO;
import entity.Customer;

import java.sql.SQLException;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean add(Customer customer) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO customer(CusName, CusAddress, TelephoneNumber, Email) VALUES (?,?,?,?)";
        return CrudUtil.executeUpdate(sql,
                customer.getCusName(),
                customer.getCusAddress(),
                customer.getTelephoneNumber(),
                customer.getEmail()
        );
    }
}
