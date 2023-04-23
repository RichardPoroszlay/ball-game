import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Field {
    private boolean finish;
    private boolean wallTop;
    private boolean wallBottom;
    private boolean wallLeft;
    private boolean wallRight;

    public boolean isFinish() {
        return this.finish;
    }

    public boolean hasWall() {
        return this.wallTop || this.wallBottom || this.wallLeft || this.wallRight;
    }
}
