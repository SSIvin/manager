package smev.ElementServices.PFR_KSZN;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
abstract class Person {
    private Integer id;
    private Integer numZapis;
    private String snils;
    private String firstName;
    private String lastName;
    private String secName;
    private LocalDate bithdate;
    private LocalDate srokS;
    private LocalDate srokPo;
    private LocalDateTime createDate;
    private LocalDateTime changeDate;
}
