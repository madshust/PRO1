package Opgave3;

public class Player {
    private String name;
    private int age;
    private int score;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
        this.score = 0;
    }

    @Override
    public String toString() {
        return "Player(" + name +
                ", age = " + age +
                ", score = " + score
                + ")";
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
