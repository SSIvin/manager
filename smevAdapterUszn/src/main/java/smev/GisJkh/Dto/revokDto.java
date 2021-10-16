package smev.GisJkh.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class revokDto {
    private UUID transportId;
    private UUID requestId;

}
