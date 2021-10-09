/*
 * ---------------------------------------------------------------------------------------------
 *  *  Copyright (c) IJSE-exams. All rights reserved.
 *  *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  *--------------------------------------------------------------------------------------------
 */

package dto;
/*
 * @author Yohan Samitha
 * @since 10/9/2021
 */

public class CustomerDTO {
    private String CusName;
    private String CusAddress;
    private String TelephoneNumber;
    private String Email;

    public CustomerDTO(String cusName, String cusAddress, String telephoneNumber, String email) {
        CusName = cusName;
        CusAddress = cusAddress;
        TelephoneNumber = telephoneNumber;
        Email = email;
    }

    public CustomerDTO() {
    }

    public String getCusName() {
        return CusName;
    }

    public void setCusName(String cusName) {
        CusName = cusName;
    }

    public String getCusAddress() {
        return CusAddress;
    }

    public void setCusAddress(String cusAddress) {
        CusAddress = cusAddress;
    }

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        TelephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "CusName='" + CusName + '\'' +
                ", CusAddress='" + CusAddress + '\'' +
                ", TelephoneNumber='" + TelephoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
