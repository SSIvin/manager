package smev.Egisso.Elements.ElementsNazn;

import lombok.AllArgsConstructor;
import lombok.Data;
import smev.Egisso.Enum.TypeFile;

import java.io.File;

@Data
@AllArgsConstructor
public class NaznFile {

    private File file;
    private TypeFile typeFile;
    private String fileID;
    private String fileName;

}
