package ballgame.result;

import lombok.*;

import java.time.ZonedDateTime;

/**
 * This class describes the properties of a player, who played the game.
 *
 * @author Richard Poroszlay
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GameResult {

    @NonNull private String playerName;
    private boolean solved;
    private int steps;
    @NonNull private ZonedDateTime created;

}
