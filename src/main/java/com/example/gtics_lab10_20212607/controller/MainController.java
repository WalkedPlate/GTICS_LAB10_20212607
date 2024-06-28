package com.example.gtics_lab10_20212607.controller;

import com.example.gtics_lab10_20212607.entity.Imagen;
import com.example.gtics_lab10_20212607.repository.ImagenRepository;
import com.example.gtics_lab10_20212607.repository.TableroRepository;
import jakarta.servlet.http.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    ImagenRepository imagenRepository;
    @Autowired
    TableroRepository tableroRepository;

    @GetMapping("/game")
    public String game(){
        return "index";
    }
    @PostMapping(value = "/guardarImagen")
    public ResponseEntity<String> guardarImagen(Part file) {

        try {
            String contentType = file.getContentType();
            InputStream inputStream = file.getInputStream();
            byte[] bytes = inputStream.readAllBytes();
            Imagen imagen = new Imagen();
            imagen.setImagen(bytes);
            imagen.setNombre(file.getName());
            imagenRepository.save(imagen);

            return ResponseEntity.ok("Guardada correctamente.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error al guardar la imagen: " + e.getMessage());
        }
    }

    @GetMapping("/listImagenes")
    public List<Imagen> getImagenes() {
        return imagenRepository.findAll();
    }









}
