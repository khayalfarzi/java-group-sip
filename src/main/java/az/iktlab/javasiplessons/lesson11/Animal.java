package az.iktlab.javasiplessons.lesson11;

public class Animal implements Alive {

    private String nickName;
    private int trickLevel;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    @Override
    public void run() {
        System.out.println("Animal is running");
    }
}
