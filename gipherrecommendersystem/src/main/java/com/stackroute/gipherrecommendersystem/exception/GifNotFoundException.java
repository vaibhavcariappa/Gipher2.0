package com.stackroute.gipherrecommendersystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND, reason = "GIF not found!")
public class GifNotFoundException extends Exception {
}
