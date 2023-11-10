package org.example;
import java.util.List;

public interface Builder<k, S>{
    PaoBuilder recheio(String r);

    k filling(String r);
    k sauce(List<String> m);
    k more (String m);

    S createdBread();
}

