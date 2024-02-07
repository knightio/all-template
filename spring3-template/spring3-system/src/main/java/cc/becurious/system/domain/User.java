package cc.becurious.system.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    Long id;
    String name;
}
