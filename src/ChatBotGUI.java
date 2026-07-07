import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ChatBotGUI {

    private static JTextArea chatArea;
    private static JTextField inputField;

    public static void main(String[] args) {

        JFrame frame = new JFrame("AI Chatbot Assistant");

        frame.setSize(850, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // HEADER

        JLabel title = new JLabel(
                "AI CHATBOT ASSISTANT",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setOpaque(true);
        title.setBackground(new Color(135, 206, 250));
        title.setForeground(Color.BLACK);
        title.setPreferredSize(new Dimension(100, 60));

        // CHAT AREA

        chatArea = new JTextArea();

        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 16));
        chatArea.setBackground(new Color(230, 245, 255));
        chatArea.setForeground(Color.BLACK);

        JScrollPane scrollPane =
                new JScrollPane(chatArea);

        // INPUT FIELD

        inputField = new JTextField();

        inputField.setFont(
                new Font("Arial", Font.PLAIN, 16));

        inputField.setPreferredSize(
                new Dimension(100, 45));

        inputField.setBackground(Color.WHITE);
        inputField.setForeground(Color.BLACK);

        // SEND BUTTON

        JButton sendButton =
                new JButton("SEND");

        sendButton.setFont(
                new Font("Arial", Font.BOLD, 14));

        sendButton.setBackground(
                new Color(70, 130, 180));

        sendButton.setForeground(Color.WHITE);

        // CLEAR BUTTON

        JButton clearButton =
                new JButton("CLEAR");

        clearButton.setFont(
                new Font("Arial", Font.BOLD, 14));

        clearButton.setBackground(
                new Color(255, 99, 71));

        clearButton.setForeground(Color.WHITE);

        // BOTTOM PANEL

        JPanel bottomPanel =
                new JPanel(new BorderLayout());

        bottomPanel.setBackground(
                new Color(230, 245, 255));

        bottomPanel.add(
                clearButton,
                BorderLayout.WEST);

        bottomPanel.add(
                inputField,
                BorderLayout.CENTER);

        bottomPanel.add(
                sendButton,
                BorderLayout.EAST);

        // FRAME LAYOUT

        frame.setLayout(new BorderLayout());

        frame.add(title,
                BorderLayout.NORTH);

        frame.add(scrollPane,
                BorderLayout.CENTER);

        frame.add(bottomPanel,
                BorderLayout.SOUTH);

        // WELCOME MESSAGE

        chatArea.setText(
                "\n" +
                        "===============================================================================================================================================================================================\n" +
                        "                                                                                                                                          WELCOME TO AI CHATBOT\n" +
                        "===============================================================================================================================================================================================\n\n" +
                        "Bot: Hello! Ask me anything.\n\n"
        );

        // SEND BUTTON ACTION

        sendButton.addActionListener(
                e -> sendMessage());

        // ENTER KEY ACTION

        inputField.addActionListener(
                e -> sendMessage());

        // CLEAR BUTTON ACTION

        clearButton.addActionListener(e -> {

            chatArea.setText(
                    "\n" +
                            "==================================================\n" +
                            "              WELCOME TO AI CHATBOT\n" +
                            "==================================================\n\n" +
                            "Bot: Hello! Ask me anything.\n\n"
            );

        });

        frame.setVisible(true);
    }

    private static void sendMessage() {

        String userInput =
                inputField.getText().trim();

        if (userInput.isEmpty()) {
            return;
        }

        String time =
                LocalTime.now().format(
                        DateTimeFormatter.ofPattern(
                                "HH:mm"));

        // USER MESSAGE

        chatArea.append(
                "You [" + time + "] : "
                        + userInput + "\n");

        // BOT RESPONSE

        String response =
                ChatBot.getResponse(userInput);

        chatArea.append(
                "Bot [" + time + "] : "
                        + response + "\n\n");

        // SAVE CHAT

        saveChat(
                "You [" + time + "] : "
                        + userInput + "\n");

        saveChat(
                "Bot [" + time + "] : "
                        + response + "\n\n");

        inputField.setText("");

        // AUTO SCROLL

        chatArea.setCaretPosition(
                chatArea.getDocument()
                        .getLength());
    }

    private static void saveChat(String text) {

        try {

            FileWriter writer =
                    new FileWriter(
                            "chat_history.txt",
                            true);

            writer.write(text);

            writer.close();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}