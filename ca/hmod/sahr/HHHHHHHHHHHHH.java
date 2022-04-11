//Deobfuscated By Mouath#2221 | ????#2221 D:\Game\private 2\False"!

package ca.hmod.sahr;

import net.minecraft.client.*;
import java.io.*;

public class HHHHHHHHHHHHH
{
    private Minecraft mc;
    private File directory;
    private File cfg;
    
    public HHHHHHHHHHHHH() {
        this.mc = Minecraft.getMinecraft();
        this.directory = new File("AlSa7r");
        this.cfg = new File("AlSa7r/Config.cfg");
        if (!this.directory.exists()) {
            this.directory.mkdir();
        }
        try {
            if (!this.cfg.exists()) {
                this.cfg.createNewFile();
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void write(final File file, final String str) {
        try {
            if (file.exists()) {
                final FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write(str);
                fileWriter.close();
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public String read(final File file) {
        String string = "";
        try {
            if (file.exists()) {
                final BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    string = string + " " + line;
                }
                bufferedReader.close();
            }
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex2) {
            ex2.printStackTrace();
        }
        return string;
    }
}
