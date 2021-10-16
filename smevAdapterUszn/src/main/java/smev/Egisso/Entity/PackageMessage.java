package smev.Egisso.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@AllArgsConstructor
@Data
public class PackageMessage {
    private UUID messageId;
    private UUID packageId;
    private LocalDateTime createDate;

    public PackageMessage() {
    }
}
