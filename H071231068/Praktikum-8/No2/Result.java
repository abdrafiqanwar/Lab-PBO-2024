package TP8.No2;

public class Result {
    private String name;
    private long finishTime;

    public Result(String name, long finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public long getFinishTime() {
        return finishTime;
    }
}