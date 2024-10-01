import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        MorseTree tree = new MorseTree();

        String[][] morseArray = {
                {".-", "A"}, {"-...", "B"}, {"-.-.", "C"}, {"-..", "D"}, {".", "E"},
                {"..-.", "F"}, {"--.", "G"}, {"....", "H"}, {"..", "I"}, {".---", "J"},
                {"-.-", "K"}, {".-..", "L"}, {"--", "M"}, {"-.", "N"}, {"---", "O"},
                {".--.", "P"}, {"--.-", "Q"}, {".-.", "R"}, {"...", "S"}, {"-", "T"},
                {"..-", "U"}, {"...-", "V"}, {".--", "W"}, {"-..-", "X"}, {"-.--", "Y"},
                {"--..", "Z"}
        };

        for (String[] pair : morseArray) {
            tree.insert(pair[0], pair[1]);
        }

        tree.translate(".- .-. -.-- / ..-. . .-.. .. .--. .");
        tree.translate("-... .- .-. -... .- .-. .- / - .. .--. .--. .-");
        tree.translate("-.-. .- .-. --- .-.. / .- ... ... .. ...");

        JFrame frame = new JFrame("Morse Tree Visualization");
        MorseTreeGUI panel = new MorseTreeGUI(tree);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(panel);
        frame.setVisible(true);


    }
}