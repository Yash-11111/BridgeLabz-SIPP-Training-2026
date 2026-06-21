import java.io.*;

public class SchoolResultPortal {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("students.txt"));

            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("report.txt", true)); // append mode

            String line;

            while ((line = br.readLine()) != null) {
                String data[] = line.split(" ");

                String name = data[0];
                int m1 = Integer.parseInt(data[1]);
                int m2 = Integer.parseInt(data[2]);
                int m3 = Integer.parseInt(data[3]);

                double avg = (m1 + m2 + m3) / 3.0;

                bw.write(name + " Average = " + avg);
                bw.newLine();
            }

            br.close();
            bw.close();

            System.out.println("Report generated successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Student file not found.");
        } catch (IOException e) {
            System.out.println("Error while processing file.");
        }
    }
}