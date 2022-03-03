package br.com.docsbrasil.cnpj;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;


public class CnpjUtilsImpl implements CnpjUtils {

    @Override
    public Boolean isValid(String cnpj) {

        return null;
    }

    @Override
    public String format(String cnpj) throws ParseException {
        MaskFormatter mask=new MaskFormatter("###.###.###-##");
        return mask.valueToString(cnpj);
    }
}
