package com.stackroute.gipherrecommendersystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.CONFLICT, reason = "GIF already exists!")
public class GifAlreadyExistsException extends Exception {
}
