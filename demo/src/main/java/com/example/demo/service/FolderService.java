package com.example.demo.service;

import com.example.demo.converter.AbstractDTOConverter;
import com.example.demo.dto.DetailUnitDTO;
import com.example.demo.dto.FolderDTO;
import com.example.demo.model.folder.Folder;
import com.example.demo.model.unit.DetailUnit;
import com.example.demo.repository.GeneralRepository;
import org.springframework.stereotype.Service;

@Service
public class FolderService extends AbstractCRUDService<Folder, FolderDTO> {
    public FolderService(GeneralRepository<Folder> repository, AbstractDTOConverter<Folder, FolderDTO> converter) {
        super(repository, converter);
    }

    @Override
    public Folder updateEntity(Folder folder, FolderDTO folderDTO) {
        return new Folder(folderDTO);
    }
}
