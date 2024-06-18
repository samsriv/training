public class June12D {
    private int maxMarks;
    private int minMarks;

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(int maxMarks) {
        if(maxMarks>100){
            System.out.println("Max marks should not be more than 100");
            this.maxMarks = 100;
        }else {
            this.maxMarks = maxMarks;
        }

    }

    public int getMinMarks() {
        return minMarks;
    }

    public void setMinMarks(int minMarks) {
        this.minMarks = minMarks;
    }
}
