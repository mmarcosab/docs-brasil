package br.com.docsbrasil.cpf;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;


public class CpfUtilsImpl implements CpfUtils {

    @Override
    public Boolean isValid(String cpf) {

        return null;
    }

    @Override
    public String format(String cpf) throws ParseException {
        MaskFormatter mask=new MaskFormatter("###.###.###-##");
        return mask.valueToString(cpf);
    }
}
