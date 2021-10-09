/*
 * ---------------------------------------------------------------------------------------------
 *  *  Copyright (c) IJSE-exams. All rights reserved.
 *  *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  *--------------------------------------------------------------------------------------------
 */

package bo;
/*
 * @author Yohan Samitha
 * @since 10/9/2021
 */

import bo.custom.impl.ManageCustomerBOImpl;

public class BOFactory {
    static BOFactory boFactory;

    public BOFactory() {
    }

    public static BOFactory getInstance() {
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public SuperBO getBO(BoType boType) {
        switch (boType) {
            case ManageCustomerBOImpl:
                return new ManageCustomerBOImpl();
            default:
                return null;
        }
    }

    public enum BoType {
        ManageCustomerBOImpl,
    }
}
