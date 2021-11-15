package advanced.switchtothesun.domain.attraction;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AttractionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Attraction> getAllAttractions() {
        return entityManager.createQuery("select a from Attraction a ", Attraction.class)
                .getResultList();
    }

    public List<Attraction> findAttractionsOfType(String type) {
        return entityManager.createQuery("select a from Attraction a where a.type = :type", Attraction.class)
                .setParameter("type", type)
                .getResultList();
    }

    public List<Attraction> findAttractionsInCountry(String country) {
        //return jdbcTemplate.query("select a.name as attraction_name, c.name as country_name from attraction a join country c on a.FK_COUNTRY_ID = c.ID where c.NAME = ?", toAttractionMapper(), country);
        return null;
    }

}
