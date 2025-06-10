package dev.yp.try_springboot.run;

import java.time.LocalDateTime;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import org.springframework.data.annotation.Version;

public record Run (
        Integer id,
        @NotEmpty String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        @Positive Integer miles,
        Location location,
        @Version
        Integer version
){
    public Run {
        if(!completedOn.isAfter(startedOn)){
            throw new IllegalArgumentException("Complete On must be after Started On");
        }
    }
}
