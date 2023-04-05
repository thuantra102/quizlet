package com.example.demo.dto;

import com.example.demo.model.folder.Folder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class FolderDTO extends GeneralDTO{
    String nameFolderTopic;
    String descriptionFolderTopic;
    String userName;
    Long idUser;

    public FolderDTO(Folder folder) {
        this.setId(folder.getId());
        this.setTimeCreated(folder.getTimeCreated());
        this.nameFolderTopic = folder.getNameFolderTopic();
        this.descriptionFolderTopic = folder.getDescriptionFolderTopic();
        this.userName = folder.getUser().getUserName();
    }
}
