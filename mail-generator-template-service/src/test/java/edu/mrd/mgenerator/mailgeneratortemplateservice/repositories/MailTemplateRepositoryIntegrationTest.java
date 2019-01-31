package edu.mrd.mgenerator.mailgeneratortemplateservice.repositories;

import edu.mrd.mgenerator.mailgeneratortemplateservice.entities.MailTemplate;
import org.hibernate.exception.ConstraintViolationException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MailTemplateRepositoryIntegrationTest {
    @Autowired
    private MailTemplateRepository mailTemplateRepository;

    @Test
    public void whenFindByName_thenReturns(){
        String nameMock = "first";
        //given
        MailTemplate providedMailTemplate = new MailTemplate(2L, nameMock," all");
        mailTemplateRepository.save(providedMailTemplate);

        //when
        int elementSize = mailTemplateRepository.findAll().size();
        MailTemplate receivedMailTemplate = mailTemplateRepository.findByName(nameMock);

        //then
        Assert.assertEquals(elementSize, 1);
        Assert.assertNotNull(receivedMailTemplate);

    }
}
