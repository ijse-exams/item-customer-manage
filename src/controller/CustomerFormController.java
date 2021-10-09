/*
 * ---------------------------------------------------------------------------------------------
 *  *  Copyright (c) IJSE-exams. All rights reserved.
 *  *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  *--------------------------------------------------------------------------------------------
 */

package controller;
/*
 * @author Yohan Samitha
 * @since 10/9/2021
 */

import bo.BOFactory;
import bo.custom.ManageCustomerBO;
import com.jfoenix.controls.JFXTextField;
import dto.CustomerDTO;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.sql.SQLException;

public class CustomerFormController {
    public JFXTextField txtCusName;
    public JFXTextField txtCusAddress;
    public JFXTextField txtTelephoneNumber;
    public JFXTextField txtEmail;

    ManageCustomerBO manageCustomerBO = (ManageCustomerBO) BOFactory.getInstance().getBO(BOFactory.BoType.ManageCustomerBOImpl);

    public void btnCreate(ActionEvent actionEvent) {
        CustomerDTO customerDTO = new CustomerDTO(txtCusName.getText(), txtCusAddress.getText(), txtTelephoneNumber.getText(), txtEmail.getText());
        try {
            boolean isCustomerAdded = manageCustomerBO.addCustomer(customerDTO);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            if (isCustomerAdded) {
                alert.setContentText("Customer Saved SuccessFully!");
                cleanAll();
            } else {
                alert.setContentText("Something went Wrong!");
                alert.showAndWait();
            }
        } catch (SQLException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    private void cleanAll() {
        txtCusName.setText(null);
        txtCusAddress.setText(null);
        txtTelephoneNumber.setText(null);
        txtEmail.setText(null);
    }

    public void btnCancel(ActionEvent actionEvent) {
        cleanAll();
    }
}
