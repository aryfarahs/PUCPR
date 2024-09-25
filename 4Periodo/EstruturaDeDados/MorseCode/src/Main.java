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

    }
}