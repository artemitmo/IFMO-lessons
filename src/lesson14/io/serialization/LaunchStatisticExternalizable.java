package lesson14.io.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.time.LocalDateTime;

public class LaunchStatisticExternalizable implements Externalizable {
    private int launchCount;
    private LocalDateTime lastLaunch;
    private static final long serialVersionUID = 1L;
    private static final int VERSION = 1;

    private String user;

    public boolean isFirstLaunch(){
        return launchCount == 0 && lastLaunch == null;
    }

    public void update(){
        launchCount++;
        lastLaunch = LocalDateTime.now();
        user = System.getProperty("user.name");
    }

    @Override
    public String toString() {
        return "LaunchStatisticExternalizable{" +
                "launchCount=" + launchCount +
                ", lastLaunch=" + lastLaunch +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(VERSION);
        out.writeInt(launchCount);
        out.writeObject(lastLaunch);
        out.writeUTF(user);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        int version = in.readInt();
        if (version > VERSION) throw new IOException("Версия не поддерживается");
        launchCount = in.readInt();
        lastLaunch = (LocalDateTime) in.readObject();
        if (version > 0) {
            user = in.readUTF();
        }
    }

}
