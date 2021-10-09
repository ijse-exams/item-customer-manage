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

import bo.custom.ManageItemBO;
import dao.DAOFactory;
import dao.custom.ItemDAO;
import dto.ItemDTO;
import entity.Item;

import java.sql.SQLException;

public class ManageItemBOImpl implements ManageItemBO {
    ItemDAO itemDAO = (ItemDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.ItemDAOImpl);

    @Override
    public boolean addItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException {
        return itemDAO.add(new Item(
                itemDTO.getItemName(),
                itemDTO.getItemQty(),
                itemDTO.getPrice()
        ));
    }
}
