package br.com.jrmae.contasmedicas.validators;

import java.io.PrintStream;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("passwordValidator")
public class PasswordValidator
        implements Validator {

    int num = 0;
    int carac = 0;
    char[] caracteresEspeciais = {'=', '|', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '{', '}', '[', ']', ';', ':', '.', ',', '<', '>', '?', '~', '+', '-', '_', '\'', '"'};

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if (value == null) {
            return;
        }

        String password = (String) value;

        for (int i = 0; i < password.length(); i++) {
            if ((password.charAt(i) >= '0') && (password.charAt(i) <= '9')) {
                this.num += 1;
            }
        }
        System.out.println("Foram encontrados " + this.num + " numeros na senha!");

        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < this.caracteresEspeciais.length; j++) {
                if (password.charAt(i) == this.caracteresEspeciais[j]) {
                    this.carac += 1;
                }
            }
        }
        System.out.println("Foram encontrados " + this.carac + " caracteres especias na senha!");

        if ((password == null) || (password.equals(""))) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "A senha não pode ser nula!", ""));
        }

        if ((this.carac <= 0) || (this.num <= 0)) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "A senha deve conter números, caracteres especiais e letras!", ""));
        }

        if (password.length() < 7) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "A senha deve ter no mínimo 7 caracteres!", ""));
        }
        if (password.length() >= 22) {
            throw new ValidatorException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "A senha deve ter no máximo 22 caracteres!!!", ""));
        }
    }
}
