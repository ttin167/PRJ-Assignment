/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Admin
 */
public class PersonalMealPlans extends Menu{
    private String userId;
    private String menuId;
    private int weekNumber;
    private int dayOfWeek;

    public PersonalMealPlans() {
    }

    public PersonalMealPlans(String userId, String menuId, int weekNumber, int dayOfWeek) {
        this.userId = userId;
        this.menuId = menuId;
        this.weekNumber = weekNumber;
        this.dayOfWeek = dayOfWeek;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public int getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
    
}
