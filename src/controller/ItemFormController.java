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
import bo.custom.ManageItemBO;
import com.jfoenix.controls.JFXTextField;
import dto.ItemDTO;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

import java.sql.SQLException;

public class ItemFormController {
    public JFXTextField txtItemName;
    public JFXTextField txtItemQty;
    public JFXTextField txtPrice;

    ManageItemBO manageItemBO = (ManageItemBO) BOFactory.getInstance().getBO(BOFactory.BoType.ManageItemBOImpl);

    public void btnCreate(ActionEvent actionEvent) {
        ItemDTO itemDTO = new ItemDTO(txtItemName.getText(), txtItemQty.getText(), txtPrice.getText());
        try {
            boolean isCustomerAdded = manageItemBO.addItem(itemDTO);
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            if (isCustomerAdded) {
                alert.setContentText("Item Saved SuccessFully!");
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
        txtItemName.setText(null);
        txtItemQty.setText(null);
        txtPrice.setText(null);
    }

    public void btnCancel(ActionEvent actionEvent) {
        cleanAll();
    }
}
