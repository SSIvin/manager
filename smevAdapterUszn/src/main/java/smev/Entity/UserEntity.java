package smev.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    private Integer id;
    private String userName;
    private String password;
    private String fioUser;
    private String keystoreAlias;
    private String keystorePassword;
    private LocalDateTime discontinueDate;
    private LocalDateTime creationDate;
    private LocalDateTime changeDate;
    private boolean blocked;
    private Integer idRegion;
    private Set<RoleEntity> roles = new HashSet<>();
    private Set<RoleView> roleView = new HashSet<>();

}

