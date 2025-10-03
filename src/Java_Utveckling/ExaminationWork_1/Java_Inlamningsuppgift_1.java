package Java_Utveckling.ExaminationWork_1;
import javax.swing.JOptionPane;

public class Java_Inlamningsuppgift_1 {
    public static void main(String[] arg) {

        double width = Double.parseDouble(JOptionPane.showInputDialog(null, "How wide is the window?"));
        double height = Double.parseDouble(JOptionPane.showInputDialog(null, "How high is the window"));
        double windowCost = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the price per kr/m²?"));

        double cost = (width * height * windowCost);

        long costBeforeDiscount = Math.round(cost);//För att få talet att runda upp så använde jag Math.round, annars blev det 1.5*1.2*1000 = 1799.9999999999998 ist. för 1800

        System.out.println(cost);

        if (cost > 5000) {
            cost = cost * 0.75;
        } else if (cost > 2500) {
            cost = cost * 0.9;
        } else if (cost > 1500) {
            cost = cost * 0.95;
        }

        JOptionPane.showMessageDialog(null, "Width: " + width +
                "\nHeight: " + height +
                "\nPrice per kr/m²: " + windowCost +
                "\nCost before discount: " + costBeforeDiscount +
                "\nCost with discount: " + Math.round(cost));
    }
}

