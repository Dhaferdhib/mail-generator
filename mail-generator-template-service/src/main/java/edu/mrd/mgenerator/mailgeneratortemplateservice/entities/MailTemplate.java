package edu.mrd.mgenerator.mailgeneratortemplateservice.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailTemplate {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Lob
    private String body;
}
