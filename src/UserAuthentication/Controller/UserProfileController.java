package UserAuthentication.Controller;

import UserAuthentication.Model.User;
import UserAuthentication.View.UserProfileView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserProfileController implements ActionListener {
    private User user;
    private UserProfileView view;

    public UserProfileController(User user) {
        this.user = user;
        this.view = new UserProfileView(this);
        view.displayData(user);
//        view.addChangeButtonListener(new ChangeButtonListener());
    }
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton)e.getSource();

            if(source.equals(view.getChangeBtn())){
                System.out.println("Change something!");
            }
        }
//        public void actionPerformed(ActionEvent e) {
//            // Open the Change Subscription window
//            SwingUtilities.invokeLater(() -> {
//                ChangeSubscriptionController changeSub = new ChangeSubscriptionController();
//                JFrame subFrame = new JFrame("Change Subscription");
//                subFrame.setContentPane(changeSub.getMainPanel());
//                subFrame.setSize(400, 300);
//                subFrame.setLocationRelativeTo(null); // Center the window
//                subFrame.setVisible(true);
//
//                // Add action for the "Change to Premium" button
//                changeSub.getChangeButton().addActionListener(evt -> {
//                    // Update the user subscription to Premium
//                    changeSub.setStatus("Premium");
//                    user.changeSubscriptionStatus("Premium");  // Update user model
//                    view.setStatus("Premium");  // Reflect this in UserProfileView
//
//                    // Close the Change Subscription window
//                    subFrame.dispose();
//
//                    // After clicking "Change to Premium", show the Add Payment form
//                    SwingUtilities.invokeLater(() -> {
//                        AddPaymentController addPaymentController = new AddPaymentController();
//                        JFrame paymentFrame = new JFrame("Add Payment Information");
//
//                        paymentFrame.setContentPane(addPaymentController.getMainPanel());
//                        paymentFrame.setSize(400, 300);
//                        paymentFrame.setLocationRelativeTo(null); // Center the window
//                        paymentFrame.setVisible(true);
//
//                        // Handle Save/Submit Button action
//                        addPaymentController.getSaveSubmitButton().addActionListener(evt2 -> {
//                            // Collect payment info
//                            String firstName = addPaymentController.getFirstName();
//                            String lastName = addPaymentController.getLastName();
//                            String creditCardNumber = addPaymentController.getCreditCardNumber();
//                            String expirationDate = addPaymentController.getExpirationDate();
//
//                            // Show confirmation message after entering payment info
//                            JOptionPane.showMessageDialog(paymentFrame, "Subscription changed to Premium!\nPayment information saved.\n"
//                                    + "First Name: " + firstName + "\n"
//                                    + "Credit Card: " + creditCardNumber + "\n"
//                                    + "Expiration Date: " + expirationDate);
//
//                            // Close the payment window after submission
//                            paymentFrame.dispose();
//                        });
//                    });
//                });
//            });
//        }




}

