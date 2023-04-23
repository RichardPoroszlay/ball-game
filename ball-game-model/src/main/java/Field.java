import lombok.Data;

@Data
public class Field {
    private boolean finish;
    private boolean wallTop;
    private boolean wallBottom;
    private boolean wallLeft;
    private boolean wallRight;

    public boolean isFinish() {
        return this.finish;
    }

    public boolean hasWallTop() {
        return this.wallTop;
    }

    public boolean hasWallBottom() {
        return this.wallBottom;
    }

    public boolean hasWallLeft() {
        return this.wallLeft;
    }

    public boolean hasWallRight() {
        return this.wallRight;
    }
}
