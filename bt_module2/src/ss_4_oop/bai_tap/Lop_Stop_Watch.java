package ss_4_oop.bai_tap;

public class Lop_Stop_Watch {
    private String startTime;
    private String endTime;

    public Lop_Stop_Watch(){

    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public Lop_Stop_Watch(String startTime, String endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public String staert(){
        return startTime;
    }
    public void stop(){
        this.endTime = String.valueOf(System.currentTimeMillis());

    }

}
