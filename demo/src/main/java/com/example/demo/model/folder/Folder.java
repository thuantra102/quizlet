package com.example.demo.model.folder;

import com.example.demo.dto.FolderDTO;
import com.example.demo.model.account.User;
import com.example.demo.model.GeneralEntity;
import lombok.*;
import javax.persistence.*;


@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Folder extends GeneralEntity {
    String nameFolderTopic;
    String descriptionFolderTopic;
    @ManyToOne
    @JoinColumn(name = "id_user", nullable = false)
    User user;


    public Folder(FolderDTO folderDTO) {
        this.setId(folderDTO.getId() == null ? null : folderDTO.getId());
        this.setTimeCreated(folderDTO.getTimeCreated());
        this.nameFolderTopic = folderDTO.getNameFolderTopic();
        this.descriptionFolderTopic = folderDTO.getDescriptionFolderTopic();
        this.user = new User(folderDTO.getIdUser());
    }
}
