/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.HashMap;

/**
 *
 * @author sujithkaluva
 */
public class CommunityAdminDirectory {
    private static HashMap<String,String> passwordManager;

    public CommunityAdminDirectory() {
        passwordManager = new HashMap<String,String>();
    }

    public HashMap<String, String> getPasswordManager() {
        return passwordManager;
    }

    public void setPasswordManager(HashMap<String, String> passwordManager) {
        this.passwordManager = passwordManager;
    }
    public void addPasswordManager(String a, String b) {
         this.passwordManager.put(a, b);
    }
}
