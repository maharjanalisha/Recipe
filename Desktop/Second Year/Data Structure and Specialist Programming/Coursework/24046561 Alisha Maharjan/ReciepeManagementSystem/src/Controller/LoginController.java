package Controller;

import View.MainFrame;

public class LoginController {

    private MainFrame mainFrame;

    public LoginController(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    // Allow ANY username & password (just not empty)
    public boolean authenticate(String username, String password) {

        if (username == null || username.trim().isEmpty()) {
            return false;
        }

        if (password == null || password.trim().isEmpty()) {
            return false;
        }

        // No restriction — accept all
        return true;
    }

    // Navigate based on role
    public void loginSuccess(boolean isAdmin) {
        if (isAdmin) {
            mainFrame.showScreen("ADMIN");
        } else {
            mainFrame.showScreen("USER");
        }
    }
}
