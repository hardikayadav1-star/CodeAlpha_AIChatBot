import java.util.Map;

public class ChatBot {

    private static final Map<String, String> knowledgeBase =
            FAQData.getData();

    public static String getResponse(String input) {

        input = input.toLowerCase().trim();
        input = input.replaceAll("[^a-zA-Z ]", "");

        for (String key : knowledgeBase.keySet()) {

            if (input.contains(key)) {
                return knowledgeBase.get(key);
            }
        }

        return "Sorry, I don't understand that question.Ask another question";
    }
}