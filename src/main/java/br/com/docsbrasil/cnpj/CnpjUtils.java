package br.com.docsbrasil.cnpj;

import java.text.ParseException;

public interface CnpjUtils {
    Boolean isValid(String cnpj);
    String format(String cnpj) throws ParseException;
}
