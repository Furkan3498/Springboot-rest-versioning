package versioning.with.spring.boot.and.rest.api.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductV2 {

        private String name;
        private BigDecimal price ;

}
