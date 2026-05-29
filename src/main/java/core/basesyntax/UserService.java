package core.basesyntax;

public class UserService {
    PasswordValidator passwordValidator = new PasswordValidator();
    public void registerUser(String password, String repeatPassword) {
        try {
            passwordValidator.validate(password, repeatPassword);
            // якщо сюди дійшли — паролі OK
            saveUser(user);
        } catch (PasswordValidationException e) {
            // якщо піймали виняток — друкуємо повідомлення
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
