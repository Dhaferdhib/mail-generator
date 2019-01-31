package edu.mrd.mgenerator.mailgeneratortemplateservice.controllers;

import edu.mrd.mgenerator.mailgeneratortemplateservice.entities.MailTemplate;
import edu.mrd.mgenerator.mailgeneratortemplateservice.repositories.MailTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/mail-template")
public class MailTemplateController {

    private MailTemplateRepository mailTemplateRepository;

    @Autowired
    public MailTemplateController(MailTemplateRepository mailTemplateRepository) {
        this.mailTemplateRepository = mailTemplateRepository;
    }

    @PostMapping
    public ResponseEntity addMailTemplate(@RequestBody MailTemplate mailTemplate) {
        mailTemplateRepository.save(mailTemplate);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getMailTemplateById(@PathVariable Long id) {
        Optional<MailTemplate> optionalMailTemplate = mailTemplateRepository.findById(id);
        return optionalMailTemplate.isPresent() ?
                new ResponseEntity<>(optionalMailTemplate.get(), HttpStatus.OK) : new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteMailTemplateById(@PathVariable Long id) {
        Optional<MailTemplate> optionalMailTemplate = mailTemplateRepository.findById(id);
        optionalMailTemplate.ifPresent(mailTemplate -> {
           mailTemplateRepository.delete(mailTemplate);
        });
        return optionalMailTemplate.isPresent() ?
                new ResponseEntity<>(optionalMailTemplate.get(), HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/all")
    public ResponseEntity getAllMailTemplates() {
        List<MailTemplate> mailTemplateList = mailTemplateRepository.findAll();
        return new ResponseEntity<>(mailTemplateList, HttpStatus.OK);
    }

}
