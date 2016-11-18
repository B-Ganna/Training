package go_it_ex.webinar10;


import java.io.*;

public class DataApp {
    public static void main(String[] args) throws IOException {
        DataInputStream in = null;

        try {
            DataOutputStream out = new DataOutputStream((new BufferedOutputStream(new FileOutputStream(Data.dataFile))));
            for (int i = 0; i < Data.prices.length; i++) {
                out.writeDouble(Data.prices[i]);
                out.writeInt(Data.units[i]);
                out.writeUTF(Data.descs[i]);
            }
            out.close();

            in = new DataInputStream(new BufferedInputStream(new FileInputStream(Data.dataFile)));
            while (true) {
                double price = in.readDouble();
                int unit = in.readInt();
                String desc = in.readUTF();
                System.out.printf("You ordered %d units of %s at $%.2f%n", unit, desc, price);
            }

        } catch (EOFException e) {
            System.out.println("Reached end of file");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
