package mx.edu.utez.sda.captcha.controller;

import lombok.RequiredArgsConstructor;
import mx.edu.utez.sda.captcha.DTO.CaptchaResponse;
import mx.edu.utez.sda.captcha.Service.CaptchaService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST, RequestMethod.OPTIONS})
@RequestMapping("/api/captcha")
@RequiredArgsConstructor
public class CaptchaController {

    private final CaptchaService captchaService;

    @PostMapping("/verificar-captcha")
    public CaptchaResponse verificarCaptcha(@RequestParam("solution") String solution){
        return captchaService.verificarCaptcha(solution);
    }
}
