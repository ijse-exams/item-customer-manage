/*
 * ---------------------------------------------------------------------------------------------
 *  *  Copyright (c) IJSE-exams. All rights reserved.
 *  *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  *--------------------------------------------------------------------------------------------
 */

package bo.custom.impl;
/*
 * @author Yohan Samitha
 * @since 10/9/2021
 */

import bo.custom.ManageCustomerBO;
import dao.DAOFactory;
import dao.custom.CustomerDAO;
import dto.CustomerDTO;
import entity.Customer;

import java.sql.SQLException;

public class ManageCustomerBOImpl implements ManageCustomerBO {
    CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.CustomerDAOImpl);

    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException {
        return customerDAO.add(new Customer(
                customerDTO.getCusName(),
                customerDTO.getCusAddress(),
                customerDTO.getTelephoneNumber(),
                customerDTO.getEmail()
        ));
    }
}
