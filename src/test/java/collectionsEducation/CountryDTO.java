package collectionsEducation;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class CountryDTO {

    private String name;
    private String language;

}
