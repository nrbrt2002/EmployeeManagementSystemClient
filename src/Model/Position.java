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

public class Position implements Serializable{
    private Integer positionId;
    private String title;
    private String description;

    public Position() {
    }

    public Position(Integer positionId, String title, String description) {
        this.positionId = positionId;
        this.title = title;
        this.description = description;
    }

    public Integer getPositionId() {
        return positionId;
    }

    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
