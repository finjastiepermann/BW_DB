package model.persistence;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.*;


import java.sql.Date;

@Entity
@Getter
@Setter
public class Boardgame {

    @Value("name=id")
    long id;

    @Value("name=titel")
    String title;

    @Value("name=yearpublished")
    Date yearpublished;

    @Value("name=minplayers")
    Integer minplayers;

    @Value("name=maxplayers")
    Integer maxplayers;
}
