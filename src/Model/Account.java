/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;


/**
 *
 * @author ZIPTECH LTD
 */
public class Account implements Serializable{
    private Integer accountId;
    private String password;
    private boolean status;
    private String permisions;
    private Employee theEmployee;

    public Account() {
    }

    public Account(Integer accountId, String password, boolean status, String permisions, Employee theEmployee) {
        this.accountId = accountId;
        this.password = password;
        this.status = status;
        this.permisions = permisions;
        this.theEmployee = theEmployee;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public String getPermisions() {
        return permisions;
    }

    public void setPermisions(String permisions) {
        this.permisions = permisions;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Employee getTheEmployee() {
        return theEmployee;
    }

    public void setTheEmployee(Employee theEmployee) {
        this.theEmployee = theEmployee;
    }
    
    
}
