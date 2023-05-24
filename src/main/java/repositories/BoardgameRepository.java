package repositories;

import model.persistence.Boardgame;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BoardgameRepository extends JpaRepository<Boardgame, Long> {

    @Query("SELECT g FROM boardgame g WHERE g.id = :id")
    Optional<Boardgame> getGame(Long id);
}
