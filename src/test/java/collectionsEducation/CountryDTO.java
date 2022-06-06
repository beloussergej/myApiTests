package collectionsEducation;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class CountryDTO {

    private String name;
    private String language;

}
