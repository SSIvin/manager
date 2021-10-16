package smev.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import smev.Enum.InteractionDirection;
import smev.Enum.InteractionType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleView {

    private InteractionDirection interactionDirection;
    private InteractionType interactionType;
}
