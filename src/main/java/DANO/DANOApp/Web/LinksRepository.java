package DANO.DANOApp.Web;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface LinksRepository extends CrudRepository<Links, Integer> {
    


    @Query(value="select * from links", nativeQuery=true)
    List<Links> getAllFromLink();


    @Query(value = "select * from links where url = :url", nativeQuery = true)
    List<Links> getOneFromLink(String url);

    @Modifying
    //@Query(value = "insert into links (url,aud_date) VALUES (:url,:aud_date)", nativeQuery = true)
    @Query(value = "CALL insert_links(:url,:aud_date,:contador)", nativeQuery = true)
    @Transactional
    void insertLink(@Param("url") String url, @Param("aud_date") Date aud_date, @Param("contador") Integer contador);


    @Modifying
    // @Query(value = "insert into links (url,aud_date) VALUES (:url,:aud_date)",
    // nativeQuery = true)
    @Query(value = "CALL update_links(:url,:aud_date,:contador)", nativeQuery = true)
    @Transactional
    void updateLink(@Param("url") String url, @Param("aud_date") Date aud_date, @Param("contador") Integer contador);
}
