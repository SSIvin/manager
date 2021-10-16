package smev.FRI.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smev.FRI.Enum.StateOrdering;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderingEntity {

    private UUID idOrdering;
    private UUID interactionId;
    private String snils;
    private StateOrdering state;
    private LocalDateTime changeDate;
}

