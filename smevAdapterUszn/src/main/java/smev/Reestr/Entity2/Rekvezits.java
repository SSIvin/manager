package smev.Reestr.Entity2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * T_D_REKVEZITS
 * @author
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Rekvezits implements Serializable {

    private Short idRegion;
    private String fullName;
    private String shortName;

    private static final long serialVersionUID = 1L;
}
