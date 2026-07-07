import java.util.HashMap;
import java.util.Map;

public class FAQData {

    public static Map<String, String> getData() {

        Map<String, String> faq = new HashMap<>();

        // Greetings
        faq.put("hello", "Hello! How can I help you?");
        faq.put("hi", "Hi! Nice to meet you.");
        faq.put("hey", "Hey! How are you?");
        faq.put("good morning", "Good Morning! Have a great day.");
        faq.put("good afternoon", "Good Afternoon!");
        faq.put("good evening", "Good Evening!");
        faq.put("how are you", "I am doing great. Thanks for asking.");
        faq.put("what is your name", "My name is AI Chatbot.");
        faq.put("who are you", "I am an AI Chatbot developed using Java.");
        faq.put("what can you do", "I can answer questions and provide information.");
        faq.put("thank you", "You're welcome!");
        faq.put("thanks", "Glad I could help.");
        faq.put("bye", "Goodbye! Have a nice day.");
        faq.put("see you", "See you again soon.");

        // AI & ML
        faq.put("what is ai", "AI stands for Artificial Intelligence.");
        faq.put("what is machine learning", "Machine Learning allows systems to learn from data.");
        faq.put("what is deep learning", "Deep Learning is a subset of Machine Learning.");
        faq.put("what is nlp", "NLP stands for Natural Language Processing.");
        faq.put("what is data science", "Data Science extracts insights from data.");
        faq.put("what is chatbot", "A chatbot is software that interacts with users.");
        faq.put("what is neural network", "A neural network is inspired by the human brain.");
        faq.put("what is computer vision", "Computer Vision helps computers understand images.");
        faq.put("what is generative ai", "Generative AI creates content such as text and images.");

        // Programming
        faq.put("what is java", "Java is an object-oriented programming language.");
        faq.put("what is python", "Python is a popular programming language.");
        faq.put("what is c", "C is a powerful programming language.");
        faq.put("what is c plus plus", "C++ is an object-oriented version of C.");
        faq.put("what is programming", "Programming means writing instructions for computers.");
        faq.put("what is oop", "OOP stands for Object Oriented Programming.");
        faq.put("what is inheritance", "Inheritance allows a class to acquire properties of another class.");
        faq.put("what is polymorphism", "Polymorphism allows methods to behave differently.");
        faq.put("what is encapsulation", "Encapsulation hides implementation details.");
        faq.put("what is abstraction", "Abstraction shows essential details and hides complexity.");

        // Web Development
        faq.put("what is html", "HTML is used to structure web pages.");
        faq.put("what is css", "CSS is used to style web pages.");
        faq.put("what is javascript", "JavaScript adds interactivity to web pages.");
        faq.put("what is react", "React is a JavaScript library for building user interfaces.");
        faq.put("what is bootstrap", "Bootstrap is a CSS framework.");
        faq.put("what is node js", "Node.js allows JavaScript to run on servers.");
        faq.put("what is api", "API stands for Application Programming Interface.");

        // Database
        faq.put("what is database", "A database stores and manages information.");
        faq.put("what is sql", "SQL is used to manage databases.");
        faq.put("what is mysql", "MySQL is a relational database management system.");
        faq.put("what is mongodb", "MongoDB is a NoSQL database.");
        faq.put("what is primary key", "A primary key uniquely identifies a record.");
        faq.put("what is foreign key", "A foreign key links tables together.");

        // Git & GitHub
        faq.put("what is git", "Git is a version control system.");
        faq.put("what is github", "GitHub is a platform for hosting code.");
        faq.put("what is repository", "A repository stores project files.");
        faq.put("what is commit", "A commit saves changes in Git.");
        faq.put("what is branch", "A branch is an independent development line.");
        faq.put("what is merge", "Merge combines changes from different branches.");

        // Computer Basics
        faq.put("what is computer", "A computer is an electronic device that processes data.");
        faq.put("what is operating system", "An operating system manages hardware and software.");
        faq.put("what is windows", "Windows is an operating system by Microsoft.");
        faq.put("what is linux", "Linux is an open-source operating system.");
        faq.put("what is ram", "RAM is temporary memory used by applications.");
        faq.put("what is cpu", "CPU is the brain of the computer.");
        faq.put("what is gpu", "GPU handles graphics and AI processing.");

        // Networking
        faq.put("what is internet", "The Internet is a global network.");
        faq.put("what is wifi", "WiFi allows wireless internet connectivity.");
        faq.put("what is ip address", "An IP address identifies a device on a network.");
        faq.put("what is cloud computing", "Cloud computing delivers services over the internet.");
        faq.put("what is cybersecurity", "Cybersecurity protects systems from digital threats.");

        // Java Technologies
        faq.put("what is spring boot", "Spring Boot is a framework for Java applications.");
        faq.put("what is jdbc", "JDBC connects Java applications with databases.");
        faq.put("what is servlet", "Servlets handle web requests in Java.");
        faq.put("what is jsp", "JSP is used for dynamic web pages.");

        // Internship
        faq.put("what is codealpha", "CodeAlpha provides internship opportunities.");
        faq.put("what is internship", "An internship provides practical experience.");
        faq.put("what is project", "A project is an application developed to solve a problem.");

        // Fun
        faq.put("tell me a joke", "Why do programmers prefer dark mode? Because light attracts bugs!");
        faq.put("tell me another joke", "Debugging is like being a detective in a crime movie where you are also the criminal.");
        faq.put("motivate me", "Success comes from consistent effort. Keep learning!");
        faq.put("give me a quote", "The best way to predict the future is to create it.");

        // General Knowledge
        faq.put("who is albert einstein", "Albert Einstein was a famous physicist.");
        faq.put("who is apj abdul kalam", "Dr. APJ Abdul Kalam was a scientist and former President of India.");
        faq.put("what is india", "India is a country in South Asia.");
        faq.put("what is delhi", "Delhi is the capital of India.");
        faq.put("what is taj mahal", "The Taj Mahal is a famous monument in Agra.");
        faq.put("what is cricket", "Cricket is a popular bat-and-ball sport.");
        faq.put("what is football", "Football is one of the most popular sports in the world.");

        return faq;
    }
}