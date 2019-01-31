package edu.mrd.mgenerator.mailgeneratortemplateservice.repositories;

import edu.mrd.mgenerator.mailgeneratortemplateservice.entities.MailTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailTemplateRepository extends JpaRepository<MailTemplate, Long> {
    MailTemplate findByName(String name);
}
