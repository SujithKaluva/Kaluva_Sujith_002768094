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
public class SystemAdminDirectory {
    
    private static HashMap<String,String> passwordManager;

    public SystemAdminDirectory() {
        passwordManager = new HashMap<>();
        passwordManager.put("sysadmin", "sysadmin");
    }

    public HashMap<String, String> getPasswordManager() {
        return passwordManager;
    }

    public void setPasswordManager(HashMap<String, String> passwordManager) {
        this.passwordManager = passwordManager;
    }
    
}
