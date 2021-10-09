/*
 * ---------------------------------------------------------------------------------------------
 *  *  Copyright (c) IJSE-exams. All rights reserved.
 *  *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  *--------------------------------------------------------------------------------------------
 */

package dao;
/*
 * @author Yohan Samitha
 * @since 10/9/2021
 */

import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CrudUtil {
    private static PreparedStatement getPreparedStatement(String sql, Object... params) throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            preparedStatement.setObject((i + 1), params[i]);
        }
        return preparedStatement;
    }

    public static boolean executeUpdate(String sql, Object... params) throws SQLException, ClassNotFoundException {
        return getPreparedStatement(sql, params).executeUpdate() > 0;
    }

    public static ResultSet executeQuery(String sql, Object... params) throws SQLException, ClassNotFoundException {
        return getPreparedStatement(sql, params).executeQuery();
    }
}
