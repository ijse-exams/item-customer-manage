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

public class ItemDTO {
    private String ItemName;
    private String ItemQty;
    private String Price;

    public ItemDTO(String itemName, String itemQty, String price) {
        ItemName = itemName;
        ItemQty = itemQty;
        Price = price;
    }

    public ItemDTO() {
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public String getItemQty() {
        return ItemQty;
    }

    public void setItemQty(String itemQty) {
        ItemQty = itemQty;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "ItemName='" + ItemName + '\'' +
                ", ItemQty='" + ItemQty + '\'' +
                ", Price='" + Price + '\'' +
                '}';
    }
}
