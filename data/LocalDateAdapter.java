package data;

import utils.Utils;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
    @Override
    public LocalDate unmarshal(String v) {
        return LocalDate.parse(v, Utils.dateTimeFormatter);
    }

    @Override
    public String marshal(LocalDate v) {
        return v.format(Utils.dateTimeFormatter);
    }
}
