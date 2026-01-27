package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Daemon extends Character {

    public Daemon(String filePath) throws IOException {
        super("", 0, 0, 0);
        loadDaemon(filePath);
    }

    private void loadDaemon(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        this.name = br.readLine();
        this.hp   = Integer.parseInt(br.readLine());
        this.at   = Integer.parseInt(br.readLine());
        this.sp   = Integer.parseInt(br.readLine());
        br.close();
    }
}