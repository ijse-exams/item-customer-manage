/*
 * ---------------------------------------------------------------------------------------------
 *  *  Copyright (c) IJSE-exams. All rights reserved.
 *  *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  *--------------------------------------------------------------------------------------------
 */

package bo.custom;
/*
 * @author Yohan Samitha
 * @since 10/9/2021
 */

import bo.SuperBO;
import dto.CustomerDTO;

import java.sql.SQLException;

public interface ManageCustomerBO extends SuperBO {
    boolean addCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
}
