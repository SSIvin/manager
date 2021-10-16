package smev.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class PackageAttachment {

    private UUID idPackage;
    private String fileName;
}
