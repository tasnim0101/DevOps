package com.example.tpfoyer;


import com.example.tpfoyer.Repository.EtudiantRepository;
import com.example.tpfoyer.Services.EtudiantServiceImpl;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
public class EtudiantServiceImlpMock {
    @Mock
    EtudiantRepository etudiantRepository;
    @InjectMocks
    EtudiantServiceImpl etudiantService;


}
