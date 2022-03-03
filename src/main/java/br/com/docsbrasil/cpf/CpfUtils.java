package br.com.docsbrasil.cpf;

import java.text.ParseException;

public interface CpfUtils {
    Boolean isValid(String cpf);
    String format(String cpf) throws ParseException;
}
