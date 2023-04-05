package com.example.demo.controller;

import com.example.demo.api.AbstractCRUDApi;
import com.example.demo.dto.FolderDTO;
import com.example.demo.model.folder.Folder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/folder")
public class FolderController extends AbstractCRUDController<Folder, FolderDTO> {
    public FolderController(AbstractCRUDApi<Folder, FolderDTO> api) {
        super(api);
    }
}
