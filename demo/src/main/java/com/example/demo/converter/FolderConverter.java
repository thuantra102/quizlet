package com.example.demo.converter;

import com.example.demo.dto.FolderDTO;
import com.example.demo.model.folder.Folder;
import org.springframework.stereotype.Component;

@Component
public class FolderConverter implements AbstractDTOConverter<Folder, FolderDTO> {
    @Override
    public FolderDTO convertDetail(Folder folder) {
        return new FolderDTO(folder);
    }
}
