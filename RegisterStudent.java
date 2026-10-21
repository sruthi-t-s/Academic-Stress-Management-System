import javax.swing.*;

public class RegisterStudent {

    public RegisterStudent() {

        JFrame frame = new JFrame("Student Registration");
        frame.setSize(400, 350);
        frame.setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(40, 50, 120, 30);
        frame.add(userLabel);

        JTextField username = new JTextField();
        username.setBounds(170, 50, 180, 30);
        frame.add(username);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(40, 100, 120, 30);
        frame.add(passLabel);

        JPasswordField password = new JPasswordField();
        password.setBounds(170, 100, 180, 30);
        frame.add(password);

        JLabel confirmLabel = new JLabel("Confirm Password:");
        confirmLabel.setBounds(40, 150, 130, 30);
        frame.add(confirmLabel);

        JPasswordField confirm = new JPasswordField();
        confirm.setBounds(170, 150, 180, 30);
        frame.add(confirm);

        JButton register = new JButton("Register");
        register.setBounds(140, 220, 120, 35);
        frame.add(register);
        register.addActionListener(e -> {

    String user = username.getText().trim();
    String pass = new String(password.getPassword());
    String confirmPass = new String(confirm.getPassword());

    if (user.isEmpty() || pass.isEmpty()) {
        JOptionPane.showMessageDialog(frame,
            "Please fill all fields");

    } else if (user.length() > 50) {
        JOptionPane.showMessageDialog(frame,
            "Username must be 50 characters or less");

    } else if (pass.length() < 6) {
        JOptionPane.showMessageDialog(frame,
            "Password must have at least 6 characters");

    } else if (!pass.equals(confirmPass)) {
        JOptionPane.showMessageDialog(frame,
            "Passwords do not match");

    } else {
        boolean success =
            RegistrationDatabase.registerStudent(user, pass);

        if (success) {
            JOptionPane.showMessageDialog(frame,
                "Registration Successful! Please Login.");
            frame.dispose();
        } else {
            JOptionPane.showMessageDialog(frame,
                "Registration failed. Username may already exist.");
        }
    }
});

        frame.setDefaultCloseOperation(
            JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}