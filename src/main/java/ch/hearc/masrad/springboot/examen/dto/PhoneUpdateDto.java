package ch.hearc.masrad.springboot.examen.dto;

import ch.hearc.masrad.springboot.examen.entity.Consumer;
import ch.hearc.masrad.springboot.examen.entity.Phone;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.DeleteMapping;

@Getter
@Setter
@AllArgsConstructor
public class PhoneUpdateDto {

    private String manufacturer;
    private String model;


    public Phone toEntity(Phone phone) {
        return new Phone(manufacturer, model);
    }

}
