// final класс - нельзя наследовать
final class SecurityKey {
    private String keyData;
    
    public SecurityKey(String keyData) {
        this.keyData = keyData;
    }
    
    public String getEncryptedKey() {
        // какой-то метод шифрования
        return "encrypted_" + keyData;
    }
    
    public boolean validateKey() {
        return keyData != null && keyData.length() >= 8;
    }
}

class BasicAuth {
    protected String username;
    
    public BasicAuth(String username) {
        this.username = username;
    }
    
    public void login() {
        System.out.println("пользователь " + username + " вошел в систему");
    }
}

// можно наследовать обычный класс
class AdminAuth extends BasicAuth {
    private String role;
    
    public AdminAuth(String username, String role) {
        super(username);
        this.role = role;
    }
    
    @Override
    public void login() {
        System.out.println("администратор " + username + " с ролью " + role + " вошел в систему");
    }
}

public class FinalClassExample {
    public static void main(String[] args) {
        // работа с final классом
        SecurityKey key = new SecurityKey("mySecretKey123");
        System.out.println("зашифрованный ключ: " + key.getEncryptedKey());
        System.out.println("ключ валиден: " + key.validateKey());
        
        // работа с обычным классом и его наследником
        BasicAuth user = new BasicAuth("ivan");
        user.login();
        
        AdminAuth admin = new AdminAuth("alex", "superuser");
        admin.login();
        
    }
}