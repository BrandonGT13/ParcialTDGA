package com.example.Movimiento.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.example.Movimiento.dto.ErrorDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    
     @ExceptionHandler(NotFound.class)
    public ResponseEntity<Object> handleResourceNotFound(NotFound ex, WebRequest request) {
        log.warn("Recurso no encontrado: {}", ex.getMessage());

        ErrorDTO error = ErrorDTO.builder()
                .timestamp(LocalDateTime.now())
                .message(ex.getMessage())
                .status(HttpStatus.NOT_FOUND.value())
                .build();

        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequest.class)
    public ResponseEntity<ErrorDTO> handleBadRequest(BadRequest ex) {
        log.warn("Error de solicitud: {}", ex.getMessage());
        ErrorDTO error = ErrorDTO.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .timestamp(LocalDateTime.now())
                .message(ex.getMessage())
                .build();
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
