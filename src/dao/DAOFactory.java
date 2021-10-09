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

import dao.custom.impl.CustomerDAOImpl;

public class DAOFactory {
    static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }

    public SuperDAO getDAO(DAOType daoType) {
        switch (daoType) {
            case CustomerDAOImpl:
                return new CustomerDAOImpl();
            default:
                return null;
        }
    }

    public enum DAOType {
        CustomerDAOImpl,
    }
}
