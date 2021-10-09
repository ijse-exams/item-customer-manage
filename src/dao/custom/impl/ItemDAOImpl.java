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
import dao.custom.ItemDAO;
import entity.Item;

import java.sql.SQLException;

public class ItemDAOImpl implements ItemDAO {
    @Override
    public boolean add(Item item) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO item(ItemName, ItemQty, Price) VALUES (?,?,?)";
        return CrudUtil.executeUpdate(sql,
                item.getItemName(),
                item.getItemQty(),
                item.getPrice()
        );
    }
}
