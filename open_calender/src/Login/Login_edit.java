package Login;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Login_edit extends JFrame {

    private JPanel contentPane;
    private JTextField txtId;
    private JTextField txtPw;

    private String sID = "";
    private String sPW = "";

    public Login_edit() {

        setTitle("Login System Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 522, 164);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblId = new JLabel("ID");
        lblId.setHorizontalAlignment(SwingConstants.CENTER);
        lblId.setBounds(40, 30, 47, 15);
        contentPane.add(lblId);

        txtId = new JTextField();
        txtId.setText("");
        // sID = txtId.getText();
        txtId.setBounds(99, 27, 167, 21);
        contentPane.add(txtId);
        txtId.setColumns(10);

        JLabel lblPw = new JLabel("PW");
        lblPw.setHorizontalAlignment(SwingConstants.CENTER);
        lblPw.setBounds(40, 55, 47, 15);
        contentPane.add(lblPw);

        txtPw = new JTextField();
        txtPw.setText("");
        // sPW = txtId.getText();
        txtPw.setBounds(99, 52, 167, 21);
        contentPane.add(txtPw);
        txtPw.setColumns(10);

        JButton btnNewButton_Login = new JButton("로그인");

        btnNewButton_Login.setBounds(274, 27, 102, 46);
        contentPane.add(btnNewButton_Login);

        JButton btnNewButton_Sign = new JButton("회원 가입");

        btnNewButton_Sign.setBounds(274, 80, 102, 30);
        contentPane.add(btnNewButton_Sign);

        JButton button_FindID = new JButton("ID 찾기");

        button_FindID.setBounds(40, 80, 109, 30);
        contentPane.add(button_FindID);
    }

    private void GetIdandPw(JTextField txtId, JTextField txtPw) {
        // TODO Auto-generated method stub
        sID = txtId.getText();
        sPW = txtPw.getText();
    }
}

