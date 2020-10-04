/*
uno de los procesos de los cuales somos aprendices fuera de linea en los medios de los cuales osmos aprendices fuera 
de linea en los ultimos meduos de los cuales somos desarrollaf
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Clases.Interfaz;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Elmer Gustavo
 */
public class Login extends JFrame {
    private JPanel panel = new JPanel();
    private Component confirmation;
    private String Usuario,Password;
    private JTextField TextUsuario = new JTextField("Usuario");
    private JPasswordField contra;
    
    public Login() {
        setTitle("Login");
        setSize(600, 600);
        setLocation(500, 500);
        setLocationRelativeTo(null);
        
        
        InitComponents();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void InitComponents(){
        this.getContentPane().add(panel);
        panel.setLayout(null);
        
        Etiqueta();
        CajaTexto();
        Boton();
        fondo();
        
    }
    
    private void Etiqueta(){
        ImageIcon imagen2 = new ImageIcon("perfil.png");
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setBounds(210, 40, 150, 150);
        etiqueta2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(150, 150,Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);
        
        //imagen de usuario
        ImageIcon imagen3 = new ImageIcon("usuario.png");
        JLabel etiqueta3 = new JLabel();
        etiqueta3.setBounds(140,250, 20, 20);
        etiqueta3.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(20, 20,Image.SCALE_SMOOTH)));
        panel.add(etiqueta3);
        //imagen de contraseña
        
        ImageIcon imagen4 = new ImageIcon("contraseña.png");
        JLabel etiqueta4 = new JLabel();
        etiqueta4.setBounds(140,300, 20, 20);
        etiqueta4.setIcon(new ImageIcon(imagen4.getImage().getScaledInstance(20, 20,Image.SCALE_SMOOTH)));
        panel.add(etiqueta4);
        
        //Registrarse
        JLabel registrar = new JLabel("Registrarse");
        registrar.setBounds(310, 330, 90, 15);
        registrar.setForeground(Color.RED);
        panel.add(registrar);
        
    }
    
    private void fondo(){
        ImageIcon imagen = new ImageIcon("login.jpg");
        JLabel etiqueta = new JLabel();
        etiqueta.setBounds(0, 0,600,600);
        etiqueta.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH)));
        panel.add(etiqueta);
    }
    
    private void CajaTexto(){
        //caja de usuario
        
        TextUsuario.setBounds(180,240,200, 30);
        panel.add(TextUsuario);
        
        //caja de contraseña
        contra = new JPasswordField("Contraseña");
        contra.setBounds(180,290,200, 30);
        panel.add(contra);
        
    }
    
    public void datos(String us, String pas){
        Usuario = "Admin";
        Password = "admin";
    }
    
    private void Boton(){
        JButton boton = new JButton("Iniciar Sesión");
        //ImageIcon botonImage = new ImageIcon("botn.png");
        boton.setToolTipText("Boton de pulsacion");
        boton.setBackground(Color.BLACK);
        //boton.setFont(new Font("cooper black", 1,11));
        boton.setForeground(Color.WHITE);
        boton.setBounds(190, 380, 180, 50);
        //boton.setIcon(new ImageIcon(botonImage.getImage().getScaledInstance(110, 60,Image.SCALE_SMOOTH)));
        panel.add(boton);
        
        ActionListener oyenteAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                datos(Usuario,Password);
                if(Usuario.equals(TextUsuario.getText()) && Password.equals(contra.getText())){
                    Interfaz st = new Interfaz();
                    st.setVisible(true);
                    dispose();
                }else if(TextUsuario.getText().equals("") && contra.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Usuario y Contraseña estan Vacios \nIngresar los datos");
                    TextUsuario.setFocusable(true);
                }else if(TextUsuario.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Usuario está vacio");
                    TextUsuario.setFocusable(true);
                }else if(contra.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Contraseña está vacio");
                    contra.setFocusable(true);
                }else if(TextUsuario.getText().compareTo(Usuario)!=0 && contra.getText().compareTo(Password)!=0){
                    JOptionPane.showMessageDialog(null,"Usuario y/o Contraseña no Válidos \nIngresar nuevamente");
                    TextUsuario.setFocusable(true);
                }else if(TextUsuario.getText().compareTo(Usuario)!=0){
                    JOptionPane.showMessageDialog(null,"Usuario no Válido \nIngresar nuevamente");
                    TextUsuario.setFocusable(true);
                }else if(contra.getText().compareTo(Password)!=0){
                    JOptionPane.showMessageDialog(null,"Contraseña no Válido\nIngresar nuevamente");
                    contra.setFocusable(true);
                }
            }
        };
        
        boton.addActionListener(oyenteAccion);
        
        //boton cancelar
        JButton salir = new JButton("Cancelar");
        salir.setToolTipText("Boton de pulsacion");
        salir.setBackground(Color.BLACK);
        //boton.setFont(new Font("cooper black", 1,11));
        salir.setForeground(Color.WHITE);
        salir.setBounds(190, 450, 180, 50);
        panel.add(salir);
        
        ActionListener OyenteSalir = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                Object[] opciones = {"SI","NO"};
                int eleccion = JOptionPane.showOptionDialog(confirmation, "Desea Salir?","Confirmación",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
                if(eleccion == JOptionPane.YES_NO_CANCEL_OPTION){
                    
                }else{
                    System.exit(0);
                }
            }
            
        };
        salir.addActionListener(OyenteSalir);
    }
}

